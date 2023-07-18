package myproject;
import java.util.Scanner;


public class Function {
	public static void checkprime(int n)
	{
		if(n<0)
		{
			System.out.println("Invalid number");
			return;
		}
		
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i== 0) 
				{
				System.out.println("Number is not prime");
				}
				else
					{
					System.out.println("Number is prime");
					}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		checkprime(n);
	}

}
