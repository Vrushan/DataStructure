package com.datastructures.Arrays;

public class MaxSumsubarray {
	
	private static int printmaxsum(int arr[], int n) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=0;
		int max_so_far=arr[0];
		int max_end_her=0;
		int s=0;
		for(int i=0;i<n;i++)
		{
		max_end_her=max_end_her+arr[i];
		
		if(max_so_far<max_end_her)
		{
			max_so_far=max_end_her;
			start=s;
			end=i;
		}
		if(max_end_her<0)
		{
			max_end_her=0;
			s=i+1;
		}
		
		}
		return max_so_far;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=arr.length;
		
		int res=printmaxsum(arr,n);
		
		System.out.println(res);

	}

	

}
