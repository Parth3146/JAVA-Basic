class Fibonacci
{
	public static void main(String[] arg)
	{
		int a=Integer.parseInt(arg[0]),i,ans=1;
		
		for(i=0;i<=a;i++)
		{
			ans=ans+i;
			System.out.println(ans);
		}
	}
}

