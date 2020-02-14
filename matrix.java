import java.util.Scanner;

class matrix
{
	public static void main(String args[])
	{
		int a[][] = new int[6][6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix elements (only 0 or 1) row wise: ");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("The Matrix: ");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				System.out.print(" "+a[i][j]+" ");
			System.out.println(" ");
		}
		matrix.oddCheck(a);
	}
	
	static void oddCheck(int b[][])
	{
		int temp,i,j;
		System.out.println("Rows having odd number of 1's: ");
		for(i=0;i<6;i++)
		{
			temp=0;
			for(j=0;j<6;j++)
			{
				if(b[i][j] == 1)
					temp++;
			}
			if(temp%2!=0)
			{
				for(j=0;j<6;j++)
					System.out.print(" "+b[i][j]+" ");
				System.out.println(" ");
			}
		}
		System.out.println("Columns having odd number of 1's: ");
		for(i=0;i<6;i++)
		{
			temp=0;
			for(j=0;j<6;j++)
			{
				if(b[j][i] == 1)
					temp++;
			}
			if(temp%2!=0)
			{
				for(j=0;j<6;j++)
					System.out.println(" "+b[j][i]+" ");
				System.out.println("_____");
			}
		}	
	}
}




