import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
int a;
System.out.println("enter a value : ");
Scanner s = new Scanner(System.in);
a = s.nextInt();
if (a%2==0)
{
System.out.println("a is even "+a);
}
else
{
System.out.println("a is odd "+a);
}
}
}