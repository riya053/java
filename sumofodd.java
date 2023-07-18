package myproject;
import java.util.Scanner;


public class Function {
	public static void sumofodd(int n)
	{ 
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers is " +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sumofodd(n);
		
	}

}

output:

89
Sum of odd numbers is 2025
