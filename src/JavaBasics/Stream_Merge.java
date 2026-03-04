package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Merge {

	public static void main(String[] args) {


		ArrayList<String> names1 = new ArrayList<>();
		names1.add("Abhijeet");
		names1.add("Don");
		names1.add("Akash");
		names1.add("Adam");
		names1.add("Ram");
		
		List<String> names2 =  Arrays.asList("Sita","Rohan","Tedy");
		
		Stream<String> names1Stream =names1.stream();
		
		Stream<String> names2Stream =names2.stream();
		
		Stream<String> mergeString= Stream.concat(names1Stream, names2Stream);
		
		mergeString.forEach(s->System.out.println(s));
	
		

	}

}
