package myproject;
import java.util.Scanner;

public class Spattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of m");
		int m=sc.nextInt();
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
		System.out.println("  ");
		}

	}
