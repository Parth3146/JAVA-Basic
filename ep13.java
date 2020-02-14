abstract class A
{
  abstract void display();
}
class A1 extends A
{
  void display()
  {
    System.out.println("This is class A1");
  } 
}
class A2 extends A
{
  void display()
  {
    System.out.println("This is class A2");
  }
}
class ExtraPract13
{
  public static void main(String args[])
  {
     A1 b=new A1();
     b.display();
     A2 c=new A2();
     c.display();
  }
}
 
