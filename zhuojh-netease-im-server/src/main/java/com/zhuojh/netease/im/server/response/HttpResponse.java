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

package com.zhuojh.netease.im.server.response;

/**
 * Function: Http返回结果响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午5:24:03
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description Http返回结果响应对象<br>
 *              具体请参考code状态表{@link ResponseCode}
 */
public class HttpResponse {

	private int code;

	private String desc;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
