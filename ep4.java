class pattern
{
  public static void main(String args[])
  {
    String s=args[0];
    int l=s.length();
    for(int i=0;i<l;i++)
    {
      int n=0;
      for(int j=0;j<l;j++)
        if(j<l-i-1)
          System.out.print(" ");
        else
        {
          System.out.print(s.charAt(n)+" ");
          n++;
        }
       System.out.println();
    }
  }
}
