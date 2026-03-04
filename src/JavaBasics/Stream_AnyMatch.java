package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_AnyMatch {

	public static void main(String[] args) {


		ArrayList<String> names1 = new ArrayList<>();
		names1.add("Abhijeet");
		names1.add("Don");
		names1.add("Akash");
		names1.add("Adam");
		names1.add("Ram");
		
		Boolean flag =names1.stream().anyMatch(s->s.equals("Adam"));
		
		System.out.println(flag);
		

	}

}
