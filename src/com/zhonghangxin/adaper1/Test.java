package com.zhonghangxin.adaper1;

public class Test {
    //Adapter��̳�Source�࣬ʵ��Targetable�ӿ�,����Targetable�ӿڵ�ʵ����;�����Source��Ĺ���
	public static void main(String[] args) {
		
		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
