package com.dp.arrays;

public class Subarray {
	
	private static int sub(int[] arr, int n,int k) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
		
			for(int j=i;j<n;j++)
			{
				
				
				if(sum+arr[j]<k)
				{
					sum=sum+arr[j];
					count++;
				}
				else break;
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 11,2,3,15};
		
		int n=arr.length;
		int k=10;
		
		int p=sub(arr,n,k);
		System.out.println(p+" ");
		

	}

	

}
