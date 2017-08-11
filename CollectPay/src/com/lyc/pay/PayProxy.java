package com.lyc.pay;

import java.util.Map;

import org.slf4j.LoggerFactory;

import com.lyc.common.HttpRequestUtils;

import ch.qos.logback.classic.Logger;

public class PayProxy implements IPayProxy {

	private IPayFactory payfactory;

	private Map<String, String> mappar;

	private final static Logger logger = (Logger) LoggerFactory.getLogger(PayProxy.class);
	
	PayContext pc;
	
	public PayProxy(Map<String, String> paymap) {
		mappar = paymap;
		pc= new PayContext(mappar);
	}

	@Override
	public String unifiedorder() {
		String results = null;		
		results = pc.pay();
		return results;
	}

	@Override
	public String orderquery() {
		// TODO Auto-generated method stub
		return pc.orderquery();
	}

	@Override
	public String closeorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String refund() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String refundquery() {
		// TODO Auto-generated method stub
		return null;
	}

}
