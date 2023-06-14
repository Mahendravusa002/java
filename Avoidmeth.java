class Addi
{
	final void add1(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is"+c);	
	}
}
class Avoidmeth extends Addi
{
	void add(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication:"+c);
	}
	public static void main(String args[])
	{
		int n=6;
		int m=3;
		Avoidmeth a=new Avoidmeth();
        a.add1(n,m);
        a.add(n,m);
	}
}
