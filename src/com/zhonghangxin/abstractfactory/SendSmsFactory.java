package com.zhonghangxin.abstractfactory;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
