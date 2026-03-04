package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class DublicateCharsInString {

	public static void main(String[] args) {
		
	 String str = "programming";
	 Set<Character> dubChars = new HashSet<>();
	 
	 int len = str.length();
	 for(int i=0;i<len;i++)
	 {
		 char ch = str.charAt(i);
		 if(!dubChars.add(ch))
		 {
			 System.out.println(ch);
		 }
		 
	 }
	 

	}

}
