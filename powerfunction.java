package myproject;
import java.util.Scanner;


public class Powerfunction {
	public static void powerfunction(int x,int n)
	{
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=x*result;
		}
		System.out.println("Result is : " +result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		powerfunction(x,n);
		

	}

}

output:
Enter the value of x: 
8
Enter the value of n : 
5
Result is : 32768
