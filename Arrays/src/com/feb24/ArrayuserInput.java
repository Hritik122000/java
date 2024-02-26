package com.feb24;

import java.util.Scanner;

public class ArrayuserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
	
		int arr[]=new int[size];
		System.out.println("Enter Elements of Array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array elemrnts");
			for(int i=0;i<arr.length;i++) {
				System.out.println("{"+arr[i]+"}");
			}
		
	}

}
