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

package com.zhuojh.netease.im.server.request.event;

import java.util.List;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 取消全部在线状态事件订阅请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午11:05:23
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 取消指定事件的全部订阅关系。订阅请求 {@link EventSubscribeAddRequest}<br>
 *              POST https://api.netease.im/nimserver/event/subscribe/batchdel.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 */
public class EventSubscribeBatchDeleteRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "event/subscribe/batchdel.action";
	}

	/** accid:事件订阅人账号. */
	private String accid;

	/** eventType:事件类型，固定设置为1，即 eventType=1. */
	private int eventType;

	/**
	 * Creates a new instance of EventSubscribeAddRequest. <br>
	 * 参数为必填字段
	 * @param accid
	 * @param eventType
	 */
	public EventSubscribeBatchDeleteRequest(String accid, int eventType) {
		super();
		this.accid = accid;
		this.eventType = eventType;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

}
