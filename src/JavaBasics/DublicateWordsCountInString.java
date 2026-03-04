package JavaBasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DublicateWordsCountInString {

	public static void main(String[] args) {
	
		findDublicate("boy cat boy cow cow cow");

	}
	
	
	public static void findDublicate(String str)
	{
		String strArr[] = str.split(" ");
		
		int len = strArr.length;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i =0;i<len;i++)
		{
			if(map.containsKey(strArr[i]))
			{
				map.put(strArr[i], map.get(strArr[i])+1);
			}
			
			else
			{
				map.put(strArr[i],1);
			}
		}
		
		System.out.println(map);
		
		Set<String> words = map.keySet();
		
		for(String w : words)
		{
			if(map.get(w)>1)
			{
				System.out.println(w);
			}
		}
		
	}
	
	
	
	
}
