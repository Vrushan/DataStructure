package com.datastructures;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofString {
	
	static char count[]=new char[256];
	
	public static void getcharcount(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
			
			
		}
		
	}
	
	public static int firstcharacter(String str)
	{
		getcharcount(str);
		
		int index=-1,i;
		for(i=0;i<str.length();i++)
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
	  int index=FrequencyofString.firstcharacter(str);
	  
	  System.out.println(str.charAt(index));

	}

}
