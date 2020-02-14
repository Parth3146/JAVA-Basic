import java.util.*;
class employee
{
    static int empno=0;
    void display()
    {
      System.out.println(empno);
    }
}
class teaching extends employee
{
    Scanner sc=new Scanner(System.in);
    String nameofsubject;
    int emp2;
    void getdata()
    {
        empno=empno+1;
        emp2=empno;
        System.out.println("Enter the name of subject : ");
        nameofsubject=sc.nextLine();
    }
    void display()
    {
      System.out.println("empno:   "+emp2+"    name of subject:   "+nameofsubject);
    }

}
class non_teaching extends employee
{
    Scanner sc=new Scanner(System.in);
    String typeofwork;
    int emp1;
    void getdata()
    {
        empno=empno+1;
        emp1=empno;
        System.out.println("Enter the type of work : ");
        typeofwork=sc.nextLine();
    }
    void display()
    {   
      System.out.println("empno:   "+emp1+"    type of work is:   "+typeofwork);
    }
}
class ep11
{
    public static void main(String args[])
    {
        teaching te=new teaching();
        te.getdata();
        teaching te1=new teaching();
        te1.getdata();
        non_teaching te2=new non_teaching();
        te2.getdata();
        non_teaching te3=new non_teaching();                        
        te3.getdata();
        te.display();
        te1.display();
        te2.display();
        te3.display();
    }
}
