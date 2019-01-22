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
 * Function: 用户关系托管加好友请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午8:46:57
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户关系托管加好友请求对象。<br>
 *              POST https://api.netease.im/nimserver/friend/add.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述:1.两人保持好友关系<br>
 */
public class FriendAddRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "friend/add.action";
	}

	/** accid:加好友发起者accid. */
	private String accid;

	/** faccid:TODO(用一句话描述这个变量表示什么). */
	private String faccid;

	/** type:1直接加好友，2请求加好友，3同意加好友，4拒绝加好友. */
	private int type;

	/** msg:加好友对应的请求消息，第三方组装，最长256字符. */
	private String msg;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
