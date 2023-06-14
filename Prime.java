import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int count;
  Scanner s= new Scanner(System.in);
  System.out.println("Enter range for finding prime numbers");
  int n=s.nextInt();
  for(int i=2;i<=n;i++)
  {count=0;
   for(int j=1;j<=i;j++)
   {
	   if (i%j==0)
	   {
		   count++;}
   }
  if (count==2)
  {
	  System.out.println(i+"is prime number");
   }
  }
 }
}   