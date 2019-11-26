package com.dp.arrays;

public class LongestSubarray {
	
	private static int LongestSubarray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count=0;
		int res=0;
		for(int i=0;i<n;i++)
		{
			if(i<n&&arr[i]>=0)
			{
				count++;
				i++;
			}
			
			res=Math.max(res, count);
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2, 3, 4, -1, -2, 1, 5, 6, 3};
		
		int n=arr.length;
		
		System.out.println(LongestSubarray(arr,n));
				
				

	}

	

}
