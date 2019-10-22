package com.intv.logi;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int fact=1;
		
		for (int i=n;i>0; i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+n+" is :"+fact);
	}

}
