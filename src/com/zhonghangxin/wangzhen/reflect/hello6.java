package com.zhonghangxin.wangzhen.reflect;

import java.lang.reflect.Array;

/**
 * 通过反射取得并修改数组的信息
 * 
 * @author Administrator
 * 
 */
public class hello6 {
	public static void main(String[] args) {
		int[] temp = { 1, 2, 3, 4, 5 };
		Class<?> demo = temp.getClass().getComponentType();
	    System.out.println("数组类型:" + demo.getName());
	    System.out.println("数据长度:" + Array.getLength(temp) +" || "+ temp.length);
	    System.out.println("数组的第一个元素:" + Array.get(temp, 0));
	    Array.set(temp, 0, 100);
	    System.out.println("修改后数组的第一个元素:" + Array.get(temp,0));
	}
}
