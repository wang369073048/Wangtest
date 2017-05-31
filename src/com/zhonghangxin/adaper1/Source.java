package com.zhonghangxin.adaper1;

public class Source {
	//类的适配器模式:有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
	public void method1(){
		System.out.println("this is original method!");
	}

}
