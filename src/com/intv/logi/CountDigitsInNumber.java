package com.intv.logi;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		
		int num=10980;
		int temp=0;
		
		while(num>0)
		{
			int num1=num%10;
			
			temp++;
			num=num/10;
		}
		
		System.out.println(temp);

	}

}
