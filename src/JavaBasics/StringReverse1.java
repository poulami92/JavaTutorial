package JavaBasics;

public class StringReverse1 {

	public static void main(String[] args) {
		
		String str = "This is String";
		
		// gnirtS si sihT
		
		int length= str.length();
		
		String revStr="";
		
		for (int i =length-1;i>=0;i--)
		{
			revStr = revStr+str.charAt(i);
		}
		
		System.out.println(revStr);

	}

}
