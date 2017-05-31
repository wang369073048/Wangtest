package com.zhonghangxin.templatemethod;

public abstract class AbstractTemplate {
	
	public void templateMethod(){
		int a = concreteMethod();
		int b = abstractMethod();
		int c = a * b;
		System.out.println(c);
		
	}
	public abstract int abstractMethod();
	
	public void hookMethod(){}
	
	private int concreteMethod(){
	     return 6;	
	}
	

}
