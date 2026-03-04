package JavaBasics;

public class FindMissingNumber {

	public static void main(String[] args) {

        int numbers[]= {1,2,3,5,6,7};
        int len= numbers.length;
        int lastNum=numbers[len-1];
        
        int expectedSum = lastNum*(lastNum+1)/2;
        
        int actualSum=0;
        
        for(int n:numbers)
        {
        	actualSum=actualSum+n;
        }
        
        int missingNum=expectedSum-actualSum;
        System.out.println(missingNum);

	}

}
