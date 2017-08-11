package com.lyc.pay;

import java.util.Map;

public interface IPayModel {

	public String appPay(Map<String,String> Par);
	
	
	public String cardPay(Map<String,String> par);
	
	
	public String H5Pay(Map<String,String> par);
	
	
	public String scanPay(Map<String,String> par);
	
	
	public String subPay(Map<String,String> par);
	
	
	public String orderquery(Map<String,String> par);
}
