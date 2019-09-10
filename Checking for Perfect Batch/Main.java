import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    perfetchBatch(list,n);
  }
  public static void perfetchBatch(int list[],int n)
  {
    boolean a=true;
    int current=0;
    int batch=list[0]+list[1]+list[2];
    for(int index=3;index<=n-1;index=index+3)
    {
      current=list[index]+list[index+1]+list[index+2];
    }
    if(batch!=current)
      a=false;
    if(a==true)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}