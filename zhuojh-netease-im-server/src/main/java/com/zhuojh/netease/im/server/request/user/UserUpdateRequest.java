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
 * Function: 网易云通信ID更新请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 网易云通信ID更新请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/update.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 */
public class UserUpdateRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "user/update.action";
	}

	/**
	 * accid:网易云通信ID，最大长度32字符，必须保证一个 APP内唯一<br>
	 * （只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。.
	 */
	private String accid;

	/** props:json属性，第三方可选填，最大长度1024字符. */
	private String props;

	/** token:网易云通信ID可以指定登录token值，最大长度128字符， 并更新，如果未指定，会自动生成token，并在 创建成功后返回. */
	private String token;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
