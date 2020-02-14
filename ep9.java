class student
{
  String name;
  int roll,marks;
  student()
  {
    name="default";
    roll=0;
    marks=0;
  }
  student(String name,int roll,int marks)
  {
    this.name=name;
    this.roll=roll;
    this.marks=marks;
  }
  void display()
  {
    System.out.println("name is "+name+" roll no is "+roll+" and marks is "+marks);
  }
}

class constructorOverloading
{
  public static void main(String args[])
  {
    student d=new student();
    student d1=new student("Parth",552,100);
    d.display();
    d1.display();
  } 
}
