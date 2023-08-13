import java.util.Scanner; //This package for reading input
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); //Read an integer
	System.out.println(fib(n)); //Generate and print the n-th Fibonacci number            
                                  
    } 
static int fib(int n) {

  int fib=0,f1=-1,f2=1;
     for(int i=0;i<n;i++)
       {
         fib = f1+f2;
         f1 = f2;
         f2 = fib;
  	}
    return fib;
}
}