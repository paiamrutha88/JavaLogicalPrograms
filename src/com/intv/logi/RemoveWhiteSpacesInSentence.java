package com.intv.logi;

public class RemoveWhiteSpacesInSentence {

	public static void main(String[] args) {
		String s= "principa princess deeksha";
		s=s.replaceAll("\\s", "");

		System.out.println(s);
	}

}
