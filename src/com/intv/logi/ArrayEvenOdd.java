package com.intv.logi;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		int n[]= {2,3,4,5,6,7,8};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0; i< n.length;i++)
		{
			if (n[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Even Numbers Count : "+evenCount);
		System.out.println("Odd Numbers Count : "+oddCount);

	}

}
