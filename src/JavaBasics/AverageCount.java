package JavaBasics;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageCount {

	public static void main(String[] args) {
		
		int numbers[]= {10,202,30,40,50};
		countAverage(numbers);
		countAverageStream(numbers);
	}
	
	public static void countAverage(int numbers[])
	{
		int len = numbers.length;
		int sum=0;
		for(int n:numbers)
		{
			sum=sum+n;
		}
		
		double avg=sum/len;
		System.out.println(avg);
	}
	
	public static void countAverageStream(int numbers[])
	{
		OptionalDouble avg=Arrays.stream(numbers).average();
		System.out.println(avg.getAsDouble());
	}
	
	

}
