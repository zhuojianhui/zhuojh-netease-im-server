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
import java.util.Map;

import com.zhuojh.netease.im.server.request.msg.MsgSendBatchRequest;
import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 批量发送点对点普通消息响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:33:31
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 批量发送点对点普通消息{@link MsgSendBatchRequest}
 */
public class MsgSendBatchAttachResponse extends HttpResponse {

	/** msgids:消息接受者对应的消息ID，returnMsgId参数为true时才返回. */
	private Map<String, Long> msgids;

	/** unregister:未注册的帐号. */
	private List<String> unregister;

	public Map<String, Long> getMsgids() {
		return msgids;
	}

	public void setMsgids(Map<String, Long> msgids) {
		this.msgids = msgids;
	}

	public List<String> getUnregister() {
		return unregister;
	}

	public void setUnregister(List<String> unregister) {
		this.unregister = unregister;
	}
}
