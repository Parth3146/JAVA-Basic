import java.util.Scanner;

class P4
{
	public static void main(String args[])
	{
		
		double we,he,BMI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight(lbs) and Height(inch): ");
		we = sc.nextDouble();
		he = sc.nextDouble();
		we = we*0.45359237;
		he = he*0.0254;
		BMI = (we/(he*he));
		System.out.println("BMI = "+BMI);
	}
}
 
		
		
		
