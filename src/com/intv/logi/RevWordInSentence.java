package com.intv.logi;

public class RevWordInSentence {

	public static void main(String[] args) {
		//Reverse each word in a sentence
		String str = "princess deeksha princi";
		String sArray[] = str.split(" ");
		String revString="";
		
		for (String s : sArray)
		{
			String revWord="";
			for (int i=s.length()-1;i>=0;i--)
			{
				revWord=revWord+s.charAt(i);
				
				
			}
			revString=revString+revWord+" ";
		
			
		}
		System.out.print(revString );

	}

}
