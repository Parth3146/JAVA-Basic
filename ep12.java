class Vehicle
{
  int NoOfWheels;
}
class TwoWheeler extends Vehicle
{
  String type;
  TwoWheeler()
  { 
    super();
    type="bike";
     NoOfWheels=2;
  }
  void display()
  {
     System.out.println(type + " has " + NoOfWheels + " wheels ");
  } 
}
class FourWheeler extends Vehicle
{
  String type;
  FourWheeler()
  {
    super();
    type="car";
     NoOfWheels=4;
  }
  void display()
  {
     System.out.println(type + " has " + NoOfWheels + " wheels ");
  }
}
class ExtraPract12
{
  public static void main(String args[])
  {
     TwoWheeler t=new TwoWheeler();
     t.display();
     FourWheeler f=new FourWheeler();
     f.display();
  }
}
