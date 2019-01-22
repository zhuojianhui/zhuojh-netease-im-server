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
 * Function: 发送文件消息体. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:58:56
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送文件消息体
 */
public class MsgFileBody implements MsgBody {

	/** name:文件名. */
	private String name;

	/** md5:文件MD5. */
	private String md5;

	/** url:文件URL. */
	private String url;

	/** ext:文件后缀类型. */
	private String ext;

	/** size:大小. */
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
