package com.intv.logi;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a=10, b=10, c=50;
		if(a>b && a>c)
		{
			System.out.println(a + " is largest of all");
		}
		else if (b>a && b>c)
		{
			System.out.println(b + " is largest of all");
		}
		else
		{
			System.out.println(c + " is largest of all");
		}

		
		//2nd logic
		
		System.out.println(a>(b>c?b:c)?a:(b>c?b:c));
	}

}
