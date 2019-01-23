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

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Function: 用于规范. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:21:20
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description Http请求基础类
 */
public abstract class BaseHttpRequest implements HttpRequest, Serializable {

	static final String NIM_DOMAIN = "https://api.netease.im/nimserver/";

	@JsonIgnore
	@Override
	public HttpHeaders getHeaders() {
		return new HttpRequestHeader().getHeaders();
	}

	@JsonIgnore
	@Override
	public URI getURI() {
		try {
			return new URI(NIM_DOMAIN + getPath());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}

	@JsonIgnore
	@Override
	public HttpMethod getMethod() {
		return HttpMethod.POST;
	}

	@JsonIgnore
	abstract public String getPath();

}
