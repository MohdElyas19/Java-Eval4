package com.eval3;


public class _1Array {

	
	public static void main(String[] args) {

		int[] arr = new int[2];
		arr[0] = 50;
		arr[1] = 80;

		try {
			System.out.println(arr[1]);
		}catch(Exception e) {
			System.out.println(e);
		}

		
		int[] arr1 = new int[2];
		arr1[0] = 50;
		arr1[1] = 80;
		
		try {
			System.out.println(arr1[9]);
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println(aiob);
		}
		
		
		int[] arr2 = new int[2];
		arr2[0] = 50;
		arr2[1] = 80;
		
		
		
		
	}

}