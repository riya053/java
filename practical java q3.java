package riya;
import java.util.Scanner;

class Rooms{
	int roomno;
	float roomarea;
	String roomtype;
	boolean Acmachine;
	Rooms(int roomno,float roomarea,String roomtype,boolean Acmachine)
	{
		this.roomno=roomno;
		this.roomarea=roomarea;
		this.roomtype=roomtype;
		this.Acmachine=Acmachine;
	}
	void setData()
	{
		roomno=roomno;
		roomarea=roomarea;
		roomtype=roomtype;
		Acmachine=Acmachine;
	}
	void Displaydata()
	{
		System.out.println("Room no is:"+roomno);
		System.out.println("Room area is:"+roomarea);
		System.out.println("Room type is:"+roomtype);
		System.out.println("Ac machine is:"+Acmachine);
		
	}
}
public class Room {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter room type:");
		String roomtype=sc.nextLine();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter room number:");
		int roomno=s.nextInt();
		System.out.println("Enter room area:");
		float roomarea=s.nextFloat();
		System.out.println("Enter Ac machine:");
		boolean Acmachine=s.nextBoolean();
		Rooms r=new Rooms(roomno,roomarea,roomtype,Acmachine);
		r.setData();
		r.Displaydata();
		
		
		
	}

}