package myproject;
import java.util.Scanner;

public class Creating2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int cols=sc.nextInt();
      int numbers[][]=new int[rows][cols];
      for(int i=0;i<rows;i++)
      {
    	  for(int j=0;j<cols;j++)
    	  {
    		  numbers[i][j]=sc.nextInt();
    	  }
      }
      
      System.out.println();
      System.out.println("Enter the element to be searched: ");
      int x=sc.nextInt();
      
      for(int i=0;i<rows;i++)
      {
    	  for(int j=0;j<cols;j++)
    	  {
    		 if(numbers[i][j]==x)
    				 {
    					 System.out.println("The element found at location: ( " +i+ "," +j+ ")" );
    				 }
    	  }
    	  
      }
	}

}

output:
3
4
1 2 3 4
2 4 5 6
5 6 7 8

Enter the element to be searched: 
7
The element found at location: ( 2,2)
