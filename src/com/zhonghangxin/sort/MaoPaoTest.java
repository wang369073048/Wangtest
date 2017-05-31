package com.zhonghangxin.sort;

public class MaoPaoTest {
	
	public static void main(String[] args) {
       int [] arr = {34,10,4,8,4,98,10};
       for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j < arr.length; j++) {

               if (arr[i] > arr[j]) {
                   int tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
           }
       }
       for(int i=0;i<arr.length;i++){
    	   System.out.println(arr[i]);
       }

	}

}
