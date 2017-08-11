package com.lyc.pay;

import java.util.Map;

public interface IPayProxy {

	/***
	 * 统计一下单接口
	 * @return
	 */
	public String unifiedorder();
	/***
	 * 定单查询接口
	 * @return
	 */
	public String orderquery();
	
	/***
	 * 关闭订单接口
	 * @return
	 */
	public String closeorder();
	/***
	 * 申请退款接口
	 * @return
	 */
	public String refund();
	
	/***
	 * 查询退款接口
	 * @return
	 */
	public String refundquery();

}
