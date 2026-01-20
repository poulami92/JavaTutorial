package JavaBasics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println(isArmstrong(153));

	}
	
	public static boolean isArmstrong(int num) {
		int rim =0;
		int sum=0;
		int temp;
		
		temp= num;
		
		while(num>0)
		{
			rim=num%10;
			sum=sum+(rim*rim*rim);
			num=num/10;
		}
		
		if(temp==sum)
			return true;
		else 
			return false;
	}

}
