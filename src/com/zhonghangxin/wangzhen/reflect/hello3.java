package com.zhonghangxin.wangzhen.reflect;

public class hello3 {
	public static void main(String[] args) {
		
	    Class<?> demo = null;
	    try {
			demo  = Class.forName("com.zhonghangxin.wangzhen.reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    Person per = null;
	    
	    try {
			per = (Person) demo.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	    
	    per.setAge(11);
	    per.setName("lisi");
	    System.out.println(per);
		
	}

}

