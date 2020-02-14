import java.util.Random;

class p12
{
	public static void main(String args[])
	{
		Random r = new Random();
		r.setSeed(1000);
		for(int i=1;i<=100;i++)
			System.out.print(r.nextInt(49)+" ");
		System.out.println();
	}
}

