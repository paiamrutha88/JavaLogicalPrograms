package com.intv.logi;

public class CountWordsInSentence {

	public static void main(String[] args) {
		
		String s= "principa princess Deeksha";
		
		int counter=0;
		
		for (int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
					{
						counter++;
					}
		}

		System.out.println(counter+1);
	}

}
