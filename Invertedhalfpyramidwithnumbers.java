package myproject;
import java.util.Scanner;

public class Invertedhalfpyramidwithnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(j);
				
			}
			
			 System.out.println();
		}

	}

}
