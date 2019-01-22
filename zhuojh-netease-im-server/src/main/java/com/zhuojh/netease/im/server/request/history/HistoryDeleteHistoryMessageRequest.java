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

package com.zhuojh.netease.im.server.request.history;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 删除聊天室云端历史消息请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:39:39
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 删除聊天室云端历史消息。<br>
 *              POST https://api.netease.im/nimserver/history/deleteHistoryMessage.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 */
public class HistoryDeleteHistoryMessageRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/deleteHistoryMessage.action";
	}

	/** roomid:聊天室id. */
	private long roomid;

	/** fromAcc:消息发送者的accid. */
	private String fromAcc;

	/** msgTimetag:消息的时间戳，单位毫秒，应该拿到原始消息中的时间戳为参数. */
	private long msgTimetag;

	/**
	 * Creates a new instance of HistoryDeleteHistoryMessageRequest. <br>
	 * 参数为必填字段
	 * @param roomid
	 * @param fromAcc
	 * @param msgTimetag
	 */
	public HistoryDeleteHistoryMessageRequest(long roomid, String fromAcc, long msgTimetag) {
		super();
		this.roomid = roomid;
		this.fromAcc = fromAcc;
		this.msgTimetag = msgTimetag;
	}

	public long getRoomid() {
		return roomid;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public String getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(String fromAcc) {
		this.fromAcc = fromAcc;
	}

	public long getMsgTimetag() {
		return msgTimetag;
	}

	public void setMsgTimetag(long msgTimetag) {
		this.msgTimetag = msgTimetag;
	}

}
