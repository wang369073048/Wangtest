package com.zhonghangxin.wangzhen.reflect;

import java.lang.reflect.Array;

/**
 * ͨ������ȡ�ò��޸��������Ϣ
 * 
 * @author Administrator
 * 
 */
public class hello6 {
	public static void main(String[] args) {
		int[] temp = { 1, 2, 3, 4, 5 };
		Class<?> demo = temp.getClass().getComponentType();
	    System.out.println("��������:" + demo.getName());
	    System.out.println("���ݳ���:" + Array.getLength(temp) +" || "+ temp.length);
	    System.out.println("����ĵ�һ��Ԫ��:" + Array.get(temp, 0));
	    Array.set(temp, 0, 100);
	    System.out.println("�޸ĺ�����ĵ�һ��Ԫ��:" + Array.get(temp,0));
	}
}
