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

package com.zhuojh.netease.im.server.request.friend;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 更新好友相关信息请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午8:53:57
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 更新好友相关信息请求对象。<br>
 *              POST https://api.netease.im/nimserver/friend/update.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述:1.更新好友相关信息，如加备注名，必须是好友才可以<br>
 */
public class FriendUpdateRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "friend/update.action";
	}

	/** accid:加好友发起者accid. */
	private String accid;

	/** faccid:TODO(用一句话描述这个变量表示什么). */
	private String faccid;

	/** alias:给好友增加备注名，限制长度128. */
	private String alias;

	/** ex:修改ex字段，限制长度256. */
	private String ex;

	/** serverex:修改serverex字段，限制长度256此字段client端只读，server端读写. */
	private String serverex;

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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public String getServerex() {
		return serverex;
	}

	public void setServerex(String serverex) {
		this.serverex = serverex;
	}

}
