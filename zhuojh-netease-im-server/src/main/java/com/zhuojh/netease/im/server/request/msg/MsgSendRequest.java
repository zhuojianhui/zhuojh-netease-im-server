/**
* Copyright (C) 2019, Thinkingbar.cn. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
*/

package com.zhuojh.netease.im.server.request.msg;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 发送普通消息请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:07:25
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送普通消息。<br>
 *              POST https://api.netease.im/nimserver/msg/sendMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述:给用户或者高级群发送普通消息，包括文本，图片，语音，视频和地理位置，具体消息参考下面描述<br>
 * 
 */
public class MsgSendRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/sendMsg.action";
	}

	/** from:发送者accid，用户帐号，最大32字符，必须保证一个APP内唯一. */
	private String from;

	/** ope:0：点对点个人消息，1：群消息（高级群），其他返回414. */
	private int ope;

	/** to:ope==0是表示accid即用户id，ope==1表示tid即群id. */
	private String to;

	/**
	 * type:0 表示文本消息, 1 表示图片， 2 表示语音， 3 表示视频， 4 表示地理位置信息， 6 表示文件，<br>
	 * 100 自定义消息类型（特别注意，对于未对接易盾反垃圾功能的应用，该类型的消息不会提交反垃圾系统检测）.
	 */
	private int type;

	/** body:请参考下方消息示例说明中对应消息的body字段，最大长度5000字符，为一个JSON串. */
	private MsgBody body;

	/**
	 * 对于对接了易盾反垃圾功能的应用，本消息是否需要指定经由易盾检测的内容（antispamCustom）。 <br>
	 * true或false, 默认false。 只对消息类型为：100 自定义消息类型 的消息生效。.
	 */
	private String antispam;

	/**
	 * antispamCustom:在antispam参数为true时生效。 自定义的反垃圾检测内容, JSON格式，长度限制同body字段，不能超过5000字符，要求antispamCustom格式如下：<br>
	 * {"type":1,"data":"custom content"} <br>
	 * 字段说明： 1. type: 1：文本，2：图片。 2. data: 文本内容or图片地址。
	 */
	private String antispamCustom;

	/**
	 * option:发消息时特殊指定的行为选项,JSON格式，可用于指定消息的漫游，存云端历史，发送方多端同步，推送，消息抄送等特殊行为;option中字段不填时表示默认值 ，option示例:<br>
	 * {"push":false,"roam":true,"history":false,"sendersync":true,"route":false,"badge":false,"needPushNick":true}<br>
	 * 字段说明： 1. roam: 该消息是否需要漫游，默认true（需要app开通漫游消息功能）；<br>
	 * 2. history: 该消息是否存云端历史，默认true；<br>
	 * 3. sendersync: 该消息是否需要发送方多端同步，默认true；<br>
	 * 4. push: 该消息是否需要APNS推送或安卓系统通知栏推送，默认true； <br>
	 * 5. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能);<br>
	 * 6. badge:该消息是否需要计入到未读计数中，默认true; <br>
	 * 7. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认true;<br>
	 * 8. persistent: 是否需要存离线消息，不设置该参数时默认true。.
	 */
	private String option;

	/** pushcontent:ios推送内容，不超过500字符，option选项中允许推送（push=true），此字段可以指定推送内容. */
	private String pushcontent;

	/** payload:ios 推送对应的payload,必须是JSON,不能超过2k字符. */
	private String payload;

	/** ext:开发者扩展字段，长度限制1024字符. */
	private String ext;

	/**
	 * forcepushlist:发送群消息时的强推（@操作）用户列表，格式为JSONArray，如["accid1","accid2"]。<br>
	 * 若forcepushall为true，则forcepushlist为除发送者外的所有有效群成员.
	 */
	private String forcepushlist;

	/** forcepushcontent:发送群消息时，针对强推（@操作）列表forcepushlist中的用户，强制推送的内容. */
	private String forcepushcontent;

	/** forcepushall:发送群消息时，强推（@操作）列表是否为群里除发送者外的所有有效成员，true或false，默认为false. */
	private String forcepushall;

	/** bid:可选，反垃圾业务ID，实现“单条消息配置对应反垃圾”，若不填则使用原来的反垃圾配置. */
	private String bid;

	/**
	 * useYidun:可选，单条消息是否使用易盾反垃圾，可选值为0。<br>
	 * 0：（在开通易盾的情况下）不使用易盾反垃圾而是使用通用反垃圾，包括自定义消息。<br>
	 * 若不填此字段，即在默认情况下，若应用开通了易盾反垃圾功能，则使用易盾反垃圾来进行垃圾消息的判断.
	 */
	private int useYidun;

	/** markRead: 可选，群消息是否需要已读业务（仅对群消息有效），0:不需要，1:需要. */
	private int markRead;

	/**
	 * checkFriend:是否为好友关系才发送消息，默认否<br>
	 * 注：使用该参数需要先开通功能服务.
	 */
	private boolean checkFriend;

	/**
	 * Creates a new instance of MsgSendRequest.<br>
	 * 参数为必填字段
	 * @param from
	 * @param ope
	 * @param to
	 * @param type
	 * @param body
	 */
	public MsgSendRequest(String from, int ope, String to, int type, MsgBody body) {
		super();
		this.from = from;
		this.ope = ope;
		this.to = to;
		this.type = type;
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getOpe() {
		return ope;
	}

	public void setOpe(int ope) {
		this.ope = ope;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public MsgBody getBody() {
		return body;
	}

	public void setBody(MsgBody body) {
		this.body = body;
	}

	public String getAntispam() {
		return antispam;
	}

	public void setAntispam(String antispam) {
		this.antispam = antispam;
	}

	public String getAntispamCustom() {
		return antispamCustom;
	}

	public void setAntispamCustom(String antispamCustom) {
		this.antispamCustom = antispamCustom;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getPushcontent() {
		return pushcontent;
	}

	public void setPushcontent(String pushcontent) {
		this.pushcontent = pushcontent;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getForcepushlist() {
		return forcepushlist;
	}

	public void setForcepushlist(String forcepushlist) {
		this.forcepushlist = forcepushlist;
	}

	public String getForcepushcontent() {
		return forcepushcontent;
	}

	public void setForcepushcontent(String forcepushcontent) {
		this.forcepushcontent = forcepushcontent;
	}

	public String getForcepushall() {
		return forcepushall;
	}

	public void setForcepushall(String forcepushall) {
		this.forcepushall = forcepushall;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getUseYidun() {
		return useYidun;
	}

	public void setUseYidun(int useYidun) {
		this.useYidun = useYidun;
	}

	public int getMarkRead() {
		return markRead;
	}

	public void setMarkRead(int markRead) {
		this.markRead = markRead;
	}

	public boolean isCheckFriend() {
		return checkFriend;
	}

	public void setCheckFriend(boolean checkFriend) {
		this.checkFriend = checkFriend;
	}

}
