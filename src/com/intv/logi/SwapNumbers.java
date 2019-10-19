package com.intv.logi;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using third variable
		int num1=1988;
		int num2=1985;
		
		int temp;
		System.out.println("Before Swapping Num1: "+num1+" Num2: "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping Num1: "+num1+" Num2: "+num2);
		
		//without using third variable
		
		num1=1988;
		num2=1985;
		
		System.out.println("Before Swapping Num1: "+num1+" Num2: "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping Num1: "+num1+" Num2: "+num2);
	}

}
