package JavaBasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_Map {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("Adam");
		names.add("Ram");
		
		//Print names in upper case having length>4 
		
		names.stream().filter(s->s.length()>4).map(s-> s.toUpperCase()).forEach(s->System.out.println(s));
		
		

	}

}
