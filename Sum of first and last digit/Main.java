import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int last=0,first=0,i=0,f=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int length1=Integer.toString(n).length();
      first=n/10;
       for(i=1;i<length1-1;i++)
      {
        first=first/10;;
       }
      for(i=1;i<length1;i++)
      {
        last=n%10;
      }
      int sum=first+last;
     System.out.println(sum);
	}
}
