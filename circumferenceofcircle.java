package myproject;
import java.util.Scanner;


public class Function {
	public static void circlecircumference(float r)
	{ 
		
		
		System.out.println("Circumference of the number is " +2 * 3.14 * r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		
		circlecircumference(r);
		
	}

}

output:
6
Circumference of the number is 37.68
