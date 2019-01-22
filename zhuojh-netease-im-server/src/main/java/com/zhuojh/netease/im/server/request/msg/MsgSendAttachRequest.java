/**
* Copyright (C) 2019, the original author or authors. All rights reserved.
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
 * Function: 发送自定义系统通知请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午10:05:59
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送自定义系统通知。<br>
 *              POST https://api.netease.im/nimserver/msg/sendAttachMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：1.自定义系统通知区别于普通消息，方便开发者进行业务逻辑的通知；<br>
 *              2.目前支持两种类型：点对点类型和群类型（仅限高级群），根据msgType有所区别。<br>
 */
public class MsgSendAttachRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/sendAttachMsg.action";
	}

	/** from:发送者accid，用户帐号，最大32字符，APP内唯一. */
	private String from;

	/** msgtype:0：点对点自定义通知，1：群消息自定义通知，其他返回414. */
	private int msgtype;

	/** to:msgtype==0是表示accid即用户id，msgtype==1表示tid即群id. */
	private String to;

	/** attach:自定义通知内容，第三方组装的字符串，建议是JSON串，最大长度4096字符. */
	private String attach;

	/** pushcontent:iOS推送内容，第三方自己组装的推送内容,不超过500字符. */
	private String pushcontent;

	/** payload:iOS推送对应的payload,必须是JSON,不能超过2k字符. */
	private String payload;

	/** sound:如果有指定推送，此属性指定为客户端本地的声音文件名，长度不要超过30个字符，如果不指定，会使用默认声音. */
	private String sound;

	/** save:1表示只发在线，2表示会存离线，其他会报414错误。默认会存离线. */
	private int save;

	/**
	 * option:发消息时特殊指定的行为选项,Json格式，可用于指定消息计数等特殊行为;option中字段不填时表示默认值。 option示例：<br>
	 * {"badge":false,"needPushNick":false,"route":false} <br>
	 * 字段说明： 1. badge:该消息是否需要计入到未读计数中，默认true; <br>
	 * 2. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认false(ps:注意与sendMsg.action接口有别); <br>
	 * 3. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能).
	 */
	private String option;

	/**
	 * Creates a new instance of MsgSendAttachRequest. <br>
	 * 参数为必填字段
	 * @param from
	 * @param msgtype
	 * @param to
	 * @param attach
	 */
	public MsgSendAttachRequest(String from, int msgtype, String to, String attach) {
		super();
		this.from = from;
		this.msgtype = msgtype;
		this.to = to;
		this.attach = attach;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(int msgtype) {
		this.msgtype = msgtype;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
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

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
