package JavaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UniqueNumbersInSortedInArray {

	public static void main(String[] args) {
		
		List<Integer> numberList=Arrays.asList(3,2,2,7,5,9,7);
		
		numberList.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
		TreeSet<Integer> sortedSet= new TreeSet<>(numberList);
		
		System.out.println(sortedSet);
		
		
		
		
		
		

	}

}
