package riya;
abstract class 	Bike
{
	 Bike(){
		 System.out.println("Bike is created");
		
	 }
	 abstract void run();
	 void changegear()
	 {
		 System.out.println("Gear is changed";)
	 }
}
class Honda extends Bike
 {
	Honda()
	{
		System.out.println("Honda bike is created");
	}
	void run()
	{
		System.out.println("Bike is running");
	}

}
public class Abstract1 {
	public static void main(string args[])
	{
		Bike b=new Honda();
		b.run();
		b.changegear();
		
	}
	
}
