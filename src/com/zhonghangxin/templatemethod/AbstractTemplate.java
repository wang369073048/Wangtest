package com.zhonghangxin.templatemethod;

public abstract class AbstractTemplate {
	
	public void templateMethod(){
		int a = concreteMethod();
		int b = abstractMethod();
		int c = a * b;
		System.out.println(c);
        System.out.println("1111111111");
        System.out.println("2222222222222");
        System.out.println("1111111111");
        System.out.println("1111111111");
        System.out.println("33333333333");
        System.out.println("44444444444");
	}
	public abstract int abstractMethod();
	
	public void hookMethod(){}
	
	private int concreteMethod(){
	     return 6;	
	}
	

}
