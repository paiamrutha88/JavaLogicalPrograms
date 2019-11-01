package com.intv.logi;

public class OccOfCharInString {

	public static void main(String[] args) {
		
		String s = "principa princess deeksha";
		s=s.replaceAll("\\s", "");
		char ch[]=s.toCharArray();
		int len1=0,len2=0;
		//int len1 = s.length();
		/*String ch="p";
		
		s=s.replaceAll(ch, "");
		int len2=s.length();
		
		System.out.println(ch + " has occured " +(len1-len2) + " times"); */
		
		for (int i=0;i<s.length()-1;i++)
		{
			len1 = s.length();
			char cp=s.charAt(i);
			s=s.replaceAll(Character.toString(s.charAt(i)), "");
			
			len2=s.length();
			System.out.println(cp + " has occured " +(len1-len2) + " times");
			i=0;
		}
		
		

	}

}
