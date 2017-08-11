package com.lyc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AlipayPubPar {


	public String app_id; // 支付宝分配给开发者的应用ID y
	public String method; // 接口名称 y
	public String format; // 仅支持JSON n
	public String charset; // 请求使用的编码格式，如utf-8,gbk,gb2312等 y
	public String sign_type; // 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2 y
	public String sign; // 商户请求参数的签名串，详见签名 y
	public String timestamp; // 发送请求的时间，格式"yyyy-MM-dd HH:mm:ss" y
	public String version; // 调用的接口版本，固定为：1.0 y
	public String notify_url; // 支付宝服务器主动通知商户服务器里指定的页面 N
	public String app_auth_token; // 详见应用授权概述 N
	public String biz_content; // 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档N

	

}
