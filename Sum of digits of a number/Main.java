import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
 	Scanner sc=new Scanner(System.in);
      int number=sc.nextInt(),sum=0;
      int length1=Integer.toString(number).length();
      int i=0;
      int arr1[]=new int[10];
      int n=number;
      for( i=0;i<length1;i++)
      {
		arr1[i]=n%10;
        n=n/10;
      }
      for(i=0;i<length1;i++)
      { 
        sum=sum+arr1[i];
      }
      System.out.println(sum);
     
      
    }
}