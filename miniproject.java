package myproject;
import java.util.Scanner;

public class Miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
  int mynumber=(int)(Math.random()*100);
  int usernumber=0;
  
  do {
	  System.out.println("Guess my number: ");
	  usernumber=sc.nextInt();
	  
	  if(usernumber==mynumber) {
		  System.out.println("WOOHOOOO....Correct number!!!");
		  break;
	  }
		  else if(usernumber>mynumber) {
			  System.out.println("Your number is too large");
		  }
		  else {
			  System.out.println("Your number is too small");
		  }
  }while(usernumber>=0);
    
  		System.out.println("My number was:  ");
  		System.out.println(mynumber);
	}

}
