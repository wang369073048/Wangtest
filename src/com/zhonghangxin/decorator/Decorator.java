package com.zhonghangxin.decorator;

public class Decorator implements Sourceable{
    private Sourceable source;
    
    public Decorator(Sourceable source){
    	super();  
    	this.source = source;
    }
	@Override
	public void method() {
		System.out.println("before decorater !");
		source.method();
		System.out.println("after decorater !");
		

		
	}

}
