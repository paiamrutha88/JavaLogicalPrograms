package com.intv.logi;

public class RemoveJunkFromString {

	public static void main(String[] args) {

		String s= "47343847dRERERE0RJYYYUNCXWWjsdsj!@@#@# ^&^**(&+__~~~`REREXCF";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
