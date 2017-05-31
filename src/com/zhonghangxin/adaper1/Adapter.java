package com.zhonghangxin.adaper1;

public class Adapter extends Source implements Targetable{
     //Adapter类继承Source类，实现Targetable接口
	@Override
	public void method2() {
		
		System.out.println("this is targetable method!");
	}

}
