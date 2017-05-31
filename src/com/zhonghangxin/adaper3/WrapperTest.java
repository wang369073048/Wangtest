package com.zhonghangxin.adaper3;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO 对象适配器模式
		
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		source1.method2();
		
	}

}
