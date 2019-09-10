import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n==1)
        System.out.println("One");
      if(n==2)
        System.out.println("Two");
      if(n==3)
        System.out.println("Three");
      if(n==4)
        System.out.println("Four");
      if(n==5)
        System.out.println("Five");
      if(n>5)
      System.out.println("Invalid");
	}
}