import java.util.*;
class person
{
  int age,sal;
  String name;
  Scanner sc=new Scanner(System.in);
  void info()
  {
    System.out.println("Enter the name : ");
    name=sc.next();
    System.out.println("Enter the age : ");
    age=sc.nextInt();
    System.out.println("Enter the salary : ");
    sal=sc.nextInt();
  }
  void display()
  {
    System.out.println("The name, age and salary of the person is : "+ name +" "+ age +" "+ sal);
  }
}

class personObj
{
  public static void main(String args[])
  {
    person a=new person();
    a.info();
    a.display();
  }
}
