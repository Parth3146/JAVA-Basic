import java.util.*;

class ep2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		String s2[] = s1.split(" ");
		int c=0;
		for(String a : s2)
		{
			if(Character.isUpperCase(a.charAt(0)))
				c++;
		}
		System.out.println("No. of Words having first letter capital = "+c);
	}
}		
