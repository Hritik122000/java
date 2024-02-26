package com.feb24;

public class ArrayByLiteral {

	public static void main(String[] args) {
		//By Literal
		//returntype arrayname[]={};

		
			int arr[]= {10,20,30,40};
			//index start from 0
			//so 10 will be on 0 index and no. 20 will be on 1
			//arr[2] will fetch particular indec value
			
			System.out.println(arr[2]);
			//llength is built in method to chech the size of array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
