import java.util.Scanner;

class P3
{
	public static void main(String args[])
	{
		double m,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in meters: ");
		m = sc.nextFloat();		
		f = m*3.28;	
		System.out.println("Feet = "+f);
	}
}

