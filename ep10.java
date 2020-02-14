class circle
{
  int r1;
  double r2;
  circle(double r2)
  {
    this.r2=r2;
    System.out.println("the area is : "+(3.14*r2*r2));
  }
  circle(int r1)
  {
    this.r1=r1;
    System.out.println("the area is : "+(3.14*r1*r1));
  }
}

class circleArea
{
  public static void main(String args[])
  {
    circle d=new circle(10);
    circle d1=new circle(10.5);
  } 
}
