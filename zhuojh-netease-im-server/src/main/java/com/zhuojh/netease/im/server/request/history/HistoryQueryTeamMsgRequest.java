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
 * Function: 群聊云端历史消息查询请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:11:44
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 群聊云端历史消息查询。<br>
 *              POST https://api.netease.im/nimserver/history/queryTeamMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 查询存储在网易云通信服务器中的群聊天历史消息，只能查询在保存时间范围内的消息<br>
 *              1.跟据时间段查询群消息，每次最多返回100条；<br>
 *              2.不提供分页支持，第三方需要跟据时间段来查询。<br>
 */
public class HistoryQueryTeamMsgRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/queryTeamMsg.action";
	}

	/** tid:群id. */
	private String tid;

	/** accid:查询用户对应的accid. */
	private String accid;

	/** begintime:开始时间，ms. */
	private String begintime;

	/** endtime:截止时间，ms. */
	private String endtime;

	/** limit:本次查询的消息条数上限(最多100条),小于等于0，或者大于100，会提示参数错误. */
	private int limit;

	/** reverse:1按时间正序排列，2按时间降序排列。其它返回参数414错误.默认是按降序排列. */
	private int reverse;

	/**
	 * type:查询指定的多个消息类型，类型之间用","分割，不设置该参数则查询全部类型消息格式，示例： 0,1,2,3 <br>
	 * 类型支持： 1:图片，2:语音，3:视频，4:地理位置，5:通知，6:文件，10:提示，11:Robot，100:自定义.
	 */
	private String type;

	/**
	 * Creates a new instance of HistoryQueryTeamMsgRequest. <br>
	 * 参数为必填字段
	 * @param tid
	 * @param accid
	 * @param begintime
	 * @param endtime
	 * @param limit
	 */
	public HistoryQueryTeamMsgRequest(String tid, String accid, String begintime, String endtime, int limit) {
		super();
		this.tid = tid;
		this.accid = accid;
		this.begintime = begintime;
		this.endtime = endtime;
		this.limit = limit;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getBegintime() {
		return begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getReverse() {
		return reverse;
	}

	public void setReverse(int reverse) {
		this.reverse = reverse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
