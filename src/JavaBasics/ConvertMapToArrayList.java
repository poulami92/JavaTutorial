package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToArrayList {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<String,Integer>();
	       
	       map.put("Tom",100); 
	       map.put("Jerry",200); 
	       map.put("Roy",300); 
	   
	       
	       //System.out.println(map);
	       
	       Set<Entry<String, Integer>> mapEntries = map.entrySet();
	       for(Entry entry :mapEntries)
	       {
	    	   System.out.println(entry);
	       }
	       
	       ArrayList<String> keyList = new ArrayList<>(map.keySet());
	       System.out.println(keyList);
	       
	       ArrayList<Integer> valueList = new ArrayList<>(map.values());
	       System.out.println(keyList);
	       
	       

	}

}
