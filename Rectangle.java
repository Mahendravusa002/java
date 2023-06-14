import java.util.Scanner;
interface AreaPerimeter
{
	public void area(int l,int b);
	public void perimeter(int l,int b);
}
class Rectangle implements AreaPerimeter
{
	public void area(int l,int b)
	{
		int a=l*b;
		System.out.println("area of ractangle ="+a);
		
	}
	public void perimeter(int l,int b)
	{
		int p=2*(l+b);
		System.out.println("perimer of ractangle ="+p);
	}
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter area & perimeter  of Rectangle");
		int length=s.nextInt();
		int breadth=s.nextInt();
		Rectangle r=new Rectangle();
		r.area(length,breadth);
		r.perimeter(length,breadth);
	}
}
		
	
