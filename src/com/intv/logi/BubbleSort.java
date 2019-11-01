package com.intv.logi;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int n[]= {1,2,8,6,3,4,5,2};
		System.out.println("Before sorting : " +Arrays.toString(n));
		for (int i=0;i<n.length-1;i++)
		{
			for (int j=0;j<n.length-1;j++)
			{
				if(n[j]>n[j+1])
				{
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}

		System.out.println("After sorting : " +Arrays.toString(n));
	}

}
