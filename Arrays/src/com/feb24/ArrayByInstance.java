package com.feb24;

public class ArrayByInstance {

	public static void main(String[] args) {
		//return type array name[]=new returntype[aray]
		int arr[]=new int[5];
		arr[0]=10;
		arr[0]=20;		arr[0]=30;
		arr[0]=40;		//arr[0]=40;
		
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		
		
	}

}
