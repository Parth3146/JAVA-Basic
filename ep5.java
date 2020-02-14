class sort
{
 public static void main(String args[])
 {
  int s=Integer.parseInt(args[0]);
  int a[]=new int[s];
  for(int i=0;i<s;i++)
  {
   a[i]=Integer.parseInt(args[i+1]);
  } 
  for(int i=0;i<s-1;i++)
  {
   for(int j=0;j<s-i-1;j++)
   {
    if(a[j]>=a[j+1])
    {
     int temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp;
    }
   }
  }
  for(int i=0;i<s;i++)
    System.out.print(a[i]+" ");
  System.out.println();
 } 
}
