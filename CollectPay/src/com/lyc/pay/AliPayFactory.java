package com.lyc.pay;

public class AliPayFactory implements IPayFactory {

	@Override
	public IPayModel createPayModel() {
		// TODO Auto-generated method stub
		return new AliPayModel();
	}

}
