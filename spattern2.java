public class spattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entere the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=m;i++)
		{ for(int j=1;j<=n;j++)
		{
			if(i==1||j==1||i==m||j==n)
			{
				System.out.print("*");
			}else {
			System.out.print(" ");
		}
		}
			System.out.println();
		}

	}

}
