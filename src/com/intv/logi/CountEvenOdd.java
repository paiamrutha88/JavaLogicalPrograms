package com.intv.logi;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1360;
		int countEven=0;
		int countOdd=0;
		int mod=0;
		
		while(num>0)
		{
			mod=num%10;
			
			if(mod/2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
			num=num/10;
		}

		System.out.println("Even Numbers : "+countEven);
		System.out.println("Count Odd : "+countOdd);
	}

}
