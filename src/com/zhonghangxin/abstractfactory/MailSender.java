package com.zhonghangxin.abstractfactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("MailSender -----");
	}

}
