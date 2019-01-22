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

package com.zhuojh.netease.im.server.request.history;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 用户登录登出事件记录查询请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:43:39
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户登录登出事件记录查询。<br>
 *              POST https://api.netease.im/nimserver/history/queryUserEvents.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 1.跟据时间段查询用户的登录登出记录，每次最多返回100条。 <br>
 *              2.不提供分页支持，第三方需要跟据时间段来查询。<br>
 */
public class HistoryQueryUserEventsRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/queryUserEvents.action";
	}

	/** accid:要查询用户的accid. */
	private String accid;

	/** begintime:开始时间，ms. */
	private String begintime;

	/** endtime:截止时间，ms. */
	private String endtime;

	/** limit:本次查询的消息条数上限(最多100条),小于等于0，或者大于100，会提示参数错误. */
	private int limit;

	/** reverse:1按时间正序排列，2按时间降序排列。其它返回参数414错误。默认是按降序排列. */
	private int reverse;

	/**
	 * Creates a new instance of HistoryQueryUserEventsRequest. <br>
	 * 参数为必填字段
	 * @param accid
	 * @param begintime
	 * @param endtime
	 * @param limit
	 */
	public HistoryQueryUserEventsRequest(String accid, String begintime, String endtime, int limit) {
		super();
		this.accid = accid;
		this.begintime = begintime;
		this.endtime = endtime;
		this.limit = limit;
	}

}
