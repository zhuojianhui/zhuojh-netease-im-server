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

package com.zhuojh.netease.im.server.request.user;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 设置黑名单/静音请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 设置黑名单/静音请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/setSpecialRelation.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：拉黑/取消拉黑；设置静音/取消静音 <br>
 */
public class UserSetSpecialRelationRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "user/setSpecialRelation.action";
	}

	/**
	 * accid:网易云通信ID，最大长度32字符，必须保证一个 APP内唯一<br>
	 * （只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。.
	 */
	private String accid;

	/** targetAcc:被加黑或加静音的帐号. */
	private String targetAcc;

	/** relationType:本次操作的关系类型,1:黑名单操作，2:静音列表操作. */
	private int relationType;

	/** value:操作值，0:取消黑名单或静音，1:加入黑名单或静音. */
	private int value;

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getTargetAcc() {
		return targetAcc;
	}

	public void setTargetAcc(String targetAcc) {
		this.targetAcc = targetAcc;
	}

	public int getRelationType() {
		return relationType;
	}

	public void setRelationType(int relationType) {
		this.relationType = relationType;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
