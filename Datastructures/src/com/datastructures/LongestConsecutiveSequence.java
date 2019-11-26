package com.datastructures;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	private static int printconscutive(int arr[], int n) {
		
		HashSet<Integer> set=new HashSet<>();
		int ans=0;
		
		for(int i=0;i<n;i++)
		
			set.add(arr[i]);
		System.out.println(set);
		
		for(int i=0;i<n;i++)
		{
			if(!set.contains(arr[i]-1))
			{
				int j=arr[i];
				while(set.contains(j))
				{
					j=j+1;
					
					if(ans<j-arr[i])
					{
						ans=j-arr[i];
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 9, 3, 10, 4, 20, 2};
		
		int n=arr.length;
		
		System.out.println(printconscutive(arr,n));
				

	}

	

}
