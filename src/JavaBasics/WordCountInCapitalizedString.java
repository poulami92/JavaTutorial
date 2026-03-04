package JavaBasics;

public class WordCountInCapitalizedString {

	public static void main(String[] args) {

      String str="NaveenAutomationLabs";
      
      int len=str.length();
      
      int count=0;
      
      for(int i=0;i<len;i++)
      {
    	  if(str.charAt(i)>='A' && str.charAt(i)<='Z' )
    	  {
    		  count++;
    	  }
      }
      
      System.out.println(count);

	}

}
