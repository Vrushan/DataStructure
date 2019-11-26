package com.datastructures.Arrays;

import java.util.BitSet;

public class Missingnumber {

	public static void main(String[] args) {
		
		int[] input= {1,1,2,4,5,6};

		int n=input.length;
		
		System.out.println(n);
		
		int[] register=new int[n];
		
		for(int i:input)
		{
			register[i]=1;
		}
		System.out.println("Misssing number:");
		for(int i=1;i<register.length;i++)
		{
			if(register[i]==0)
				
			System.out.println(i+" ");
		}
		
		


		
		


		
		

	}

}
