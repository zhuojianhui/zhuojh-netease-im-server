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

package com.zhuojh.netease.im.server.request.user;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 获取用户名片请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 获取用户名片请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/getUinfos.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：获取用户名片，可批量。 <br>
 */
public class UserGetUinfosRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "/user/getUinfos.action";
	}

	/** 用户帐号（例如：JSONArray对应的accid串，如：["zhangsan"]，如果解析出错，会报414）（一次查询最多为200））。 */
	private String accids;

	public String getAccids() {
		return accids;
	}

	public void setAccids(String accids) {
		this.accids = accids;
	}

}
