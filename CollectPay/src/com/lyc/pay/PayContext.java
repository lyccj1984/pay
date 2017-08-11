package com.lyc.pay;

import java.util.Map;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class PayContext {

	IPayStrategy payStarategy;

	private final static Logger logger = (Logger) LoggerFactory.getLogger(PayContext.class);

	private String channel = null;

	private Map<String, String> mappar;

	private String getchannel() {
		String channel = mappar.get("channel");
		if (channel == null || channel.isEmpty()) {
			logger.info("收到支付渠道为空");
			return null;
		}

		return channel;
	}

	public PayContext(Map<String, String> mappar) {

		try {
			this.mappar = mappar;
			Class<?> temclass = Class.forName("com.lyc.pay." + getchannel());
			this.payStarategy = (IPayStrategy) temclass.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("初始化类==不能找到");
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error("初始化类==不能创建实列");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error("初始化类==创建类失败");
			e.printStackTrace();
		}

	}

	public String pay() {
		return payStarategy.payawy(mappar);
	}
	
	public String orderquery()
	{
		return payStarategy.orderquery(mappar);
	}

}
