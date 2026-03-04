package JavaBasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_Sorted {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("Adam");
		names.add("Ram");
		
		//Print names in upper case which starts with 'A' in sorted order
		
		names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		//Print all names sorted order
		
		names.stream().sorted().forEach(s->System.out.println(s));
		
		

	}

}
