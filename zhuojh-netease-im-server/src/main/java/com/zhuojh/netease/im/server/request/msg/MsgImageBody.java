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

/**
 * Function: 图片消息体. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:41:23
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 图片消息体
 */
public class MsgImageBody implements MsgBody {

	/** name:图片name. */
	private String name;

	/** md5:图片文件md5. */
	private String md5;

	/** url:生成的url. */
	private String url;

	/** w:宽. */
	private int w;

	/** h:高. */
	private int h;

	/** size:图片大小. */
	private int size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
