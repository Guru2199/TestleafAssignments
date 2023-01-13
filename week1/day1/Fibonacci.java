package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNumber=0;
		int secNumber=1;
		int sum=0;
		
		
		for(int i = 0; i<=11; i++) 
		{
			System.out.print(firstNumber+ " ");
			sum=firstNumber+secNumber;
			firstNumber=secNumber;
			secNumber=sum;
		}	
	}
}
