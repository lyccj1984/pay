package com.lyc.pay;

public interface IPayFactory {

	 IPayModel payModel=null;
	 
	 public IPayModel createPayModel();
}
