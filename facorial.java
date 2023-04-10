package riya;
import java.util.Scanner;

public class factorial {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number");
	int n= s.nextInt();
	findfactorial(n);
	
}
public static void findfactorial(int num)
{
	int fact=1,i;
	for(i=1;i<=num;i++)
	{ 
		fact=fact*i;
	}
	System.out.println("Factorial of a number is:"+fact);
}
}