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
 * Function: 查看用户的黑名单和静音列表响应对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:04:05
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 查看用户的黑名单和静音列表响应对象。<br>
 */
public class UserListBlackAndMuteListResponse extends HttpResponse {

	/** mutelist:被静音的帐号列表. */
	private List<String> mutelist;

	/** blacklist:加黑的帐号列表. */
	private List<String> blacklist;

	public List<String> getMutelist() {
		return mutelist;
	}

	public void setMutelist(List<String> mutelist) {
		this.mutelist = mutelist;
	}

	public List<String> getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(List<String> blacklist) {
		this.blacklist = blacklist;
	}

}
