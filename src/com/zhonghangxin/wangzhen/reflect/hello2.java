package com.zhonghangxin.wangzhen.reflect;

public class hello2 {
	
    public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
	    Class<?> demo3 = null;	
	    
	    try {
			demo1 = Class.forName("com.zhonghangxin.wangzhen.reflect.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();	
		demo3 = Demo.class;
	}

}


