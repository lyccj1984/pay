package com.lyc.vo;

import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.qos.logback.classic.Logger;

public class AliPayAppPar extends AlipayPubPar {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(AliPayAppPar.class);

	public String out_trade_no; // 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复 y

	public String scene; // 支付场景 y

	public String trade_no;

	public AliPayAppPar(Builder builder) {
		
		if (builder.app_id != null && !builder.app_id.isEmpty()) {
			this.app_id = builder.app_id;
		}
		
		if (builder.method != null && !builder.method.isEmpty()) {
			this.method = builder.method;
		}

		if (builder.out_trade_no != null && !builder.out_trade_no.isEmpty()) {
			this.out_trade_no = builder.out_trade_no;
		}

		if (builder.trade_no != null && !builder.trade_no.isEmpty()) {
			this.trade_no = builder.trade_no;
		}

	}

	public static class Builder extends AlipayPubPar {

		private String out_trade_no;

		private String trade_no;

		public Builder(String app_id, String method) {
			this.app_id = app_id;
			this.method = method;
		}

		public Builder out_trade_no(String out_trade_no) {
			if (out_trade_no != null && !out_trade_no.isEmpty()) {
				this.out_trade_no = out_trade_no;
			}

			return this;
		}

		public Builder trade_no(String trade_no) {
			if (trade_no != null && !trade_no.isEmpty()) {
				this.trade_no = trade_no;
			}
			return this;
		}

		public AliPayAppPar builder() {
			return new AliPayAppPar(this);
		}
	}

	public String tojson() {

		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, Boolean.FALSE);
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
		String json = null;
		try {
			json =mapper.writeValueAsString(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("支付宝参数转换json时出错");
			e.printStackTrace();
		}
		System.out.println(json);
		return json;
	}
}
