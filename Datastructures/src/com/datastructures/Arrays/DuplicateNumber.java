package com.datastructures.Arrays;

public class DuplicateNumber {
	
	
	private static int printduplicate(int[] arr, int n) {
		
		int j=0;
		int[] temp=new int[n];
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		
		temp[j]=arr[n-1];
		
		for(int i=0;i<j;i++)
			
			arr[i]=temp[i];
		return j;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,2,3,3,4,4,4,5};
		
		int n=arr.length;
		
		n=printduplicate(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

	

}
