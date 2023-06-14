class COverload
{
	COverload()
	{
		System.out.println("This is Default constructor");
	}
	COverload(int a,int b)
	{
		System.out.println(a+"*"+b+"="+a*b);
	}
	COverload(int a)
	{
		int c=a+7;
		System.out.println(a+"+"+7+"="+c);
	}
	public static void main(String args[])
	{
		COverload c=new COverload();
		COverload d=new COverload(10);
		COverload f=new COverload(2,4);
		
	}
}
		
		
		
