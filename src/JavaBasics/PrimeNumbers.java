package JavaBasics;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		getPrimeNumbers(20);
		

	}
	
	public static void getPrimeNumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(findPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean findPrime(int num)
	{
		if(num<=1)
			return false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	
	}

}
