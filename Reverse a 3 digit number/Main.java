import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int s=0;
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<3;i++)
    {
      s=(a%10);
      System.out.print(s);
      a=a/10;
    }
  }
}