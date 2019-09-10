import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=sc.nextInt();
    maxindex(list,n);
  }
  public static void maxindex(int list[], int n)
  {
    int max=list[0];
    int a=0;
    for(int i=1;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
        a=i;
      }
     }
    System.out.print(a);
  }
}