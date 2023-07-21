package myproject;
import java.util.Scanner;

public class Selectionsort {
	
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
		System.out.println("Sorting the array using selection sort:");
		for(int i=0;i<arr.length-1;i++)
		{
		 int smallest=i;
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[smallest]>arr[j])
			 {
				 smallest=j;
			 }
		 }
		 int temp=arr[smallest];
		 arr[smallest]=arr[i];
		 arr[i]=temp;
		}
		
		printarray(arr);

	}
	
}


output:
Enter the size of array: 
5
Enter the elements of array:
6
5
7
4
8
Sorting the array using selection sort:
4 
5 
6 
7 
8 
