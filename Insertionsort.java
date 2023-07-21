package myproject;

import java.util.Scanner;

public class Insertionsort {
	
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
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Sorting the array using insertion sort:");
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0&&current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
  printarray(arr);
	}

}


output:

Enter the size of array: 
5
Enter the elements of array:
7
4
6
3
5
Sorting the array using insertion sort:
3 
4 
5 
6 
7 
