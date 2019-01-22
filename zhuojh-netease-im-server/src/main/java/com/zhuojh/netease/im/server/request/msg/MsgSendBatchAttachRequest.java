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

import java.util.List;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 批量发送点对点自定义系统通知请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午8:30:31
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 批量发送点对点自定义系统通知。<br>
 *              POST https://api.netease.im/nimserver/msg/sendBatchAttachMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：1.系统通知区别于普通消息，应用接收到直接交给上层处理，客户端可不做展示；<br>
 *              2.目前支持类型：点对点类型；<br>
 *              3.最大限500人，只能针对个人,如果批量提供的帐号中有未注册的帐号，会提示并返回给用户；<br>
 *              4.此接口受频率控制，一个应用一分钟最多调用120次，超过会返回416状态码，并且被屏蔽一段时间。<br>
 *              应用场景：如某个用户给另一个用户发送好友请求信息等，具体attach为请求消息体，第三方可以自行扩展，建议是json格式<br>
 */
public class MsgSendBatchAttachRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/sendBatchAttachMsg.action";
	}

	/** from:发送者accid，用户帐号，最大32字符，APP内唯一. */
	private String fromAccid;

	/** toAccids:["aaa","bbb"]（JSONArray对应的accid，如果解析出错，会报414错误），最大限500人. */
	private List<String> toAccids;

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
	 * Creates a new instance of MsgSendBatchAttachRequest. <br>
	 * 参数为必填字段
	 * @param fromAccid
	 * @param toAccids
	 * @param attach
	 */
	public MsgSendBatchAttachRequest(String fromAccid, List<String> toAccids, String attach) {
		super();
		this.fromAccid = fromAccid;
		this.toAccids = toAccids;
		this.attach = attach;
	}

	public String getFromAccid() {
		return fromAccid;
	}

	public void setFromAccid(String fromAccid) {
		this.fromAccid = fromAccid;
	}

	public List<String> getToAccids() {
		return toAccids;
	}

	public void setToAccids(List<String> toAccids) {
		this.toAccids = toAccids;
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
