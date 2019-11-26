package com.datastructures.Arrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,1,0,5};
		
	Set set = new HashSet();
	
	for(int i=0;i<arr2.length;i++)
	{
		set.add(arr2[i]);
	}
	
	for(int j=0;j<arr1.length;j++)
	{
		if(!set.contains(arr1[j]))
		{
			System.out.println(arr1[j]+" ");
		}
		
	}

	}

}
