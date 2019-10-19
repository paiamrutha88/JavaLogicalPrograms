package com.intv.logi;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		int n=12321;
		int n2=n;
		int rev=0;
		int t=0;
		
		while (n>0)
		{
			t=t*10+n%10;
			n=n/10;
		}
		if(n2==t)
		{
			System.out.println(n2+ " is palindrome");
		}
		else
		{
			System.out.println(n2 +" is not palindrome");
		}

	}

}
