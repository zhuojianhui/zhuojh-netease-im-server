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

package com.zhuojh.netease.im.server.response.history;

import com.zhuojh.netease.im.server.request.msg.MsgBody;

/**
 * Function: 历史消息查询返回的消息实体类. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:23:01
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 历史消息查询返回的消息格式。
 */
public class HistoryMsgEntity {

	/** from:发送者accid. */
	private String from;

	/** msgid:为客户端消息id，对应单聊和群群云端历史消息中的msgid为服务端消息id. */
	private long msgid;

	/** sendtime:发送时间ms. */
	private long sendtime;

	/** type:消息类型：0:文本，1:图片，2:语音，3:视频，4:地理位置，5:群notifycation通知，6:文件，11:智能机器人消息，100:自定义消息。. */
	private int type;

	/** body:消息体. */
	private MsgBody body;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public long getMsgid() {
		return msgid;
	}

	public void setMsgid(long msgid) {
		this.msgid = msgid;
	}

	public long getSendtime() {
		return sendtime;
	}

	public void setSendtime(long sendtime) {
		this.sendtime = sendtime;
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

}
