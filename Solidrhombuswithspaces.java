public class Solidrhombuswithspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==m||i==1||i==m)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
