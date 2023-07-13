package myproject;
import java.util.Scanner;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<50&&b<50)
			System.out.println("Less han 50");
		else
			System.out.println("Not less than 50");
		if(a<50||b<50)
			System.out.println("Less han 50");
		else
			System.out.println("Not less than 50");
		
		Boolean isadult=false;
		if(!isadult)
		System.out.println("is adult");
		else
			System.out.println("Not adult");
		

	}

}
