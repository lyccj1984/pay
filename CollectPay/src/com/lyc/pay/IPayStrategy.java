package com.lyc.pay;

import java.util.Map;

public interface IPayStrategy {

	public String payawy(Map<String, String> par);
	
	public String orderquery(Map<String,String>par);
}
