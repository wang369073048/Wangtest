package com.zhonghangxin.test;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
        System.out.println("22");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable tt = new ThreadTest();
		tt.run();
	}

}
