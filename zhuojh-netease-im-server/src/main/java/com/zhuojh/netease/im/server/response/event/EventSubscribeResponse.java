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

package com.zhuojh.netease.im.server.response.event;

import java.util.List;

import com.zhuojh.netease.im.server.request.event.EventSubscribeAddRequest;
import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 订阅在线状态事件响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午11:01:58
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 订阅在线状态事件.请求类定义 {@link EventSubscribeAddRequest}和 {@link EventSubscribeDeleteRequest}
 */
public class EventSubscribeResponse extends HttpResponse {

	/** failedAccid:订阅失败的账号数组. */
	private List<String> failedAccid;

	public List<String> getFailedAccid() {
		return failedAccid;
	}

	public void setFailedAccid(List<String> failedAccid) {
		this.failedAccid = failedAccid;
	}
}
