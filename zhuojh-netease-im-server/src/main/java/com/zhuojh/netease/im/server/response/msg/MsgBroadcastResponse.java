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

package com.zhuojh.netease.im.server.response.msg;

import java.util.List;

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 发送广播消息响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午10:14:01
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送广播消息
 */
public class MsgBroadcastResponse extends HttpResponse {
	public class Msg {

		/** expireTime:过期时间戳. */
		private long expireTime;

		/** body:响应消息体. */
		private String body;

		/** createTime:新建时间戳. */
		private long createTime;

		/** isOffline:是否脱机标志. */
		private boolean isOffline;

		/** broadcastId:广播ID. */
		private long broadcastId;

		/** targetOs:目标操作系统. */
		private List<String> targetOs;

		public long getExpireTime() {
			return expireTime;
		}

		public void setExpireTime(long expireTime) {
			this.expireTime = expireTime;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(long createTime) {
			this.createTime = createTime;
		}

		public boolean isOffline() {
			return isOffline;
		}

		public void setOffline(boolean isOffline) {
			this.isOffline = isOffline;
		}

		public long getBroadcastId() {
			return broadcastId;
		}

		public void setBroadcastId(long broadcastId) {
			this.broadcastId = broadcastId;
		}

		public List<String> getTargetOs() {
			return targetOs;
		}

		public void setTargetOs(List<String> targetOs) {
			this.targetOs = targetOs;
		}

	}
}
