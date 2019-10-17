package com.intv.logi;

public class ReverseString {

	public static void main(String[] args) {
		//1
		String str = "hello";
		String revStr="";
		int n=str.length();
		
		
		for (int i=n-1;i>=0;i--)
		{
			revStr=revStr+str.charAt(i);
		}
		
		System.out.println(revStr);
		//2
		str = "hello";
		revStr="";
		char cArray[] = str.toCharArray();
		
		for (int i=cArray.length-1;i>=0;i--)
		{
			revStr=revStr+cArray[i];
		}
		
		System.out.println(revStr);
		//3
		str = "hello";
		StringBuffer sb= new StringBuffer(str);
		
		System.out.println(sb.reverse());
		

	}

}
