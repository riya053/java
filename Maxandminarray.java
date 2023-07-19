package myproject;
import java.util.Scanner;

public class Maxandminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Minimum value of the array : " +min);
		System.out.println("Maximum value of the array:  " +max);
	}

}

output:
6
8
9
6
4
5
6
Minimum value of the array : 0
Maximum value of the array:  9
