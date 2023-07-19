package myproject;
import java.util.Scanner;

public class DisplayingSpiralordermatrix {

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
	      System.out.println("The spiral order matrix is: ");
	      int rowstart=0,rowend=n-1,colstart=0,colend=m-1;
	      while(rowstart<=rowend && colstart<=colend)
	      {
	    	  for(int col=colstart;col<=colend;col++)
	    	  {
	    		  System.out.print(numbers[rowstart][col]+ " ");
	    	  }
	    	  rowstart++;
	    	  
	    	  
	    	  for(int row=rowstart;row<=rowend;row++)
	    	  {
	    		  System.out.print(numbers[row][colend]+ " ");
	    	  }
	    	  colend--;
	    	  
	    	  
	    	  for(int col=colend;col>=colstart;col--)
	    	  {
	    		  System.out.print(numbers[rowend][col]+ " ");
	    	  }
	    	  rowend--;
	    	  
	    	  for(int row=rowend;row>=rowstart;row--)
	    	  {
	    		  System.out.print(numbers[row][colstart]+ " ");
	    	  }
	    	  colstart++;
	    	  
	    	  System.out.println();
	      }
	}

}


output:

4
4
2
3
4
5
6
7
8
9
1
2
3
4
1
2
3
4
The spiral order matrix is: 
2 3 4 5 9 4 4 3 2 1 1 6 
7 8 3 2 
