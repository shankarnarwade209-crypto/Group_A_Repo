package com.demo;

public class Rudra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10,20,30,50,40};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
			System.out.println("The max element from array is :" + max);
	}

}
