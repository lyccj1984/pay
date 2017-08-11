package com.lyc.pay;

import java.util.Map;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class alipay implements IPayStrategy {

	@Override
	public String payawy(Map<String, String> par) {
		// TODO Auto-generated method stub
		AlipayClient alipayClient = new DefaultAlipayClient(par.get("serverurl"), par.get("appid"),
				par.get("privateKey"), "json", "utf-8", par.get("key"), "RSA2");
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		model.setBody(par.get("body"));
		model.setSubject(par.get("attach"));
		model.setOutTradeNo(par.get("out_trade_no"));
		model.setTimeoutExpress("1000m");
		model.setTotalAmount(par.get("total_fee"));
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setBizModel(model);
		request.setNotifyUrl(par.get("serverurl"));
		AlipayTradeAppPayResponse response = null;
		try {
			// 这里和普通的接口调用不同，使用的是sdkExecute
			response = alipayClient.sdkExecute(request);
			System.out.println(response.isSuccess());
			// System.out.println(response.getBody());// 就是orderString
			// 可以直接给客户端请求，无需再做处理。
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		return response.getBody();
	}

	@Override
	public String orderquery(Map<String, String> par) {
		// TODO Auto-generated method stub
		
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",par.get("app_id"),par.get("privateKey"),"json","GBK",par.get("key"),"RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\"20150320010101001\"," +
		"\"trade_no\":\"2014112611001004680 073956707\"" +
		"  }");
		AlipayTradeQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
		
		
		/*AlipayClient alipayClient = new DefaultAlipayClient(par.get("serverurl"), par.get("app_id"),par.get("privateKey"), "json", "GBK", par.get("key"), "RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		//request.setBizContent(new AliPayFactory().createPayModel().orderquery(par));
		request.setBizContent("{" +
				"\"out_trade_no\":\"20150320010101001\"," +
				"\"trade_no\":\"2014112611001004680 073956707\"" +
				"  }");
		AlipayTradeQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (response.isSuccess()) {
			response.getBody();
			System.out.println("调用成功" + response.getBody());
		} else {
			System.out.println("调用失败" + response.getBody());
		}*/
		return response.getBody();
	}

}
