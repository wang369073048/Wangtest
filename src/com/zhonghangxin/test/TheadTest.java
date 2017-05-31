package com.zhonghangxin.test;

public class TheadTest extends  Thread{
	
	public void run(){
		System.out.println("11");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new TheadTest() ;
		t.start();
		
	}

}
