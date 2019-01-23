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

package com.zhuojh.netease.im.server.request.msg;

/**
 * Function: 视频消息体. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:51:16
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 视频消息体
 */
public class MsgVideoBody implements MsgBody {

	/** dur:视频持续时长ms. */
	private int dur;

	/** md5:视频文件的md5值. */
	private String md5;

	/** url:生成的url. */
	private String url;

	/** w:宽. */
	private int w;

	/** h:高. */
	private int h;

	/** ext:视频格式. */
	private String ext;

	/** size:视频文件大小. */
	private int size;

	public int getDur() {
		return dur;
	}

	public void setDur(int dur) {
		this.dur = dur;
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

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
