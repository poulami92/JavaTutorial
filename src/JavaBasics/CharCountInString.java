package JavaBasics;

public class CharCountInString {

	public static void main(String[] args) {
		
		String str="programming";
		printCharCount(str,'m');
	}
	
	public static void printCharCount(String str,char ch)
	{
		int count=0;
		int len = str.length();
		for(int i =0;i<len;i++)
		{
			if(str.charAt(i)==ch) 		
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
