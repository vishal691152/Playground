import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr1[]=new int[n];
      int count=0;
      boolean b=true;
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=n-1;i>=0;i--)
      {
        arr1[i]=arr[count];
        count++;
      }
      for(int i=0;i<n;i++)
      {
        if(arr[i]==arr1[i])
        {
          b=true;
        }
        else
        {
          b=false;
          break;
        }
      }
      if(b==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}