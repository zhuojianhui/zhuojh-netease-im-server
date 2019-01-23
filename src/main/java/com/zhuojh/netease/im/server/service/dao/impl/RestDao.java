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

package com.zhuojh.netease.im.server.service.dao.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhuojh.netease.im.server.request.BaseHttpRequest;
import com.zhuojh.netease.im.server.service.dao.IRestDao;

/**
 * Function: Rest数据访问实现类. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月22日 下午3:24:18
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description
 */
@Service
public class RestDao implements IRestDao {

	private ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	RestTemplate restTemplate;

	@Override
	public <T> T execute(BaseHttpRequest request, Class<T> responseType) {
		// 如果是表单提交
		List<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		LinkedMultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		// 得到类对象
		Class<?> clazz = (Class<?>) request.getClass();
		/* 得到类中的所有属性集合 */
		Field[] fields = clazz.getDeclaredFields();
		try {

			Object val = null;
			for (int index = 0; index < fields.length; index++) {
				Field field = fields[index];
				field.setAccessible(true); // 设置此属性是可以访问的
				if (!Modifier.isStatic(field.getModifiers())) {
					val = field.get(request);
					if (val == null) {
						val = "";
					} else {
						bodyMap.add(field.getName(), val.toString());
					}
					nvpList.add(new BasicNameValuePair(field.getName(), val.toString()));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		String writeValueAsString = null;
		try {
			writeValueAsString = objectMapper.writeValueAsString(request);
			System.out.print(writeValueAsString);
		} catch (JsonProcessingException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		HttpEntity<LinkedMultiValueMap<String, String>> httpEntity = new HttpEntity<>(bodyMap, request.getHeaders());
		ResponseEntity<T> responseEntity = restTemplate.exchange(request.getURI(), request.getMethod(), httpEntity,
				responseType);
		return responseEntity.getBody();
	}

}
