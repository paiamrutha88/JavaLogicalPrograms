package com.intv.logi;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int n1[] = {1,2,3,5,7,6};
		int max = n1[0];
		//find max of array
		for (int i=0; i< n1.length;i++)
		{
			if(n1[i]>max)
			{
				max=n1[i];
			}
		}
		
		System.out.println("Max :" +max);
		//array sum
		int arrSum=0;
		for (int i=0;i<n1.length;i++)
		{
			arrSum=arrSum+n1[i];
		}
		int sum=0;
		for (int i=1;i<=max;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Missing element is : " +(sum-arrSum));
	}

}
