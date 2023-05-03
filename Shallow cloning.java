package riya;
class Test
{
	 int x,y;
}
class Test2 implements Cloneable
{
	int a;
	int b;
	Test c=new Test();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class Test1 {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Test2 a1=new Test2();
		a1.a=10;
		a1.b=20;
		a1.c.x=30;
		a1.c.y=40;
		Test2 a2=(Test2)a1.clone();
		a2.a=100;
		a2.c.x=300;
		System.out.println(a1.a+" "+a1.b+" "+a1.c.x+" "+a1.c.y);
		System.out.println(a2.a+" "+a2.b+" "+a2.c.x+" "+a2.c.y);
		
		
	}

}

output:
10 20 300 40
100 20 300 40
