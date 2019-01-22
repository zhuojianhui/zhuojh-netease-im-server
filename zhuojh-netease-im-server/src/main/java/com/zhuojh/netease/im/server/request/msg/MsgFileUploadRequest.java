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
 * Function: 文件上传（multipart方式）请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午8:29:18
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 文件上传（multipart方式）。<br>
 *              POST https://api.netease.im/nimserver/msg/fileUpload.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 文件上传，最大15M。
 */
public class MsgFileUploadRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/fileUpload.action";
	}

	/** content:字符流base64串(Base64.encode(bytes)) ，最大15M的字符流. */
	private String content;

	/** type:上传文件类型. */
	private String type;

	/** ishttps:返回的url是否需要为https的url，true或false，默认false. */
	private String ishttps;

	/** expireSec:文件过期时长，单位：秒，必须大于等于86400. */
	private Integer expireSec;

	/** tag:文件的应用场景，不超过32个字符. */
	private String tag;

	/**
	 * Creates a new instance of MsgUploadRequest.<br>
	 * 参数为必填字段
	 * @param content
	 */
	public MsgFileUploadRequest(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIshttps() {
		return ishttps;
	}

	public void setIshttps(String ishttps) {
		this.ishttps = ishttps;
	}

	public Integer getExpireSec() {
		return expireSec;
	}

	public void setExpireSec(Integer expireSec) {
		this.expireSec = expireSec;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
