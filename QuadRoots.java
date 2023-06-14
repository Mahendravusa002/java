//import java.lang.Math;
import java.util.Scanner;
class QuadRoots
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System .out.println("enter a,b,c values");
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  double c=sc.nextDouble();
  double r1,r2;
  double d=(b*b)-(4.0*a*c);
  if(d>0.0)
  {
   System .out.println("Equation have real roots");
   r1=(-b+Math.sqrt(d))/(2*a);
   r2=(-b-Math.sqrt(d))/(2*a);
   System .out.println("r1="+r1+ "r2="+r2);
  }
  else if(d==0.0)
  {
   System .out.println("Equation have equal real roots");
   r1=(-b/(2*a));
   System .out.println("r1= r2="+r1);
  }
   else
  {
   System .out.println("Equation have imaginary roots");
  }
}
}


