package com.intv.logi;

import java.util.HashSet;

public class DuplicateEleInArray {

	public static void main(String[] args) {
		
		int n[]= {1,2,3,5,6,4,3,2};
		Boolean dup= false;
		
		for(int i=0; i<n.length;i++)
		{
			for(int j=i+1; j<n.length; j++)
			{
				if (n[i]==n[j])
				{
					System.out.println(n[i]);
				}
				else
				{
					dup= false;
				}
			}
		}
		
		//using hashset
		
		HashSet hs= new HashSet();
		for (int i:n)
		{
			if(hs.add(i)==false)
			{
				System.out.println("-------------");
				System.out.println(i);
			}
		}
	}

}
