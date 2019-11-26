package com.datastructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairswithgivenSum {

	private static void printpair(int[] arr, int n, int k) {
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int cur_sum=0;
		int start=0;
		int end=0;
		for(int i=0;i<n;i++)
		{
			cur_sum=cur_sum+arr[i];
			if(cur_sum-k==0)
			{
				start=0;
				end=i;
				break;
			}
			
			if(map.containsKey(cur_sum-k))
			{
				start=map.get(cur_sum-k)+1;
				end=i;
				break;
			}
			
			map.put(cur_sum, i);
		}
		if(end==-1)
		{
			System.out.println("The pair didt find");
		}
		else
			System.out.println(start+" "+end);
	
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 11, 100, 1, 0};
		int n=arr.length;
		int k= 101;
		
		printpair(arr,n,k);
		
		

	}




}
