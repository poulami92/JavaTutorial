package JavaBasics;

public class PrintNumbersUsingRecursion {

	public static void main(String[] args) {
		 
		printNumber(1,10);

	}
	
	public static void printNumber(int num,int range)
	{
		if(num<=range)
		{
			System.out.println(num);
			num++;
			printNumber(num,range);
		}
		
		
	}

}
