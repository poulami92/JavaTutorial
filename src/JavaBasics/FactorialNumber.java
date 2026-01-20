package JavaBasics;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println(getFact(5));
		
		System.out.println(getRecursiveFact   (5));
	}
	
	public static int getFact(int num)
	{
		int fact=1;
		
		if(num==0)
		{
			return 1;
		}
		
		for(int i =1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		return fact;
	}
	
	
	public static int getRecursiveFact(int num)
	{
        int fact=1;
		
		if(num==0)
		{
			return 1;
		}
		
		return num * getRecursiveFact(num-1);
	}

}
