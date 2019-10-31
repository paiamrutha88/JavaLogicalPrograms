package com.intv.logi;

public class LinearArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,10,1,2,6,4,8};
		int key=4;
		
		for (int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found");
				break;
			}
			
		}

	}

}
