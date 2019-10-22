package com.intv.logi;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=n1+n2;
			System.out.print(n1+" , ");
			n1=n2;
			n2=sum;
			
		}

	}

}
