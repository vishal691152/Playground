import java.util.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int count=1,count1=1;
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
        if(count>k)
          break;
        for(int j=1;j<n;j++)
        {
         if(count==arr[j])
         {
           count1++;
         }
        }
        System.out.print(count+" "+count1+"\n"); 
        count++;
        count1=0;
      }
    }
}