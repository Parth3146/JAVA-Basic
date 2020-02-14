import java.util.*;

class p6
{
	public static void main(String [] args)
	{
		char a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a letter: ");
		a=sc.next().charAt(0);
		toLowerCase(a);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
			System.out.println("Letter is a VOWEL");
		else
			System.out.println("Letter is a CONSONANT");
	}
}

