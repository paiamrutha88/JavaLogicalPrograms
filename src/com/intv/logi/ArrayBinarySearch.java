package com.intv.logi;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int a[]= {2,3,4,5,6,7,8,9};
		int key=8;
		int l=0;
		int h=a.length-1;
		Boolean found=false;
		int m;
		while(l<=h)
		{
			m=(l+h)/2;
			if (key==a[m])
			{
				System.out.println("Element found");
				found=true;
				break;
			}
			if(key>a[l])
			{
				l=l+1;
			}
			if(key<a[h])
			{
				h=h-1;
			}
			
			
		}
				

	}

}
