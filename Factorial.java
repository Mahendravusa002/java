 import java.util.Scanner;
class Factorial
{
 public static void main(String args[])
 {
  int fact=1;
  Scanner s= new Scanner(System.in);
  System.out.println("Enter number for finding factorial");
  int n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   fact=fact*i;
  }
  System.out.println(n+"factorial is"+fact);
 }
}

