package riya;

 class calculation {
	int z;
	void multiplication(int a,int b)
	{
		z=a*b;
		System.out.println(z);
	
	}
}
class My_calculation extends calculation{
	void addition(int a,int b)
	{
		z=a+b;
		System.out.println(z);
	}
	void subtraction(int a,int b)
	{
		z=a-b;
		System.out.println(z);
	}
	
}
public class calculator  {
	public static void main(String[] args) {
		int a=10,b=5;
		My_calculation cal=new My_calculation();
		cal.multiplication(a,b);
		cal.subtraction(a, b);
		cal.addition(a, b);
	}
}
