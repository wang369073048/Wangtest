package com.zhonghangxin.adaper1;

public class Test {
    //Adapter类继承Source类，实现Targetable接口,这样Targetable接口的实现类就具有了Source类的功能
	public static void main(String[] args) {
		
		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
