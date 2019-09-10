import java .io.*;
import java.util.Scanner;
import java.lang.Math;
 class Main
{
  public static void main(String[] args)
  {
  	Scanner sc=new Scanner(System.in);
 	int base=sc.nextInt();
  	int expo=sc.nextInt();
  	int ans=fun(base,expo);
  	System.out.print(ans);
	}
  public static int fun(int b,int e)
  {int re=1;;
 	for(int i=1;i<=e;i++)
    {
      re=re*b;
    }
    return re;
  }
}