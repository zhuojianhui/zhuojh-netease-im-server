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

package com.zhuojh.netease.im.server.request.user;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 封禁网易云通信ID请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 封禁网易云通信ID请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/block.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：1.第三方禁用某个网易云通信ID的IM功能；<br>
 *              2.封禁网易云通信ID后，此ID将不能登陆网易云通信imserver。<br>
 */
public class UserBlockRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "/user/block.action";
	}

	/**
	 * accid:网易云通信ID，最大长度32字符，必须保证一个 APP内唯一<br>
	 * （只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。.
	 */
	private String accid;

	/** needkick:是否踢掉被禁用户，true或false，默认false. */
	private String needkick;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getNeedkick() {
		return needkick;
	}

	public void setNeedkick(String needkick) {
		this.needkick = needkick;
	}
}
