package myproject;
import java.util.Scanner;


public class Function {
	public static void threenumberaverage(float a,float b,float c)
	{ 
		float avg;
		avg=(a+b+c)/3;
		System.out.println("Average of the number is: " +avg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		threenumberaverage(a,b,c);
		
		
	}

}


output:

7.28
7.28
7.28
Average of the number is: 7.28
