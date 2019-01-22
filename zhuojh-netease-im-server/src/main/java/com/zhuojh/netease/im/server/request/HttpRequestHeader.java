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

package com.zhuojh.netease.im.server.request;

import java.nio.charset.Charset;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMessage;
import org.springframework.http.MediaType;

import com.zhuojh.netease.im.server.util.CheckSumBuilder;

/**
 * Function: TODO ADD FUNCTION. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午3:40:24
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description
 */
public class HttpRequestHeader implements HttpMessage {

	public static String CONTENT_TYPE = "application/x-www-form-urlencoded;charset=utf-8";
	public static String APP_KEY = "";
	public static String APP_SECRET = "";
	public static String NONCE = "";
	public static MediaType MEDIA_TYPE = new MediaType(MediaType.APPLICATION_FORM_URLENCODED, Charset.forName("UTF-8"));
	// public static MediaType MEDIA_TYPE = MediaType.APPLICATION_FORM_URLENCODED;

	@Override
	public HttpHeaders getHeaders() {
		String curTime = String.valueOf((new Date()).getTime() / 1000L);
		// 参考 计算CheckSum的java代码
		String checkSum = CheckSumBuilder.getCheckSum(APP_SECRET, NONCE, curTime);

		// 设置请求的header
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("AppKey", APP_KEY);
		requestHeaders.add("Nonce", NONCE);
		requestHeaders.add("CurTime", curTime);
		requestHeaders.add("CheckSum", checkSum);
		requestHeaders.setContentType(MEDIA_TYPE);
		return requestHeaders;
	}

}
