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

package com.zhuojh.netease.im.server.response.user;

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 创建网易云通信ID响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午5:25:56
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 创建网易云通信ID响应对象. <br>
 *              主要的返回码 200、403、414、416、431、500 具体请参考code状态表
 */
public class UserCreateResponse extends HttpResponse {

	private UserUinfosEntity info;

	public UserUinfosEntity getInfo() {
		return info;
	}

	public void setInfo(UserUinfosEntity info) {
		this.info = info;
	}
}
