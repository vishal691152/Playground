import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=num1%100;
      int num3=num2/10;
      System.out.print(num3);
	}
}