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

package com.zhuojh.netease.im.server.service.dao;

import com.zhuojh.netease.im.server.request.BaseHttpRequest;

/**
 * Function: Rest数据访问接口定义. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 下午3:20:16
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description
 */
public interface IRestDao {
	<T> T execute(BaseHttpRequest request, Class<T> responseType);
}
