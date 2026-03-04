package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Collect {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("Adam");
		names.add("Ram");
		
		List<String> ls= names.stream().filter(s->s.length()>4).map(s-> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls);
		

	}

}
