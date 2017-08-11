package com.lyc.vo;

import java.util.SortedMap;
import java.util.TreeMap;
import javax.xml.bind.JAXBException;
import org.slf4j.LoggerFactory;

import com.lyc.common.AlgorithmMy;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

import ch.qos.logback.classic.Logger;

@XStreamAlias("xml")
public class WxOrderPar {

	public WxOrderPar(Builder bulid) {

		if (bulid.appid != null && !bulid.appid.isEmpty())
			this.appid = bulid.appid;
		if (bulid.mch_id != null && !bulid.mch_id.isEmpty())
			this.mch_id = bulid.mch_id;
		if (bulid.device_info != null && !bulid.device_info.isEmpty())
			this.device_info = bulid.device_info;
		if (bulid.out_trade_no != null && !bulid.out_trade_no.isEmpty())
			this.out_trade_no = bulid.out_trade_no;
		if (bulid.sign != null && !bulid.sign.isEmpty())
			this.sign = bulid.sign;
		if (bulid.sign_type != null && !bulid.sign_type.isEmpty())
			this.sign_type = bulid.sign_type;
		if (bulid.body != null && !bulid.body.isEmpty())
			this.body = bulid.body;
		if (bulid.detail != null && !bulid.detail.isEmpty())
			this.detail = bulid.detail;
		if (bulid.attach != null && !bulid.attach.isEmpty())
			this.attach = bulid.attach;
		if (bulid.fee_type != null && !bulid.fee_type.isEmpty())
			this.fee_type = bulid.fee_type;
		if (bulid.total_fee!=null&&bulid.total_fee.isEmpty())
			this.total_fee = bulid.total_fee;
		if (bulid.spbill_create_ip != null && !bulid.spbill_create_ip.isEmpty())
			this.spbill_create_ip = bulid.spbill_create_ip;
		if (bulid.time_start != null && !bulid.time_start.isEmpty())
			this.time_start = bulid.time_start;
		if (bulid.time_expire != null && !bulid.time_expire.isEmpty())
			this.time_expire = bulid.time_expire;
		if (bulid.goods_tag != null && !bulid.goods_tag.isEmpty())
			this.goods_tag = bulid.goods_tag;
		if (bulid.notify_url != null && !bulid.notify_url.isEmpty())
			this.notify_url = bulid.notify_url;
		if (bulid.trade_type != null && !bulid.trade_type.isEmpty())
			this.trade_type = bulid.trade_type;
		if (bulid.limit_pay != null && !bulid.limit_pay.isEmpty())
			this.limit_pay = bulid.limit_pay;
		if (bulid.scene_info != null && !bulid.scene_info.isEmpty())
			this.scene_info = bulid.scene_info;
		if (bulid.nonce_str != null && !bulid.nonce_str.isEmpty())
			this.nonce_str = bulid.nonce_str;
	}

	private final static Logger logger = (Logger) LoggerFactory.getLogger(WxOrderPar.class);

	@SuppressWarnings("unused")
	private String appid = null; // 应用ID 是

	@SuppressWarnings("unused")
	private String mch_id = null;// 商户号 是

	@SuppressWarnings("unused")
	private String device_info = null; // device_info y

	@SuppressWarnings("unused")
	private String nonce_str = null; // 随机字符串 y

	@SuppressWarnings("unused")
	private String sign = null; // 签名 y

	@SuppressWarnings("unused")
	private String sign_type = null; // 签名类型 否

	@SuppressWarnings("unused")
	private String body = null; // 商品描述 y

	@SuppressWarnings("unused")
	private String detail = null; // 商品详情 否

	@SuppressWarnings("unused")
	private String attach = null; // 附加数据 否

	@SuppressWarnings("unused")
	private String out_trade_no = null; // 商户订单号 y

	@SuppressWarnings("unused")
	private String fee_type = null; // 货币类型 否

	@SuppressWarnings("unused")
	private String total_fee=null ; // 总金额 y

	@SuppressWarnings("unused")
	private String spbill_create_ip = null; // 终端IP y

	@SuppressWarnings("unused")
	private String time_start = null; // 交易起始时间 否

	@SuppressWarnings("unused")
	private String time_expire = null; // 交易结束时间 否

	@SuppressWarnings("unused")
	private String goods_tag = null; // 订单优惠标记 否

	@SuppressWarnings("unused")
	private String notify_url = null; // 通知地址 y

	@SuppressWarnings("unused")
	private String trade_type =null; // 交易类型 y

	@SuppressWarnings("unused")
	private String limit_pay = null; // 指定支付方式 否

	@SuppressWarnings("unused")
	private String scene_info = null; // 场景信息 否
	
	private String transaction_id;//微信的订单号（只有在查询的时候才用）

	public static class Builder {

		private String appid; // 应用ID 是

		private String mch_id;// 商户号 是

		private String device_info =null; // device_info y

		private String nonce_str; // 随机字符串 y

		private String sign; // 签名 y

		private String sign_type = null; // 签名类型 否

		private String body; // 商品描述 y

		private String detail; // 商品详情 否

		private String attach; // 附加数据 否

