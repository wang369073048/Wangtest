package com.zhonghangxin.abstractfactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("SmsSender ---");
	}

}
