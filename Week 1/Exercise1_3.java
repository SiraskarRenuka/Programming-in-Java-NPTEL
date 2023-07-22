// sum of n natural number which is divisible by 3

import java.util.Scanner;
public class Exercise1_3 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int sum=0;

//Use for or while loop do the operation.
int a = 0;

for(int i=0;i<=n;i++)
{
  a=a+2;
  
  if(a%3==0)
  {
    sum+=a;
  }
  
}

System.out.print(sum);
}
}

