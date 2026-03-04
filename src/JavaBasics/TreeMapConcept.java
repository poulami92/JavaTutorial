package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

       TreeMap<Integer,String> map = new TreeMap<>();
       map.put(300, "Tom1");
       map.put(100, "Tom2");
       map.put(500, "Tom3");
       map.put(200, "Tom4");
       
       System.out.println(map);
       
       TreeMap<Integer,String> map1 = new TreeMap<>(Collections.reverseOrder());
       
       

	}

}
