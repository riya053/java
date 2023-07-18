package myproject;
import java.util.Scanner;


public class Function {
	public static void table(int n)
	{ 
		System.out.println("Table of a given number" +n+ "is");
		for(int i=1;i<=10;i++)
		{
			System.out.println( n*i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		table(n);
	}

}

output:
12
Table of a given number12is
12
24
36
48
60
72
84
96
108
120
