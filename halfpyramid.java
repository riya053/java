package myproject;
import java.util.Scanner;

public class Halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
