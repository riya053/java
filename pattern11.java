package myproject;
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{ for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}

       System.out.println(" ");
	}

}
}
