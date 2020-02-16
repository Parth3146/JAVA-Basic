import java.util.*;

class student
{
	private int id,div;
	private String name;
	Scanner sc = new Scanner(System.in);
	public void getStudentInfo()
	{
		System.out.println("Enter id and div: ");
		id = sc.nextInt();
		div = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
	}
	public void displayStudentInfo()
	{
		System.out.println("Student details are: ");
		System.out.println("ID: "+id+" Div: "+div+" Name: "+name);
	}
	int rid()
	{
		return id;
	}
}

class marks extends student
{
	protected int a[]  = new int[6];
	Scanner sc = new Scanner(System.in);
	public void getMarks()
	{
		getStudentInfo();
		System.out.println("Enter marks of 6 subject: ");
		for(int i=0;i<6;i++)
			a[i]=sc.nextInt();
	}
	public void displayMarks()
	{
		displayStudentInfo();
		System.out.println("The marks are: ");
		for(int i=0;i<6;i++)
			System.out.print(" "+a[i]);
	}
}

class result extends marks
{
	public int total;
	public float avg;
	public void getResult()
	{
		total=0;
		avg=0;
		getMarks();
		for(int i=0;i<6;i++)
			total+=a[i];
		avg=total/6;
	}
	public void displayResult()
	{
		displayMarks();
		System.out.println();
		System.out.println("Total = "+total+" Average = "+avg);
	}
	void sort(result r[],int n)
	{
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(r[i].rid()>r[j].rid())
				{
					result t = new result();
					t=r[i];
					r[i]=r[j];
					r[j]=t;
				}
	}
}

class studentTest
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int i;
		int n = Integer.parseInt(args[0]);
		result temp = new result();
		result r[] = new result[n];
		for(i=0;i<n;i++)
		{
			r[i]=new result();
			r[i].getResult();
		}
		temp.sort(r,n);
		for(i=0;i<n;i++)
			r[i].displayResult();
		
	}
}
