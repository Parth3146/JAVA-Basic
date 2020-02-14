class Calc
{
	
	public static void main(String[] arg)
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		int ans;
		switch(arg[2])
		{
			case "+": ans=a+b;
				  System.out.println(ans);
				  break;
			case "-": ans=a-b;
				  System.out.println(ans);
				  break;
			case "x": ans=a*b;
				  System.out.println(ans);
				  break;
			case "/": ans=a/b;
				  System.out.println(ans);
				  break;
			case "%": ans=a%b;
				  System.out.println(ans);
				  break;
			default : System.out.println("Error 404 !!");
		}
	}
}


