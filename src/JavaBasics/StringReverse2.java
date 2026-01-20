package JavaBasics;

public class StringReverse2 {

	public static void main(String[] args) {
		
        String str = "This is String";
        
        String revStr = "";
		
		// String is this
        
        String strArr[] = str.split(" ");
        int len = strArr.length;
        
        for(int i =len-1;i>=0;i--)
        {
        	revStr= revStr+" "+strArr[i];
        }
        
        System.out.println(revStr.trim());

	}

}
