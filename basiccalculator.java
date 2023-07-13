package myproject;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter operators");
		char c=sc.next().charAt(0);
		switch(c)
		{
			case '+':
				int sum=a+b;
				System.out.println(sum);
			  break;
			case '-':
				int minus=a-b;
			     System.out.println(minus);
			  break;
		   case '*':
			  int multi=a*b;
			   System.out.println(multi);
		      break;
		   case '/':
			  int div=a/b;
			   System.out.println(div);
		       break;
		   default:
			   System.out.println("Invalid choice");
			
		}

	}

}
