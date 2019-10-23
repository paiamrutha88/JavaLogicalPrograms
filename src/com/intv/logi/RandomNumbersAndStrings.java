package com.intv.logi;

import java.util.Random;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int ranNum=ran.nextInt();
		
		System.out.println(ranNum);
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextBoolean());
		
		
		

	}

}
