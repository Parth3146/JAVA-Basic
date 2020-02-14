import java.util.*;

class p13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ans=0;
		String s1 = sc.nextLine();
		s1=s1.replaceAll(" ","");
		s1=s1.replaceAll("[+]"," + ");
		s1=s1.replaceAll("[-]"," - ");
		s1=s1.replaceAll("[*]"," * ");
		s1=s1.replaceAll("[/]"," / ");		
		String str[] = s1.split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[2]);
		switch(str[1].charAt(0))
		{
			case '+': ans = a+b;
				  System.out.println("Sum = "+ans);
				  break;
			case '-': ans = a-b;
				  System.out.println("Substraction  = "+ans);
				  break;
			case '*': ans = a*b;
				  System.out.println("Multiplication = "+ans);
				  break;
			case '/': ans = a/b;
				  System.out.println("Division = "+ans);
				  break;
		}
	}
}

