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
 * Function: 用户关系托管获取好友关系请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午8:46:57
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户关系托管获取好友关系请求对象。<br>
 *              POST https://api.netease.im/nimserver/friend/get.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述:1.查询某时间点起到现在有更新的双向好友<br>
 */
public class FriendGetRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "friend/get.action";
	}

	/** accid:加好友发起者accid. */
	private String accid;

	/** faccid:更新时间戳，接口返回该时间戳之后有更新的好友列表. */
	private Long updatetime;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public Long getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Long updatetime) {
		this.updatetime = updatetime;
	}

}
