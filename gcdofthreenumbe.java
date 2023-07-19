package myproject;
import java.util.Scanner;


public class GCDofnumber {
	 public static void gcdofthreenumber(int a,int b,int c)
	    {   int g=0,min;
	    	if(a<=b&&a<=c)
	    	{
	    	 min=a;	
	    	}
	    	else if(b<=a&&b<=c)
	    	{
	    		min=b;
	    	}
	    	else
	    	{
	    		min=c;
	    	}
	        for(int i=1;i<=min;i++)
	        {
	            if((a%i==0)&&(b%i==0)&&(c%i==0))
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
	        int c=sc.nextInt();
	        gcdofthreenumber(a,b,c);
	    }
	}

output:
15
5
25
GCD 5
