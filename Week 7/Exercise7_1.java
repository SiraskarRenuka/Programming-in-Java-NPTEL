// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;
public class Question1{ 
        public static void main (String[] args){

//Write the appropriate code to read the 3 integer values and find their sum.
         Scanner obj = new Scanner(System.in);
         int n1 =  obj.nextInt();
         int n2 =  obj.nextInt();
         int n3 =  obj.nextInt();
         int sum = n1+n2+n3;
       System.out.println(sum);
  }
}