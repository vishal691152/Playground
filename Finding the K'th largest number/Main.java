import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr1[]=new int[n];
      int count=n;
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int k=sc.nextInt();
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
        count--;
        arr1[count]=arr[i];
      }
      System.out.print(arr1[k-1]);
    }   
}