package com.datastructures.Arrays;

public class SmallSubarraywithlessSum {
	
	private static int findminsubarray(int[] arr, int n, int k) {
		
		int min_length = n+1;
		int start=0;
		int end=0;
		int cur_sum=0;
		
		while(end<n)
		{
			while(cur_sum<k)
			{
				cur_sum=cur_sum+arr[end++];
			}
			while(cur_sum>k && end<n)
			{
				if(end-start<min_length)
				{
					min_length=end-start;
				}
				
				cur_sum=cur_sum-arr[start++];
				
			}
		}
		return min_length;
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		
		int k=280;
		
		int n=arr.length;
		
		int res1=findminsubarray(arr,n,k);
		System.out.println(res1+" ");

	}

	

}
