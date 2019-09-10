import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
 	Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int length1=Integer.toString(number).length();
      int i=0;
      int arr1[]=new int[10];
      int arr2[]=new int[10];
      int n=number;
      for( i=0;i<length1;i++)
      {
		arr1[i]=n%10;
        n=n/10;
      }
       for( i=length1;i>0;i--)
      {
		 arr2[i]=arr1[length1-i];
      }
      System.out.println(arr2[2]);
    }
}