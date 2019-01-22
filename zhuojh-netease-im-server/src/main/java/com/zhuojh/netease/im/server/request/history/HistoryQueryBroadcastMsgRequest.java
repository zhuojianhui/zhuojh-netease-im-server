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
 * Function: 批量查询广播消息请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:57:11
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 批量查询广播消息。<br>
 *              POST https://api.netease.im/nimserver/history/queryBroadcastMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 批量查询广播消息<br>
 */
public class HistoryQueryBroadcastMsgRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/queryBroadcastMsg.action";
	}

	/** broadcastId:查询的起始ID，0表示查询最近的limit条。默认0. */
	private long broadcastId;

	/** limit:查询的条数，最大100。默认100。 */
	private int limit;

	/** type:查询的类型，1表示所有，2表示查询存离线的，3表示查询不存离线的。默认1。TODO(此处类型应该使用int) */
	private long type;

}
