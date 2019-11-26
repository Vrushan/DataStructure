package com.datastructures;

public class FirstNonrepeatingcharacter {
	
	static char count[]=new char[256];
	public static void getcharacter(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	public static int frequency(String str) {
		getcharacter(str);
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
		// TODO Auto-generated method stub
		
		
		String str="geeksforgeeks";
		
		int index=FirstNonrepeatingcharacter.frequency(str);
		System.out.println(str.charAt(index));

	}

	

}
