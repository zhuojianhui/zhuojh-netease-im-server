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

package com.zhuojh.netease.im.server.response.user;

import java.util.List;

import com.zhuojh.netease.im.server.response.HttpResponse;

/**
 * Function: 获取用户名片响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午5:25:56
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 获取用户名片响应对象. <br>
 *              主要的返回码 200、403、414、416、431、500 具体请参考code状态表
 */
public class UserGetUinfosResponse extends HttpResponse {

	private List<UserUinfosEntity> uinfos;

	public List<UserUinfosEntity> getUinfos() {
		return uinfos;
	}

	public void setUinfos(List<UserUinfosEntity> uinfos) {
		this.uinfos = uinfos;
	}

}
