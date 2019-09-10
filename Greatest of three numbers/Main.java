import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      boolean temp=true;
      int temp1=0;
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int num3=sc.nextInt();
      if(num1>num2)
      {
        if(num1>num3)
         temp=true;
      }
      if(num2>num1)
      {
        if(num2>num3)
        temp1=2;
      }
      if(num3>num1)
      {
        if(num3>num2)
          temp=false;
      }
      if(temp==true)
        System.out.println(num1);
      if(temp1==2)
        System.out.println(num2);
      if(temp==false)
		System.out.println(num3);    
    }
  
}