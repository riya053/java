package myproject;
import java.util.Scanner;

public class Bubblesort {
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements of arrays:");
		for(int i=0;i<size;i++)
		{
	       arr[i]=sc.nextInt();
		}
		System.out.println("Sorting the array using bubble sort:");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{  if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		
      printarray(arr);
	}

}



output:
Enter the size of array:
6
Enter the elements of arrays:
8
5
7
6
4
5
Sorting the array using bubble sort:
4 
5 
5 
6 
7 
8 
