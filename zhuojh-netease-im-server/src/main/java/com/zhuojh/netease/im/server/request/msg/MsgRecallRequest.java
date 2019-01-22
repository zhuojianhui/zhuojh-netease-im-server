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

package com.zhuojh.netease.im.server.request.msg;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 消息撤回请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午8:36:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 消息撤回。<br>
 *              POST https://api.netease.im/nimserver/msg/recall.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 消息撤回接口，可以撤回一定时间内的点对点与群消息
 */
public class MsgRecallRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/recall.action";
	}

	/** deleteMsgid:要撤回消息的msgid. */
	private String deleteMsgid;

	/** timetag:要撤回消息的创建时间. */
	private long timetag;

	/** type:7:表示点对点消息撤回，8:表示群消息撤回，其它为参数错误. */
	private int type;

	/** from:发消息的accid. */
	private String from;

	/** to:如果点对点消息，为接收消息的accid,如果群消息，为对应群的tid. */
	private String to;

	/** msg:可以带上对应的描述. */
	private String msg;

	/** ignoreTime:1表示忽略撤回时间检测，其它为非法参数，如果需要撤回时间检测，不填即可. */
	private String ignoreTime;

	/** pushcontent: 推送文案，不超过500字符. */
	private String pushcontent;

	/** payload:推送对应的payload,必须是JSON,不超过2K字符. */
	private String payload;

	/**
	 * Creates a new instance of MsgRecallRequest.<br>
	 * 参数为必填字段
	 * @param deleteMsgid
	 * @param timetag
	 * @param type
	 * @param from
	 * @param to
	 */
	public MsgRecallRequest(String deleteMsgid, long timetag, int type, String from, String to) {
		super();
		this.deleteMsgid = deleteMsgid;
		this.timetag = timetag;
		this.type = type;
		this.from = from;
		this.to = to;
	}

	public String getDeleteMsgid() {
		return deleteMsgid;
	}

	public void setDeleteMsgid(String deleteMsgid) {
		this.deleteMsgid = deleteMsgid;
	}

	public long getTimetag() {
		return timetag;
	}

	public void setTimetag(long timetag) {
		this.timetag = timetag;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getIgnoreTime() {
		return ignoreTime;
	}

	public void setIgnoreTime(String ignoreTime) {
		this.ignoreTime = ignoreTime;
	}

	public String getPushcontent() {
		return pushcontent;
	}

	public void setPushcontent(String pushcontent) {
		this.pushcontent = pushcontent;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
