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
 * Function: 查询单条广播消息. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:59:11
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 查询单条广播消息。<br>
 *              POST https://api.netease.im/nimserver/history/queryBroadcastMsgById.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 查询单条广播消息<br>
 */
public class HistoryQueryBroadcastMsgByIdRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/queryBroadcastMsgById.action";
	}

	/** broadcastId:广播消息ID，应用内唯一。 */
	private long broadcastId;

	public long getBroadcastId() {
		return broadcastId;
	}

	public void setBroadcastId(long broadcastId) {
		this.broadcastId = broadcastId;
	}

}
