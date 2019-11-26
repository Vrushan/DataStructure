package com.datastructures.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RepeateAndone {
	
	private static int printnonexisting(int[] arr, int n) {
		
		int res=1;//min possible outcome
		for(int i=0;i<n && arr[i]<=res;i++)
		{
			res=res+arr[i];
		}
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 3, 6, 10, 11, 15};
		int n=arr.length;
		int n1=printnonexisting(arr,n);
		System.out.println(n1);
		
		

	}

	

	

}
