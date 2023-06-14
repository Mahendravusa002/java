import java.util.*;
class EgSuper
{
	String colour="pink";
	final double PI=3.14;
	double  area_of_circle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		float r=s.nextFloat();
		double A=PI*r*r;
		return A;
	}
}
class Egchild extends EgSuper
{
	void access()
	{
		System.out.println("Acesseing parent class");
		System.out.println("radius of circle is  "+super.area_of_circle());
		System.out.println("colour of circle is"+super.colour);
	}
	public static void main(String args[])
	{
		Egchild ec=new Egchild();
		ec.access();
	}
}

	
		
		
		
	
