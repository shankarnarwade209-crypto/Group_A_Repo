package com.demo;

public class Rudra {

	public static void main(String[] args) {

		int arr []= {10,20,30,50,40};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
//		Max element print
			System.out.println("The max element from array is :" + max);
	}

}
