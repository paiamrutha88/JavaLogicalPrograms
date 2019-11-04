package com.intv.logi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\temp\\read.txt");
		BufferedReader br = new BufferedReader (fr);
		String str="";
		
		
		while ((str=br.readLine())!= null)
		{
			System.out.println(str);
			
		}

		br.close();
	}

}
