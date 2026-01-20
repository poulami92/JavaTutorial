package JavaBasics;

public class PalindromrNumber {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));

	}
	
	public static boolean isPalindrome(int num) {
		int rim =0;
		int sum=0;
		int temp;
		
		temp= num;
		
		while(num>0)
		{
			rim=num%10;
			sum=(sum*10)+rim;
			num=num/10;
		}
		
		if(temp==sum)
			return true;
		else 
			return false;

	}

}
