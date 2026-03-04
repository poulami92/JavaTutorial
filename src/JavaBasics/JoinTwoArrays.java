package JavaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {

       String names1[] = {"Ram","Shayam","Hari"};
       
       String names2[] = {"Sita","Gita","Mohan"};
       
       Object mergerArr[]=Stream.concat(Arrays.stream(names1), Arrays.stream(names2)).toArray();
       
       for(Object name:mergerArr)
       {
    	   System.out.println(name);
       }
       
       List mergeList=Stream.concat(Arrays.stream(names1), Arrays.stream(names2)).collect(Collectors.toList());
       System.out.println(mergeList);
	}

}
