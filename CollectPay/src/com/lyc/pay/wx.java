package com.lyc.pay;

import java.util.Map;

import com.lyc.common.HttpRequestUtils;

public class wx implements IPayStrategy {

	@Override
	public String payawy(Map<String, String> par) {
		// TODO Auto-generated method stub
		return HttpRequestUtils.httpPostxml(par.get("serverurl"),new WxPayFactory().createPayModel().appPay(par),false);	
	}

	@Override
	public String orderquery(Map<String, String> par) {
		// TODO Auto-generated method stub
		return HttpRequestUtils.httpPostxml(par.get("serverurl"),new WxPayFactory().createPayModel().orderquery(par),false);
	}

}
