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
 * Function: 设置桌面端在线时，移动端是否需要推送请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 设置桌面端在线时，移动端是否需要推送请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/setDonnop.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：设置桌面端在线时，移动端是否需要推送。<br>
 */
public class UserSetDonnopRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "user/setDonnop.action";
	}

	/**
	 * accid:网易云通信ID，最大长度32字符，必须保证一个 APP内唯一<br>
	 * （只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。.
	 */
	private String accid;

	/** needkick:桌面端在线时，移动端是否不推送： true:移动端不需要推送，false:移动端需要推送. */
	private String donnopOpen;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getDonnopOpen() {
		return donnopOpen;
	}

	public void setDonnopOpen(String donnopOpen) {
		this.donnopOpen = donnopOpen;
	}
}
