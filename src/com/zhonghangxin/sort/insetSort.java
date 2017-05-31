package com.zhonghangxin.sort;

public class insetSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 7, 10, 4, 8, 98 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = i - 1;
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
//			for (j = i - 1; j >= 0; j--) {
//				if (temp < a[j]) {
//					a[j + 1] = a[j];
//				} else {
//					break;
//				}
//			}
			a[j + 1] = temp;
		}
		int i = 0;
		for (; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