		private String out_trade_no; // 商户订单号 y

		private String fee_type ; // 货币类型 否

		private String total_fee ; // 总金额 y

		private String spbill_create_ip ; // 终端IP y

		private String time_start; // 交易起始时间 否

		private String time_expire; // 交易结束时间 否

		private String goods_tag; // 订单优惠标记 否

		private String notify_url; // 通知地址 y

		private String trade_type  ; // 交易类型 y

		private String limit_pay  ; // 指定支付方式 否

		private String scene_info; // 场景信息 否
		
		private String transaction_id;//微信的订单号（只有在查询的时候才用）

		public Builder sign(String sign) {
			SortedMap<String, String> params = new TreeMap<String, String>();

			params.put("appid", this.appid);
			params.put("mch_id", this.mch_id);
			params.put("device_info", this.device_info);
			params.put("nonce_str", this.nonce_str);
			params.put("sign_type", this.sign_type);
			params.put("body", this.body);
			params.put("detail", this.detail);
			params.put("attach", this.attach);
			params.put("out_trade_no", this.out_trade_no);
			params.put("fee_type", this.fee_type);
			params.put("total_fee", this.total_fee);
			params.put("spbill_create_ip", this.spbill_create_ip);
			params.put("time_start", this.time_start);
			params.put("time_expire", this.time_expire);
			params.put("goods_tag", this.goods_tag);
			params.put("notify_url", this.notify_url);
			params.put("trade_type", this.trade_type);
			params.put("limit_pay", this.limit_pay);
			params.put("scene_info", this.scene_info);
			params.put("transaction_id", this.transaction_id);

			this.sign = AlgorithmMy.wxgetsign(params, sign);

			return this;
		}

		public Builder(String appid, String mch_id) {

			this.appid = appid;
			this.mch_id = mch_id;
			// TODO Auto-generated constructor stub
		}

		public Builder device_info(String device_info) {
			if (device_info != null && !device_info.isEmpty())
				this.device_info = device_info;
			return this;
		}

		public Builder nonce_str(int len) {
			this.nonce_str = AlgorithmMy.wxgetnonce_str(len);
			return this;
		}

		public Builder sign_type(String sign_type) {
			if (sign_type != null && !sign_type.isEmpty())
				this.sign_type = sign_type;
			return this;
		}

		public Builder body(String body) {
			if (body != null && !body.isEmpty())
				this.body = body;
			return this;
		}

		public Builder detail(String detail) {
			if (detail != null && !detail.isEmpty())
				this.detail = detail;
			return this;
		}

		public Builder attach(String attach) {
			if (attach != null && !attach.isEmpty())
				this.attach = attach;
			return this;
		}

		public Builder total_fee(String total_fee) {
			if (total_fee != null && !total_fee.isEmpty()) {
				this.total_fee = total_fee;
			}
			return this;
		}

		public Builder fee_type(String fee_type) {
			if (fee_type != null && !fee_type.isEmpty())
				this.fee_type = fee_type;
			return this;
		}

		public Builder spbill_create_ip(String spbill_create_ip) {
			if (spbill_create_ip != null && !spbill_create_ip.isEmpty())
				this.spbill_create_ip = spbill_create_ip;
			return this;
		}

		public Builder time_start(String time_start) {
			if (time_start != null && !time_start.isEmpty())
				this.time_start = time_start;
			return this;
		}

		public Builder time_expire(String time_expire) {
			if (time_expire != null && !time_expire.isEmpty())
				this.time_expire = time_expire;
			return this;
		}

		public Builder goods_tag(String goods_tag) {
			if (goods_tag != null && !goods_tag.isEmpty())
				this.goods_tag = goods_tag;
			return this;
		}

		public Builder notify_url(String notify_url) {
			if (notify_url != null && !notify_url.isEmpty())
				this.notify_url = notify_url;
			return this;
		}

		public Builder trade_type(String trade_type) {
			if (trade_type != null && !trade_type.isEmpty())
				this.trade_type = trade_type;
			return this;
		}

		public Builder limit_pay(String limit_pay) {
			if (limit_pay != null && !limit_pay.isEmpty())
				this.limit_pay = limit_pay;
			return this;
		}

		public Builder scene_info(String scene_info) {
			if (scene_info != null && !scene_info.isEmpty())
				this.scene_info = scene_info;
			return this;
		}

		public Builder out_trade_no(String out_trade_no) {
			if (out_trade_no != null && !out_trade_no.isEmpty())
				this.out_trade_no = out_trade_no;
			return this;
		}
		public Builder transaction_id(String transaction_id) {
			if (transaction_id != null && !transaction_id.isEmpty())
				this.transaction_id = transaction_id;
			return this;
		}

		public WxOrderPar bulid() {
			return new WxOrderPar(this);
		}

	}

	public String toxml() throws JAXBException {
		XStream xstream = new XStream(new XppDriver(new XmlFriendlyNameCoder("__", "_")));
		xstream.autodetectAnnotations(true);
		String xmlObj = xstream.toXML(this).toString(); // 生成XML字符串
		// System.out.println(xmlObj);
		return xmlObj;
	}

}
