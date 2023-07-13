package myproject;

import java.util.Arrays;

public class arrayfunction {

	public static void main(String[] args) {
		int[] marks=new int[3];
		marks[0]=95;
		marks[1]=98;
		marks[2]=78;
		System.out.println(marks);
		System.out.println(marks[2]);
		//length
		System.out.println(marks.length);
		//sort function
		System.out.println(marks[0]);//it will give output 95
		Arrays.sort(marks);
		System.out.println(marks[0]);//it will give output 78 
		//array is sorted now
		// TODO Auto-generated method stub

	}

}
