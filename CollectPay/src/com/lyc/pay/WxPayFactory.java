package com.lyc.pay;

public class WxPayFactory implements IPayFactory {

	@Override
	public IPayModel createPayModel() {
		// TODO Auto-generated method stub
		return new WxPayModel();
	}

}
