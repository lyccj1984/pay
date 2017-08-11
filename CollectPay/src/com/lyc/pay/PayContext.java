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
			logger.info("�յ�֧������Ϊ��");
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
			logger.error("��ʼ����==�����ҵ�");
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error("��ʼ����==���ܴ���ʵ��");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error("��ʼ����==������ʧ��");
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
