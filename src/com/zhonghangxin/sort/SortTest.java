package com.zhonghangxin.sort;

public class SortTest {
	public void sort(int[] args) {
		for (int m : args) {
			System.out.print("����ǰ " + args[m] + " ");
		}

		int time1 = 0, time2 = 0;
		for (int i = 0; i < args.length - 1; i++) {
			++time1;
			for (int j = i + 1; j < args.length; j++) {
				++time2;
				int temp;
				if (args[i] > args[j]) {
					temp = args[j];
					args[j] = args[i];
					args[i] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("��ѭ��������" + time1 + "��ѭ��������" + time2);
		for (int n : args) {
			System.out.print("����� " + n + " ");
		}
	}

	public static void main(String[] args) {
		int[] arg = new int[] { 2, 1, 4, 5, 8, 7, 6, 3, 9, 0 };
		new SortTest().sort(arg);
	}
}
