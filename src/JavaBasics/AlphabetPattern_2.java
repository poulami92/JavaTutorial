package JavaBasics;

public class AlphabetPattern_2 {

	public static void main(String[] args) {

       int row =6;
       
       int alpha =65;
       
       for(int i=1;i<=row;i++)
       {
    	   
    	   for(int j=1;j<=i;j++)
    	   {
    		  System.out.print((char)alpha); 
    	   }
    	   alpha=alpha+1;
    	   System.out.println(""); 
       }

	}

}
