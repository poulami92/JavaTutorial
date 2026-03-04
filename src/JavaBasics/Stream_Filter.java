package JavaBasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_Filter {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("Adam");
		names.add("Ram");
		
		//Get count of names start with 'A'
		
        Long count=names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(count);
		
		//Print names having length>4
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//Print first name having length>4
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Print names in upper case having length>4 
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s.toUpperCase()));
		
		//Create Stream from List
		
		Long number=Stream.of("Ram","Don","Tina").count();
		
		System.out.println(number);
		
		

	}

}
