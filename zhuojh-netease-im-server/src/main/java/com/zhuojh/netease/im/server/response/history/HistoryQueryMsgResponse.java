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

package com.zhuojh.netease.im.server.response.history;

import java.util.List;

import com.zhuojh.netease.im.server.request.history.HistoryQueryChatroomMsgRequest;
import com.zhuojh.netease.im.server.request.history.HistoryQuerySessionMsgRequest;
import com.zhuojh.netease.im.server.request.history.HistoryQueryTeamMsgRequest;
import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 历史消息查询返回的消息响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:08:30
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 历史消息查询返回的消息。<br>
 *              用于以下请求返回：{@link HistoryQueryChatroomMsgRequest}/{@link HistoryQuerySessionMsgRequest}/{@link HistoryQueryTeamMsgRequest}
 */
public class HistoryQueryMsgResponse extends HttpResponse {

	/** size:总共消息条数. */
	private int size;

	/**
	 * msgs:各种类型的消息参见"历史消息查询返回的消息格式说明". <br>
	 * 其中的msgid字段为客户端消息id，对应单聊和群群云端历史消息中的msgid为服务端消息id
	 */
	private List<HistoryMsgEntity> msgs;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<HistoryMsgEntity> getMsgs() {
		return msgs;
	}

	public void setMsgs(List<HistoryMsgEntity> msgs) {
		this.msgs = msgs;
	}
}
