class Fact
{
	
	public static void main(String[] arg)
	{
		int a = Integer.parseInt(arg[0]);
		int ans=1,i;
		for(i=a;i>0;i--)
			ans=ans*i;
		System.out.println("Ans is " + ans);
	}
}


