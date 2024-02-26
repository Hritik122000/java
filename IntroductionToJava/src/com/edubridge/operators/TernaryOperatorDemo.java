package com.edubridge.operators;
import java.util.Scanner;
//Program for Ternary operator
public class TernaryOperatorDemo {

	public static void main(String[] args) {
//		To check the no. is even or odd
		
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		String res=(num%2==0)?"even":"odd";
		System.out.println(res);
	}

}
