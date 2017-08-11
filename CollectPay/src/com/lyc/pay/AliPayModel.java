package com.lyc.pay;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lyc.vo.AliPayAppPar;
import com.lyc.vo.AlipayPubPar;

public class AliPayModel implements IPayModel {

	@Override
	public String appPay(Map<String, String> par) {
		// TODO Auto-generated method stub\
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
				par.get("appid"), par.get("privateKey"), "json", "utf-8", par.get("key"), "RSA2");
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		model.setBody(par.get("body"));
		model.setSubject(par.get("attach"));
		model.setOutTradeNo(par.get("out_trade_no"));
		model.setTimeoutExpress("30m");
		model.setTotalAmount(par.get("total_fee"));
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setBizModel(model);
		request.setNotifyUrl(par.get("serverurl"));
		AlipayTradeAppPayResponse response = null;
		try {
			// 这里和普通的接口调用不同，使用的是sdkExecute
			response = alipayClient.sdkExecute(request);
			// System.out.println(response.getBody());// 就是orderString
			// 可以直接给客户端请求，无需再做处理。
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		return response.getBody();
	}

	@Override
	public String cardPay(Map<String, String> par) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String H5Pay(Map<String, String> par) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String scanPay(Map<String, String> par) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String subPay(Map<String, String> par) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String orderquery(Map<String, String> par) {
		// TODO Auto-generated method stub

		String result = null;

		result = new AliPayAppPar.Builder("", "").out_trade_no(par.get("out_trade_no")).trade_no(par.get("trade_no"))
				.builder().tojson();

		System.out.println(result);
		return result;
	}

}
