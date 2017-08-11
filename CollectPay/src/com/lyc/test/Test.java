package com.lyc.test;

import java.util.HashMap;
import java.util.Map;

import com.lyc.pay.IPayFactory;
import com.lyc.pay.PayProxy;
import com.lyc.pay.WxPayFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> par=new HashMap<>();
		/*par.put("appid", "wx3573312402727c69");
		par.put("mch_id", "1480280522");
		par.put("device_info", "WEB");
		par.put("out_trade_no", "1415659990");
		par.put("sign_type", "MD5");
		par.put("sign", "1h4de535fiayz793plmk9unh5bnm5tn8");		
		par.put("channel", "wx");	
		par.put("fee_type", "CNY");	
		par.put("spbill_create_ip", "14.23.150.211");
		par.put("notify_url", "http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php");
		par.put("attach", "÷ß∏∂≤‚ ‘");
		par.put("limit_pay", "no_credit");
		par.put("serverurl", "https://api.mch.weixin.qq.com/pay/orderquery");
		par.put("trade_type", "APP");*/
		
		//par.put("serverurl", "https://api.mch.weixin.qq.com/pay/unifiedorder");
		//par.put("body", "APP÷ß∏∂≤‚ ‘");
		//par.put("total_fee", "1");	
		//par.put("detail", "1h4de535fiayz793plmk9unh5bnm5tn8");
		
		/*PayProxy payproxy=new PayProxy(par);		
		//String result1=payproxy.unifiedorder();	
		//System.out.println(result1);
		String result=payproxy.orderquery();
		System.out.println(result);*/
		
		
		par.put("app_id", "2088421736809767");
		par.put("mch_id", "1480280522");
		par.put("out_trade_no", "1415659990");
		//par.put("trade_no", "2014112611001004680");
		par.put("channel", "alipay");
		/*par.put("sign", "1h4de535fiayz793plmk9unh5bnm5tn8");		
		par.put("body", "APP÷ß∏∂≤‚ ‘");
		par.put("total_fee", "10");
		par.put("spbill_create_ip", "14.23.150.211");
		par.put("notify_url", "http://www.baidu.com/lyc");
		par.put("attach", "÷ß∏∂≤‚ ‘");*/
		par.put("serverurl", "https://openapi.alipay.com/gateway.do");		
		//par.put("serverurl", "https://openapi.alipay.com/gateway.do");		
		par.put("privateKey", "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAOzh8isD3x2uz4qJykmN5ZHcOiynf89+BB26RVEQMqIC985ham5676eXOqhc603IYsGbmSjiOt1fQep4ab9qerVJCl0/I4zZI2DeWltv5j6s7yapHoR15mrFsNjbNNcx+opNrhzIbzvimeHmG/AscFKUAKom5AeNcNsZWmwJyHnvAgMBAAECgYAaZJpc3JORdRa+steNFnhLpiP9MbR14+6FeWmbvJhHoNkHb6cyJBRrsdfhRmkZQ4htVe7ctUglviVUAJKXtz9wmIcbV8IcRBFiucXNcUcy+XRIv/9IP/zi6G/Y9Hcp5z0lDzQygQDGAoXHm+NnAuGzGSckAD/nYREDWAk+pXky4QJBAP9/heDKVMNps+VTwGRZRdnHX9X+PX/m3UNas2/SVNZlMN6PZqlVZq7KhXunGc15KR+OQeGJ3ma9WiEBQBDcmnkCQQDtWQ/sWy549EQtGtO7hhdxgd7vc9lSg42aXESKcVx646kTXKK6Fia0M/mzn7fKJo/v6nqF3SddPTNiELdXYB2nAkAUBNrpjRDtKsgUrOZDNpd5g9yneL862Uz27RFoLpPFJLKajaPemrlr8qRY1vP3nImzVkMlN9c8N5PrSBzL9W0JAkEAuZ7rmxd8cs/l+bh/Wqr17ql45qAdmDCWL+B1IiiiAOHHOwM5qHrmbgwv/tCsdgZOj307sTFSNdNFOi6ElGrxBQJANLuBu12cRajz/itx4itKYRii67grU97af8KR5XuuipKQLP115LxXLOAQTc4zqpUKPoiCN8mFsF2uKRIZvZYxmA==");
		//par.put("privateKey", "MIICXAIBAAKBgQDs4fIrA98drs+KicpJjeWR3Dosp3/PfgQdukVREDKiAvfOYWpueu+nlzqoXOtNyGLBm5ko4jrdX0HqeGm/anq1SQpdPyOM2SNg3lpbb+Y+rO8mqR6EdeZqxbDY2zTXMfqKTa4cyG874pnh5hvwLHBSlACqJuQHjXDbGVpsCch57wIDAQABAoGAGmSaXNyTkXUWvrLXjRZ4S6Yj/TG0dePuhXlpm7yYR6DZB2+nMiQUa7HX4UZpGUOIbVXu3LVIJb4lVACSl7c/cJiHG1fCHEQRYrnFzXFHMvl0SL//SD/84uhv2PR3Kec9JQ80MoEAxgKFx5vjZwLhsxknJAA/52ERA1gJPqV5MuECQQD/f4XgylTDabPlU8BkWUXZx1/V/j1/5t1DWrNv0lTWZTDej2apVWauyoV7pxnNeSkfjkHhid5mvVohAUAQ3Jp5AkEA7VkP7FsuePRELRrTu4YXcYHe73PZUoONmlxEinFceuOpE1yiuhYmtDP5s5+3yiaP7+p6hd0nXT0zYhC3V2AdpwJAFATa6Y0Q7SrIFKzmQzaXeYPcp3i/OtlM9u0RaC6TxSSymo2j3pq5a/KkWNbz95yJs1ZDJTfXPDeT60gcy/VtCQJBALme65sXfHLP5fm4f1qq9e6peOagHZgwli/gdSIoogDhxzsDOah65m4ML/7QrHYGTo99O7ExUjXTRTouhJRq8QUCQDS7gbtdnEWo8/4rceIrSmEYouu4K1Pe2n/CkeV7roqSkCz9deS8VyzgEE3OM6qVCj6IgjfJhbBdrikSGb2WMZg=");
		par.put("key", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB");
		PayProxy payproxy=new PayProxy(par);		
		//String result1=payproxy.unifiedorder();	
		//System.out.println(result1);
		String result=payproxy.orderquery();
		System.out.println(result);
	}

}
