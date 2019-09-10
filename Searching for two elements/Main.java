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
      int element1=sc.nextInt();
      int element2=sc.nextInt();
      int index1=found(element1,arr,n);
      int index2=found(element2,arr,n);
      System.out.print(index1+"\n"+index2);
    }
  static int found(int e,int arr[],int n)
  {	
   // arr[]=new int[n];
    int count=0;
    for(int i=1;i<n;i++)
    {
      if(e==arr[i])
      {
        e=i;
        count=0; 
        break;
      }
      else
      {
      count++;
       continue; 
      }
    }
    if(count!=0)
      return -1;
    else
      return e;
  }
}