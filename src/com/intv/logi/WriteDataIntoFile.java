package com.intv.logi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\temp\\write.txt"); 
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("writing into file");
		bw.flush();

	}

}
