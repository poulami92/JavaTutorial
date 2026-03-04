package JavaBasics;

public class VowelCountInString {

	public static void main(String[] args) {
		
		String str = "programming";
		int len = str.length();
		int count=0;
		 for(int i=0;i<len;i++)
		 {
			 char ch = str.charAt(i);
			 if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			 {
				 count++;
			 }
			 
		 }
		 System.out.println(count);

	}

}
