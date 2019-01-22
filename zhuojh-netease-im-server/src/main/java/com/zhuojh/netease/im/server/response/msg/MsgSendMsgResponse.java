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

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 发送普通消息响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:24:58
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送普通消息响应对象。
 * 
 */
public class MsgSendMsgResponse extends HttpResponse {
	public class Data {

		/** msgid:返回的消息ID. */
		private String msgid;

		/** antispam:易盾反垃圾标志. */
		private Boolean antispam;

		public String getMsgid() {
			return msgid;
		}

		public void setMsgid(String msgid) {
			this.msgid = msgid;
		}

		public Boolean getAntispam() {
			return antispam;
		}

		public void setAntispam(Boolean antispam) {
			this.antispam = antispam;
		}
	}

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
