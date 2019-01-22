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
 * Function: 语音消息体. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:46:21
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 语音消息体
 */
public class MsgVoiceBody implements MsgBody {

	/** dur:语音持续时长ms. */
	private int dur;

	/** md5:语音文件的md5值. */
	private String md5;

	/** url:生成的url. */
	private String url;

	/** ext:语音消息格式，只能是aac格式. */
	private String ext;

	/** size:语音文件大小. */
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
