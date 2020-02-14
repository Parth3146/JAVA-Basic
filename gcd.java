
 import java.util.Scanner;

class p9
{
	public static void main(String args[])
	{	
		int n1,n2; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to find GCD: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int a = gcd(n1,n2);
		System.out.println("GCD = "+a);
	}
	
	public static int gcd(int a,int b)
	{
		int r=1;
		while(r!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
