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

import java.util.List;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 发送广播消息请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午8:41:27
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 消息撤回。<br>
 *              POST https://api.netease.im/nimserver/msg/broadcastMsg.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述： 1、广播消息，可以对应用内的所有用户发送广播消息，广播消息目前暂不支持第三方推送（APNS、小米、华为等）；<br>
 *              2、广播消息支持离线存储，并可以自定义设置离线存储的有效期，最多保留最近100条离线广播消息；<br>
 *              3、此接口受频率控制，一个应用一分钟最多调用10次，一天最多调用1000次，超过会返回416状态码；<br>
 *              4、该功能目前需申请开通，详情可咨询您的客户经理。<br>
 */
public class MsgBroadcastRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "msg/broadcastMsg.action";
	}

	/** body:广播消息内容，最大4096字符. */
	private String body;

	/** from:发送者accid, 用户帐号，最大长度32字符，必须保证一个APP内唯一. */
	private String from;

	/** isOffline:是否存离线，true或false，默认false. */
	private Boolean isOffline;

	/** ttl:存离线状态下的有效期，单位小时，默认7天. */
	private int ttl;

	/** targetOs:目标客户端，默认所有客户端，jsonArray，格式：["ios","aos","pc","web","mac"]. */
	private List<String> targetOs;

	/**
	 * Creates a new instance of MsgBroadcastRequest. <br>
	 * 参数为必填字段
	 * @param body
	 */
	public MsgBroadcastRequest(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Boolean getIsOffline() {
		return isOffline;
	}

	public void setIsOffline(Boolean isOffline) {
		this.isOffline = isOffline;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public List<String> getTargetOs() {
		return targetOs;
	}

	public void setTargetOs(List<String> targetOs) {
		this.targetOs = targetOs;
	}

}
