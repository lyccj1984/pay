package com.lyc.pay;

import java.util.Map;

public interface IPayProxy {

	/***
	 * ͳ��һ�µ��ӿ�
	 * @return
	 */
	public String unifiedorder();
	/***
	 * ������ѯ�ӿ�
	 * @return
	 */
	public String orderquery();
	
	/***
	 * �رն����ӿ�
	 * @return
	 */
	public String closeorder();
	/***
	 * �����˿�ӿ�
	 * @return
	 */
	public String refund();
	
	/***
	 * ��ѯ�˿�ӿ�
	 * @return
	 */
	public String refundquery();

}
