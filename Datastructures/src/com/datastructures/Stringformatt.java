package com.datastructures;

public class Stringformatt {
	
	public static void push(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					System.out.println(str.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="132";
		
		Stringformatt.push(str);

	}

}
