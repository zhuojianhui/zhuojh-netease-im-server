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
 * Function: 删除音视频/白板服务器录制文件请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午9:54:11
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 删除音视频/白板服务器录制文件。<br>
 *              POST https://api.netease.im/nimserver/history/deleteMediaFile.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 1.此接口有频控限制，每分钟可调用不超过300次<br>
 */
public class HistoryDeleteMediaFileRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "history/deleteMediaFile.action";
	}

	/** channelid:需要删除的文件的通道号. */
	private long channelid;

	/**
	 * Creates a new instance of HistoryDeleteMediaFileRequest. <br>
	 * 参数为必填字段
	 * @param channelid
	 */
	public HistoryDeleteMediaFileRequest(long channelid) {
		super();
		this.channelid = channelid;
	}

	public long getChannelid() {
		return channelid;
	}

	public void setChannelid(long channelid) {
		this.channelid = channelid;
	}

}
