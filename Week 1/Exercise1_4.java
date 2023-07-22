// check armstrong number or not

import java.util.Scanner;
public class Exercise1_4 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int result=0;
int num = n;

//Use while loop check the number is Armstrong or not.
while(num > 0)
{
  int r = num % 10;
  result += r * r * r;
  num = num / 10;
}

//store the output(1 or 0) in result variable.

if(result == n)
{
  System.out.println(1);
}

else
{
  System.out.println(0);
   
}
}
}

  
  
