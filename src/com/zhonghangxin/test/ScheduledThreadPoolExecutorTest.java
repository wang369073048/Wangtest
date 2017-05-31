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
		// ����һ��ScheduledThreadPoolExecutor���󣬲���������������Ϊ5��
		stpe = new ScheduledThreadPoolExecutor(6);
		MyTask2 task2 = new MyTask2();
		MyTask task = new MyTask();
		// ��2���ʼִ�����񣬲�������һ������ʼ���һ����ִ��һ�Σ�
		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 stpe.scheduleWithFixedDelay(task, 2, 1, TimeUnit.SECONDS);
//		 
		 //stpe.scheduleWithFixedDelay(task2, 2, 1, TimeUnit.SECONDS);
		 
		// ��2���ִ��һ�Σ���ֻ��ִ��һ�Ρ�
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
					System.out.println("1ֹͣ�ˣ�������");
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
					System.out.println("2ֹͣ�ˣ�������");
				}
			}
		}
	}
}
