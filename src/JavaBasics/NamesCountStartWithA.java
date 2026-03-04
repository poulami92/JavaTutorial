package JavaBasics;

import java.util.ArrayList;

public class NamesCountStartWithA {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("Adam");
		names.add("Ram");
		
        int count = 0;
		
		for(String name: names)
		{
			if(name.startsWith("A"))
			{
				count++;
			}
				
	
		}
		
		System.out.println(count);
		
		
		
		

	}

}
