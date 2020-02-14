import java.util.Scanner;

class p8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number to find factors: ");
		n = sc.nextInt();
		factor(n);
	}
	
	static void factor(int a)
	{
		int i=2;
		while(a!=1)
		{
			if(a%i==0)
			{
				a=a/i;
				System.out.println(i);
			}
			else
				i++;
		}
	}
}
