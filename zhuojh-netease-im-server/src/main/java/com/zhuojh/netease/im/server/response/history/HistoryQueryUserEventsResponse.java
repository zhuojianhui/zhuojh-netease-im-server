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

import java.util.List;

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 用户登录登出事件记录查询响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:47:28
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户登录登出事件记录查询
 */
public class HistoryQueryUserEventsResponse extends HttpResponse {
	public class Event {

		/** accid:用户accid . */
		private String accid;

		/** timestamp:发生时间，ms . */
		private long timestamp;

		/** eventType:2表示登录，3表示登出 . */
		private int eventType;

		/** clientIp:用户clientip . */
		private String clientIp;

		/** sdkVersion:sdk 版本 . */
		private int sdkVersion;

		/** clientType:终端 . */
		private String clientType;

		/** code:登录成功状态，200表示成功 . */
		private String code;

		public String getAccid() {
			return accid;
		}

		public void setAccid(String accid) {
			this.accid = accid;
		}

		public long getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}

		public int getEventType() {
			return eventType;
		}

		public void setEventType(int eventType) {
			this.eventType = eventType;
		}

		public String getClientIp() {
			return clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public int getSdkVersion() {
			return sdkVersion;
		}

		public void setSdkVersion(int sdkVersion) {
			this.sdkVersion = sdkVersion;
		}

		public String getClientType() {
			return clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	/** size:总共记录数 . */
	private int size;

	/** events:用户登录登出事件列表. */
	private List<Event> events;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
