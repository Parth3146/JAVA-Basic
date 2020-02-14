import java.util.*;
class addMatrix
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    int b[][]=new int[3][3]; 
    int c[][]=new int[3][3];   
    System.out.println("Enter matrix A row-wise");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a.length;j++)
      {
        a[i][j]=sc.nextInt();
      }
    } 
    System.out.println("Enter matrix B row-wise");
    for(int i=0;i<b.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        b[i][j]=sc.nextInt();
      }
    } 
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        c[i][j]=a[i][j]+b[i][j];
      }
    }
    for(int i=0;i<c.length;i++)
    {
      for(int j=0;j<c.length;j++)
      {
        System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
  }
}
