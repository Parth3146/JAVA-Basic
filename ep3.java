import java.util.Scanner;

class ep3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
			s1=s1+s.charAt(i);
		if(s.equals(s1))
			System.out.println("The String is Palindrome");
		else
			System.out.println("The String is not Palindrome");
	}
}

