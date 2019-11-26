package com.datastructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfaccurence {

	public static void main(String[] args) {
		
		int arr[]= {1,5,7,4,5,1,8};
		int n=arr.length;
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i:arr)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
				map.put(i, 1);
		}
		
		
		
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		
		
		
		
		
	}

}
