import java.util.*;
class stack
{
  int a[]=new int[11];
  int top=0;
  void push(int x)
  {
    if(top==a.length-1)
      System.out.println("the stack is overflow");
    else
    {
      top++;
      a[top]=x;
    }
  } 
  void pop()
  {
    if(top==0)
      System.out.println("the stack is underflow");     
    else
      top--;
  }
  void display()
  {
    for(int j=top;j>0;j--)
       System.out.println(a[j]);
  }
}


class stackArray
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  stack a=new stack();
  boolean b=true;
  while(b)
  {
    System.out.println("1. push  2.pop  3.display  4.exit");
    System.out.println("Enter ur choice :");    
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1:System.out.println("Enter the value u want to enter :");
             int x=sc.nextInt();
             a.push(x);
             break;
      case 2:a.pop();
             break;
      case 3:a.display();
             break;
      case 4:System.exit(0);
    }
  }
 }
}
