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

package com.zhuojh.netease.im.server.request.user;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: 更新用户名片请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 更新用户名片请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/updateUinfo.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              接口描述：更新用户名片。用户名片中包含的用户信息，在群组、聊天室等场景下，会暴露给群组、聊天室内的其他用户。<br>
 *              这些字段里mobile，email，birth，gender等字段属于非必填、可能涉及隐私的信息，如果您的业务下，这些信息为敏感信息，建议在通过扩展字段ex填写相关资料并事先加密。。 <br>
 */
public class UserUpdateUinfoRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "/user/updateUinfo.action";
	}

	/** 用户帐号（例如：JSONArray对应的accid串，如：["zhangsan"]，如果解析出错，会报414）（一次查询最多为200）。 */
	private String accids;

	/** name:网易云通信ID昵称，最大长度64字符，用来PUSH推送 时显示的昵称. */
	private String name;

	/** icon:网易云通信ID头像URL，第三方可选填，最大长度1024. */
	private String icon;

	/** sign:用户签名，最大长度256字符. */
	private String sign;

	/** email:用户email，最大长度64字符. */
	private String email;

	/** birth:用户生日，最大长度16字符. */
	private String birth;

	/** mobile:用户mobile，最大长度32字符，非中国大陆手机号码需要填写国家代码(如美国：+1-xxxxxxxxxx)或地区代码(如香港：+852-xxxxxxxx). */
	private String mobile;

	/** gender:用户性别，0表示未知，1表示男，2女表示女，其它会报参数错误. */
	private int gender;

	/** ex:用户名片扩展字段，最大长度1024字符，用户可自行扩展，建议封装成JSON字符串. */
	private String ex;

	public String getAccids() {
		return accids;
	}

	public void setAccids(String accids) {
		this.accids = accids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}
}
