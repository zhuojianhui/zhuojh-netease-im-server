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

package com.zhuojh.netease.im.server.response;

/**
 * Function: 服务器响应代码枚举定义类. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 上午11:44:28
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 服务器响应code状态表
 */
public enum ResponseCode {

	SUCCESS("操作成功", 200),	
	SDK_VERSION_ERROR("客户端版本不对，需升级sdk", 201),	
	BLOCKED("被封禁", 301),	
	USERNAME_OR_PASSWORD_INVALID("用户名或密码错误", 302),	
    IP_LIMITED("IP限制", 315),	
    NO_PERIMISSION("非法操作或没有权限", 403),	
    NOT_FOUND("对象不存在", 404),	
    PARAMETER_TOO_LONG("参数长度过长", 405),	
    READONLY("对象只读", 406),	
    TIMEOUT("客户端请求超时", 408),	
    SMS_VALIDATION_FAILED("验证失败(短信服务),", 413),	
    PARAMETER_ERROR("参数错误", 414),	
    CLIENT_NETWORK_ERROR("客户端网络问题", 415),	
    RATE_LIMITED("频率控制", 416),	
    REPEAT_OPTIONS("重复操作", 417),	
    SMS_CHANNEL_ERROR("通道不可用(短信服务),", 418),	
    COUNT_LIMITED("数量超过上限", 419),	
    DISABLED_ACCOUNT("账号被禁用",	422),	
    MUTE_ACCOUNT("帐号被禁言", 423),	
    REPEAT_HTTP("HTTP重复请求", 431),	
    SERVER_ERROR("服务器内部错误", 500),	
    SERVER_BUSY("服务器繁忙", 503),	
    MSG_RECALL_TIMEOUT("消息撤回时间超限", 508),	
    INVALID_PROTOCOL("无效协议", 509),	
    SERVER_NOT_AVALIABLE("服务不可用",	514),	
    UNZIP_ERROR("解包错误", 998),	
    ZIP_ERROR("打包错误", 999),
    
	/** 群相关错误码 */
	TEAM_UPPER_LIMIT("群人数达到上限", 801),	
    LIMITED_AUTHORITY("没有权限", 802),	
    TEAM_NOT_EXIST("群不存在", 803),	
    USER_NOT_IN_TEAM("用户不在群", 804),	
    TEAM_TYPE_ERROR("群类型不匹配", 805),	
    CREATE_TEAM_COUNT_LIMIT("创建群数量达到限制", 806),	
    TEAM_MEMBER_STATUS_ERROR("群成员状态错误", 807),	
    APPLY_SUCCESS("申请成功", 808),	
    USER_ALREADY_IN_TEAM("已经在群内", 809),	
    INVITE_SUCCESS("邀请成功", 810),	
    ACCOUNT_UPPER_LIMIT("@账号数量超过限制", 	811),	
    TEAM_MUTE_NOT_ALLOW_MEMBER_SEND_MSG("群禁言，普通成员不能发送消息", 	812),	
    TEAM_ADD_MEMBER_PARTIAL_SUCCESS("群拉人部分成功", 813),	
    FORBID_USE_TEAM_READED_SERVICE("禁止使用群组已读服务", 814),	
    TEAM_ADMINISTRATOR_UPPER_LIMIT("群管理员人数超过上限", 815),
    
	/** 音视频、白板通话相关错误码 */
	INVALID_CHANNEL("通道失效", 9102),	
    RESPONSE_END("已经在他端对这个呼叫响应过了", 9103),	
    OTHER_SIDE_OFFLINE("通话不可达，对方离线状态", 11001),
    
	/** 聊天室相关错误码 */
	IM_LINK_STATUS_ERROR("IM主连接状态异常", 13001),	
    CHATROOM_STATUS_ERROR("聊天室状态异常", 13002),	
    ACCOUNT_IN_BLACKLIST_NOT_ALLOW("账号在黑名单中,不允许进入聊天室", 13003),	
    ACCOUNT_IN_MUTE_LIST("在禁言列表中,不允许发言", 13004),	
    USER_CHATROOM_NICKNAME_ANTI_SPAM("用户的聊天室昵称、头像或成员扩展字段被反垃圾", 13005),
    
	/** 特定业务相关错误码 */
	EMAIL_FORMAT_ERROR("输入email不是邮箱", 10431),	
    MOBILE_FORMAT_ERROR("输入mobile不是手机号码", 10432),	
    ENTERED_PASSWORDS_DIFFER("注册输入的两次密码不相同", 10433),	
    COMPANY_NOT_EXIST("企业不存在", 10434),	
    INVALID_USERNAME_OR_PASSWORD("登陆密码或帐号不对", 10435),	
    APP_NOT_EXIST("app不存在", 10436),	
    EMAIL_REGIDSTER("email已注册", 10437),	
    MOBILE_REGISTED("手机号已注册", 10438),	
    APP_NAME_EXISTED("app名字已经存在", 10441);

	private String description;
	private int code;

	private ResponseCode(String description, int code) {
		this.description = description;
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static ResponseCode parse(int code) {
		for (ResponseCode responseCode : ResponseCode.values()) {
			if (responseCode.getCode() == code) {
				return responseCode;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.description;
	}

}
