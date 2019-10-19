package com.intv.logi;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="malayalamn";
		String s2=s1;
		String s3="";
		
		int n=s1.length();
		for (int i=n-1; i>=0;i--)
		{
			s3=s3+ s1.charAt(i);
		}
		if(s3.equals(s1))
		{
			System.out.println(s3 + " is Palindrome");
		}
		else
		{
			System.out.println(s3 + " is not palindrome");
		}

	}

}
