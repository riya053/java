package myproject;
import java.util.Scanner;


public class Function {
	public static void checkeven(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is not even i.e. odd.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		checkeven(n);
	}

}

output:
5
Number is not even i.e. odd.
