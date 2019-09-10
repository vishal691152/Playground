import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=0,count=0;
      for(int i=1;i<=n;i++)
      {count=s;
        for(int j=1;j<=i;j++)
        { 
          count=count+1;
          if(count%2==0)
          {
            System.out.print("#");
            
          }
          else
          {
            System.out.print("*");
          }
        }
        s=count;
        System.out.print("\n");
      }
    }
}