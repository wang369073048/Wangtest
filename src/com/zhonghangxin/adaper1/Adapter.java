package com.zhonghangxin.adaper1;

public class Adapter extends Source implements Targetable{
     //Adapter��̳�Source�࣬ʵ��Targetable�ӿ�
	@Override
	public void method2() {
		
		System.out.println("this is targetable method!");
	}

}
