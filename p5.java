import java.util.Scanner;

class p5
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b)
		{
			if(b>c)
				System.out.println("Decreasing Order of The Numbers: " +a+ " " +b+ " "+c);
			else if(a>c)
				System.out.println("Decreasing Order of The Numbers: " +a+ " " +c+ " " +b);
			else
				System.out.println("Decreasing Order of The Numbers: " +c+ " " +a+" " +b);
		}
		else
		{
			if(a>c)
				System.out.println("Decreasing Order of The Numbers: " +b+ " " +a+ " " +c);
			else if(b>c)
				System.out.println("Decreasing Order of The Numbers: " +b+ " " +c+ " " +a);
			else
				System.out.println("Decreasing Order of The Numbers: " +c+ " " +b+ " " +a);
		}
	}
}

