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

package com.zhuojh.netease.im.server.response.history;

import java.util.List;

import com.zhuojh.netease.im.server.request.msg.MsgBody;

/**
 * Function: 群内系统通知消息体类定义. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:33:59
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 群内系统通知
 */
public class MsgTeamNotifycationBody implements MsgBody {

	/** tid:群id. */
	private long tid;

	/** tname:群名称 （某些操作会有）. */
	private String tname;

	/** ope:notify通知类型 （0:群拉人，1:群踢人，2:退出群，3:群信息更新，4:群解散，5:申请加入群成功，6:退出并移交群主，7:增加管理员，8:删除管理员，9:接受邀请进群）. */
	private int ope;

	/** accids:操作的对象 （群成员操作时才有）. */
	private List<String> accids;

	/** intro:群介绍，ope=3时群信息修改项. */
	private String intro;

	/** announcement:群公告，ope=3时群信息修改项. */
	private String announcement;

	/** joinmode:加入群的模式0不需要认证，1需要认证 ,（ope=3时群信息修改项）. */
	private int joinmode;

	/** config:第三方服务器配制修改项，ope=3时群信息修改项. */
	private String config;

	/** updatetime:通知后台更新时间 （群操作时有）. */
	private long updatetime;

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getOpe() {
		return ope;
	}

	public void setOpe(int ope) {
		this.ope = ope;
	}

	public List<String> getAccids() {
		return accids;
	}

	public void setAccids(List<String> accids) {
		this.accids = accids;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	public int getJoinmode() {
		return joinmode;
	}

	public void setJoinmode(int joinmode) {
		this.joinmode = joinmode;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public long getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(long updatetime) {
		this.updatetime = updatetime;
	}

}
