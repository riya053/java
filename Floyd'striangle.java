package myproject;
import java.util.Scanner;

public class Floydstraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int num=1;
		for(int i=1;i<m;i++)
		{
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(num+" ");
			   num=num+1;
		   }
		    System.out.println();
		}

	}
