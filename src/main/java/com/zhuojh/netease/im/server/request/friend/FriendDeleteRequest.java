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

package com.zhuojh.netease.im.server.request.friend;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 用户关系托管删除好友请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午8:46:57
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户关系托管删除好友请求对象。<br>
 *              POST https://api.netease.im/nimserver/friend/delete.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述:删除好友关系<br>
 */
public class FriendDeleteRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "friend/delete.action";
	}

	/** accid:加好友发起者accid. */
	private String accid;

	/** faccid:要删除朋友的accid. */
	private String faccid;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getFaccid() {
		return faccid;
	}

	public void setFaccid(String faccid) {
		this.faccid = faccid;
	}

}
