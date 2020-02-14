import java.util.*;
interface Shape2D
{
  public abstract void a_circle();
}
interface Shape3D
{
  public abstract void v_sphere();
}
abstract class Shape
{
  abstract void display();
}
class Circle extends Shape implements Shape2D
{
  int r;
  double a;
  Scanner sc=new Scanner(System.in);
  public void a_circle()
  {
    System.out.println("enter the radius of circle: ");
    r=sc.nextInt();
    a=3.14*r*r;
  }
  void display()
  {
    System.out.println("the area is: "+a);
  }
}
class Sphere extends Shape implements Shape3D
{
  int r;
  double v;
  Scanner sc=new Scanner(System.in);
  public void v_sphere()
  {
    System.out.println("enter the radius of sphere: ");
    r=sc.nextInt();
    v=3.14*r*r*r*4/3;   
  }
  void display()
  {
    System.out.println("the volume is: "+v);
  }
}
class ExtraPract14
{
  public static void main(String args[])
  {
    Circle c=new Circle();
    c.a_circle();
    c.display();
    Sphere s=new Sphere();
    s.v_sphere();
    s.display();
  }
}
