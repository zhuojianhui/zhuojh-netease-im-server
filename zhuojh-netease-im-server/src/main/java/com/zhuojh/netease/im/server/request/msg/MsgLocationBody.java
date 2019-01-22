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

/**
 * Function: 发送地理位置消息体. <br>
 * Reason: TODO ADD REASON. <br>
 * Date: 2019年1月21日 下午9:55:32
 * @author zhuojianhui@gmail.com
 * @since 1.0
 * @description 发送地理位置消息体
 */
public class MsgLocationBody implements MsgBody {

	/** title:地理位置title. */
	private String title;

	/** lng:经度. */
	private double lng;

	/** lat:纬度. */
	private double lat;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

}
