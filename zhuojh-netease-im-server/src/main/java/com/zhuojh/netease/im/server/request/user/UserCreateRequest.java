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
 * Function: 创建网易云通信ID请求对象. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午4:08:06
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 创建网易云通信ID请求对象。<br>
 *              POST https://api.netease.im/nimserver/user/create.action HTTP/1.1 <br>
 *              Content-Type:application/x-www-form-urlencoded;charset=utf-8 <br>
 *              1.第三方帐号导入到网易云通信平台； <br>
 *              2.注意accid，name长度以及考虑管理token。 <br>
 */
public class UserCreateRequest extends BaseHttpRequest {

	@Override
	public String getPath() {
		return "user/create.action";
	}

	/**
	 * accid:网易云通信ID，最大长度32字符，必须保证一个 APP内唯一<br>
	 * （只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。.
	 */
	private String accid;

	/** name:网易云通信ID昵称，最大长度64字符，用来PUSH推送 时显示的昵称. */
	private String name;

	/** props:json属性，第三方可选填，最大长度1024字符. */
	private String props;

	/** icon:网易云通信ID头像URL，第三方可选填，最大长度1024. */
	private String icon;

	/** token:网易云通信ID可以指定登录token值，最大长度128字符， 并更新，如果未指定，会自动生成token，并在 创建成功后返回. */
	private String token;

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

	/**
	 * Creates a new instance of UserCreateRequest. <br>
	 * 参数为必填字段
	 * @param accid
	 */
	public UserCreateRequest(String accid) {
		super();
		this.accid = accid;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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
