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
 * Function: 聊天室云端历史消息查询请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:15:44
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 聊天室云端历史消息查询消息查询。<br>
 *              POST https://api.netease.im/nimserver/history/queryChatroomMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 1.此接口有频控限制，每分钟可调用不超过1200次。<br>
 */
public class HistoryQueryChatroomMsgRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/queryChatroomMsg.action";
	}

	/** roomid:聊天室id. */
	private long roomid;

	/** accid:查询用户对应的accid. */
	private String accid;

	/** timetag:查询的时间戳锚点，13位。reverse=1时timetag为起始时间戳，reverse=2时timetag为终止时间戳. */
	private long timetag;

	/** limit:本次查询的消息条数上限(最多200条),小于等于0，或者大于200，会提示参数错误. */
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
	 * @param roomid
	 * @param accid
	 * @param timetag
	 * @param limit
	 */
	public HistoryQueryChatroomMsgRequest(long roomid, String accid, long timetag, int limit) {
		super();
		this.roomid = roomid;
		this.accid = accid;
		this.timetag = timetag;
		this.limit = limit;
	}

	public long getRoomid() {
		return roomid;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public long getTimetag() {
		return timetag;
	}

	public void setTimetag(long timetag) {
		this.timetag = timetag;
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
