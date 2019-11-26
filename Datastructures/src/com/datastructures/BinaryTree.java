package com.datastructures;

import java.util.Arrays;

//permutation of given string
public class BinaryTree {
	
	public static void permute(String str) {
		// TODO Auto-generated method stub
		
		permute("",str);
		
		
	}
	
	private static void permute(String perm,String str)
	{
		
		if(str.isEmpty())
		{
			System.out.println(perm+str);
		}
		else
			
			for(int i=0;i<str.length();i++)
			{
				
				permute(perm+str.charAt(i),str.substring(0, i)+str.substring(i+1,str.length()));
			}
			
	}


	public static void main(String[] args) {
		
		
		String str="12";
		
		permute(str);
		
		BinaryTree.permute(str);
	
	}

	

}
