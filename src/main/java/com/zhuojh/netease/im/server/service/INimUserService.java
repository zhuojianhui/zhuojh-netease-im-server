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

package com.zhuojh.netease.im.server.service;

import com.zhuojh.netease.im.server.request.user.UserCreateRequest;
import com.zhuojh.netease.im.server.request.user.UserUpdateRequest;
import com.zhuojh.netease.im.server.response.user.UserCreateResponse;

/**
 * Function: 用户服务接口定义. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 下午2:25:24
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 用户服务接口
 */
public interface INimUserService {

	UserCreateResponse create(UserCreateRequest request);

	void update(UserUpdateRequest request);

}
