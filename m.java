import java.lang.Math;
import java.util.Scanner;
class QuadRoots
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System .out.println("enter a,b,c values");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  double r1,r2;
  int d=(b*b)-*(4*a*c);
  if(d>0)
  {
   System .out.println("real roots");
   r1=(-b+(Math.sqrt(d))/2*a;
   r2=(-b-(Math.sqrt(d))/2*a;
   System .out.println("r1"+r1+"r2"+r2);
  }
  else if(d==0)
  {
   System .out.println("equal real roots");
   r1=r2=-b/2*a;
   System .out.println("r1"+r1+"r2"+r2);
  }
   else
  {
   System .out.println(" non real roots");
   r1=(-b)/2*a;
   r2=(math.sqrt(d)/2*a;
   System .out.println("r1"+r1+"r2"+r2)
  }
}
}


