package myproject;
import java.util.Scanner;


public class GCDofnumber {
	 public static void gcdofnumber(int a,int b)
	    {   int g=0,min;
	    	if(a<=b)
	    	{
	    	 min=a;	
	    	}
	    	else
	    	{
	    		min=b;
	    	}
	        for(int i=1;i<=min;i++)
	        {
	            if((a%i==0)&&(b%i==0))
	            {
	                g=i;
	            }
	           
	        }
	         System.out.println("GCD " +g);
	    }
	    public static void main(String[] args)
	    {	
	    	Scanner sc=new Scanner(System.in);
	    	
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        gcdofnumber(a,b);
	    }
	}

output:
70
10
GCD 10
