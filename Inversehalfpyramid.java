package myproject;
import java.util.Scanner;

public class Inversehalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<m-i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
