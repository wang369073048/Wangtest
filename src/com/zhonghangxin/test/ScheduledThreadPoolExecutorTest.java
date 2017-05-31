package com.zhonghangxin.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorTest {
	static ScheduledThreadPoolExecutor stpe = null;
	//static int index;

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		// 构造一个ScheduledThreadPoolExecutor对象，并且设置它的容量为5个
		stpe = new ScheduledThreadPoolExecutor(6);
		MyTask2 task2 = new MyTask2();
		MyTask task = new MyTask();
		// 隔2秒后开始执行任务，并且在上一次任务开始后隔一秒再执行一次；
		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 
		 //stpe.scheduleWithFixedDelay(task2, 2, 1, TimeUnit.SECONDS);
		 
		// 隔2秒后执行一次，但只会执行一次。
		//stpe.schedule(task, 2, TimeUnit.SECONDS);
	}

	private static String getTimes() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		Date date = new Date();
		date.setTime(System.currentTimeMillis());
		return format.format(date);
	}

	private static class MyTask implements Runnable {
		int index;
		@Override
		public void run() {
			index++;
			System.out.println("1= " + getTimes() + " " + index);
			if (index >= 10) {
				stpe.shutdown();
				if (stpe.isShutdown()) {
					System.out.println("1停止了？？？？");
				}
			}
		}
	}
	
	private static class MyTask2 implements Runnable {
		int index;
		@Override
		public void run() {
			index++;
			System.out.println("2= " + getTimes() + " " + index);
			if (index >= 10) {
				stpe.shutdown();
				if (stpe.isShutdown()) {
					System.out.println("2停止了？？？？");
				}
			}
		}
	}
}
