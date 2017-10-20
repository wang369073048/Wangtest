package com.zhonghangxin.templatemethod;

public abstract class AbstractTemplate {
	
	public void templateMethod(){
		int a = concreteMethod();
		int b = abstractMethod();
		int c = a * b;
		System.out.println(c);
		System.out.println(6666666666666666666);
		
	}
	public abstract int abstractMethod();
	
	public void hookMethod(){}
	
	private int concreteMethod(){
	     return 6;	
	}
	

}
