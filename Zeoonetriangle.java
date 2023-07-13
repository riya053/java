package myproject;
import java.util.Scanner;
public class Zeroonetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int p=sc.nextInt();
   for(int i=1;i<=p;i++)
   {
	   for(int j=1;j<=i;j++)
	   {   int sum=i+j;
		   if(sum%2==0) {
			   System.out.print("0  ");
			   }
		   else {
			   System.out.print("1  ");
		   }
	   }
	   System.out.println();
   }
	}

}
