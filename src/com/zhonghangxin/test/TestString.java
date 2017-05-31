package com.zhonghangxin.test;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "teststring";
		StringBuilder bs = new StringBuilder();
		char[] a  = s.toCharArray();
		for(int i=a.length -1;i>= 0;i--){
			bs.append(a[i]);
		}
		System.out.println(bs);

	}
}
