import java.util.Scanner;

class ep1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		int length = s1.length();
		int half = length/2;
		System.out.println("Other half string is: "+s1.substring(half));
	}
}		
