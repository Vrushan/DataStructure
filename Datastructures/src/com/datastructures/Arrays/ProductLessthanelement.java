package com.datastructures.Arrays;

public class ProductLessthanelement {

	

	private static void print(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
	    for(int i=0;i<n;i++)
		{
	    	int cur_sum=arr[0];
			for(int j=i+1;j<n;j++)
			{
			  cur_sum=cur_sum+arr[j];
				if(cur_sum==k)
				{
					int p=(j-i)+1;
					
					System.out.println(p+" ");
				}
			}
		}
		
		
		
	}
	
	

		public static void main(String[] args) {

		
		int arr[]= {1,2,3,4,5};
		int k=60;
		int n=arr.length;
		print(arr,n,k);
		
		

	}



	

}
