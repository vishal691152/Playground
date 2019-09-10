import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      boolean b=false;
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      
      for(int i=0;i<n;i++)
      {
       count++;
        for(int j=0;j<n;j++)
        {
          if(arr[j]==count)
          {
            b=true;
          }
        }
        if(b==false)
        {
          System.out.println(count);
        }
        b=false;
      }
    }
}