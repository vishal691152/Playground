import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      max(arr,n);
    }
  static void max(int arr[],int n)
  {
    int max1=arr[0];
    for(int i=1;i<n;i++)
    {
      if(max1<arr[i])
        max1=arr[i];
      else
        continue;
    }
    System.out.print(max1);
  }
}