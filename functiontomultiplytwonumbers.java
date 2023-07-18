package myproject;
import java.util.Scanner;


public class Function {
	public static int calculatemultiply(int a,int b)
	{
		int mul=1;
		mul=a*b;
		return mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mul=calculatemultiply(a,b);
		System.out.println(mul);
	}

}

output:
6
7
42
