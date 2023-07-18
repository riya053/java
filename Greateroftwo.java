package myproject;
import java.util.Scanner;


public class Function {
	public static void greateroftwo(float a,float b)
	{ 
		if(a>=b)
		{
			System.out.println("Greater of the number is " +a);
		}
		else
		{
			System.out.println("Greater of the number is " +b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		greateroftwo(a,b);
		
	}

}


output:

8.9
0.9
Greater of the number is 8.9
