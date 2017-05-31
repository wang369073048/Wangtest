package com.zhonghangxin.templatemethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         AbstractTemplate  at = new ConcreteTemplate();
         at.templateMethod();
	}

}
