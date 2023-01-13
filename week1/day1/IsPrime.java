package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=10;
		int count=0;
		
		for(int i=2; i<=num; i++)
		 {
			 if(num%i==0)
			 {
				 count++;
			 }
		 }
		if(count==1)
		{
			System.out.println("Is Prime");
		}
		else
		{
			System.out.println("Is not Prime");
		}
	}

}
