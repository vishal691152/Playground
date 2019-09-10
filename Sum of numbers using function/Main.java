import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sum(n);
      System.out.println(n1);
	}
  public static int sum(int n2)
  {
    int n5=0;
    for(int i=1;i<=n2;i++)
    {
      int n4=i;
      
      n5=n5+i;
     
    }
     return n5;
  }
}