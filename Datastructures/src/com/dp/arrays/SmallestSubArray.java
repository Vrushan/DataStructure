package com.dp.arrays;

public class SmallestSubArray {
	
	private static int Smallestsub(int[] arr, int n,int k) {
		// TODO Auto-generated method stub
		
		int min_len=n+1;
		int cur_sum=0;
		
		for(int i=0;i<n;i++)
		{
			cur_sum=cur_sum+arr[i];
			
			if(cur_sum==k)
			{
				return 1;
			}
			
			for(int j=i+1;j<n;j++)
			{
				cur_sum=cur_sum+arr[j];
				
				if(cur_sum>k&& i<n)
				{
					min_len=j-i+1;
				}
			}
		}
		
		return min_len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-2, 1, 6, -3};
		int n=arr.length;
		int k=5;
		
		System.out.println(Smallestsub(arr,n,k));

	}

	

}
