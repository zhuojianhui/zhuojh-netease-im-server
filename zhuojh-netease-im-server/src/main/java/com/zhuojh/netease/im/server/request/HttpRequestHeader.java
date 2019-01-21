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

package com.zhuojh.netease.im.server.request;

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

	@Override
	public HttpHeaders getHeaders() {
		String curTime = String.valueOf((new Date()).getTime() / 1000L);
		String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce, curTime);// 参考 计算CheckSum的java代码

		HttpHeaders requestHeaders = new HttpHeaders();
		// 设置请求的header
		requestHeaders.add("AppKey", appKey);
		requestHeaders.add("Nonce", nonce);
		requestHeaders.add("CurTime", curTime);
		requestHeaders.add("CheckSum", checkSum);
		requestHeaders.add(HttpHeaders.CONTENT_TYPE, CONTENT_TYPE);
		return requestHeaders;
	}

	/** appKey:开发者平台分配的appkey. */
	private String appKey;
	/** appSecret:开发者平台设置的应用密钥. */
	private String appSecret;
	/** nonce:随机数（最大长度128个字符）. */
	private String nonce;
	/** curTime:当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String). */
	private String curTime;
	/** checkSum:SHA1(AppSecret + Nonce + CurTime)，三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写). */
	private String checkSum;

}
