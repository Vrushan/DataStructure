package com.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	static char[] count=new char[256];
	
	public static void getcharcount(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	
	public static int occurence(String str)
	{
		getcharcount(str);
		int index=-1;
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]==1)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
	
		String str="AABBCDDE";
		int index=Test.occurence(str);
		System.out.println(str.charAt(index));
	
	}

}
