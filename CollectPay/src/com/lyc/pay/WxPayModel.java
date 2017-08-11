package com.lyc.pay;

import java.util.Map;

import javax.xml.bind.JAXBException;

import org.slf4j.LoggerFactory;

import com.lyc.vo.WxOrderPar;

import ch.qos.logback.classic.Logger;

public class WxPayModel implements IPayModel {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(WxPayModel.class);
	@Override
	public String appPay(Map<String, String> Par) {
		// TODO Auto-generated method stub

		String result = null;

		try {
			result = new WxOrderPar.Builder(Par.get("appid"), Par.get("mch_id")).device_info(Par.get("device_info"))
					.nonce_str(32).sign_type(Par.get("sign_type")).body(Par.get("body")).detail(Par.get("detail"))
					.attach(Par.get("attach")).out_trade_no(Par.get("out_trade_no")).fee_type(Par.get("fee_type"))
					.total_fee(Par.get("total_fee")).spbill_create_ip(Par.get("spbill_create_ip"))
					.time_start(Par.get("time_start")).time_expire(Par.get("time_expire"))
					.goods_tag(Par.get("goods_tag")).notify_url(Par.get("notify_url")).trade_type(Par.get("trade_type"))
					.limit_pay(Par.get("limit_pay")).scene_info(Par.get("scene_info")).sign(Par.get("sign")).bulid()
					.toxml();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println(result);
		return result;

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
	public String subPay(Map par) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String orderquery(Map<String, String> par) {
		// TODO Auto-generated method stub
		String result = null;

		try {
			result = new WxOrderPar.Builder(par.get("appid"), par.get("mch_id")).transaction_id(par.get("transaction_id")).out_trade_no(par.get("out_trade_no"))
					.device_info(par.get("device_info")).nonce_str(32).sign(par.get("sign")).bulid().toxml();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			logger.error("查询订单出错了!");
			e.printStackTrace();
		}

		return result;
	}

}
