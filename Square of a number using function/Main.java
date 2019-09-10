import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=square(n);
      System.out.println(n1);
	} 
  public static int square(int n2)
  {
    int n3=n2;
    int n4=n3*n3;
    return n4;
  }
}