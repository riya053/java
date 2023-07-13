package myproject;
import java.util.Scanner;

public class Butterflypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			int spaces=2*(m-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=m;i>=1;i--)
		{
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  int spaces=2*(m-i);
		  for(int j=1;j<=spaces;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("*");
			  }
		  System.out.println();
		  }
	}
