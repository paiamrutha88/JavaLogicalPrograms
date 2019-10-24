package com.intv.logi;

public class CompareTwoArrays {
	
	public static void main(String args[])
	{
		int n1[]= {1,2,3,4};
		int n2[]= {1,3,2,4};
		boolean compare=true;
		if(n1.length==n2.length)
		{
			for(int i=0;i<n1.length;i++)
			{
				if(n1[i]==n2[i])
				{
					compare=true;
				}
				else
				{
					compare = false;
				}
			}
		}
		else
		{
			compare=false;
		}
		
		if (compare==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
	}

}
