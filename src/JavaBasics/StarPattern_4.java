package JavaBasics;

public class StarPattern_4 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				
			}
			
			System.out.println(" ");
			

		}

	}

}
