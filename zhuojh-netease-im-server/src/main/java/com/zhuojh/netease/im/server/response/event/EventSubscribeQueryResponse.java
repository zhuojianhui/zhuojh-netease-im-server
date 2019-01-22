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

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: TODO ADD FUNCTION. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午11:10:46
 * @author zhuojianhui@gmail.com
 * @since
 * @description
 */
public class EventSubscribeQueryResponse extends HttpResponse {

	public class Subscribe {

		/** accid:被订阅人账号. */
		private String accid;

		/** eventType:事件类型. */
		private int eventType;

		/** expireTime:过期时间. */
		private long expireTime;

		/** subscribeTime:订阅时间. */
		private long subscribeTime;

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

		public long getExpireTime() {
			return expireTime;
		}

		public void setExpireTime(long expireTime) {
			this.expireTime = expireTime;
		}

		public long getSubscribeTime() {
			return subscribeTime;
		}

		public void setSubscribeTime(long subscribeTime) {
			this.subscribeTime = subscribeTime;
		}
	}

	/** subscribes:指定人员的有效在线状态事件订阅关系列表. */
	private List<Subscribe> subscribes;

	public List<Subscribe> getSubscribes() {
		return subscribes;
	}

	public void setSubscribes(List<Subscribe> subscribes) {
		this.subscribes = subscribes;
	}
}
