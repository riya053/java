package myproject;
import java.util.Scanner;

public class Transposeofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      int numbers[][]=new int[n][m];
	      for(int i=0;i<n;i++)
	      {
	    	  for(int j=0;j<m;j++)
	    	  {
	    		  numbers[i][j]=sc.nextInt();
	    	  }
	      }
	      System.out.println("The Transpose of matrix is: ");
	      
	      for(int j=0;j<m;j++)
	      {
	    	  for(int i=0;i<n;i++)
	    	  {
	    		  System.out.print(numbers[i][j]+" ");
	    	  }
	    	  System.out.println();
	      }

	}

}

output:

3
4
1 2 3 4
5 6 7 8
4 2 3 2
The Transpose of matrix is: 
1 5 4 
2 6 2 
3 7 3 
4 8 2 
