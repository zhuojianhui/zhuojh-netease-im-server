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

package com.zhuojh.netease.im.server.request.msg;

/**
 * Function: 发送第三方自定义消息. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:39:43
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送第三方自定义消息
 */
public class MsgCustomBody implements MsgBody {

	/** json:第三方定义的body体，json串. */
	private String json;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

}
