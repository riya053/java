package myproject;
import java.util.Scanner;


public class Function {
	public static void printmyname(String name)
	{
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		printmyname(name);

	}

}

output:
Riya
Riya
