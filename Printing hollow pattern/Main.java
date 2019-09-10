import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int rows = n, columns = n; 
        print_rectangle(rows, columns); 
	}
   static void print_rectangle(int n, int m) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
       
    } 
}