package java2;

class Csum{

	void add(int num1,int num2){
		int s=num1+num2;
		System.out.println("sum "+s);
	}
}

public class command1 {
public static void main(String[] args) { 
		// TODO Auto-generated method stub
		if(args.length==2) {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			 new Csum().add(num1,num2);	
		}
		else 
		System.out.println("please enter command line");		
	}
}