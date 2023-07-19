package myproject;
import java.util.Scanner;

public class Searchanelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Searching an element in array and returning its index
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched in array: ");
		int x=sc.nextInt();
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==x)
			{
				System.out.println("Element found at index: " +i);
			}
		}
		

	}

}

output:
Enter the size of an array: 
7
2
2
3
4
5
6
7
Enter the element to be searched in array: 
2
Element found at index: 0
Element found at index: 1
