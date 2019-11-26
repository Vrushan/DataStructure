package com.datastructures.Arrays;

public class Secondlargestelement {
	
	private static void printlargest(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			
			if(arr[i]!=first && arr[i]>second)
			{
				second=arr[i];
			}
			
		}
		System.out.println(first+"  "+second);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,7,9};
		
		int n=arr.length;
		
		printlargest(arr,n);

	}

	
	

	

}
