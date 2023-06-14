class MOverload
{
	public int sum(int a,int b)
	{
		return(a+b);
	}
	public int sum(int a,int b,int c)
	{
		return(a+b+c);
	}
	public int sum()
	{
		return(5+7);
	}
	public static void main(String args[])
	{
		Overload o= new Overload();
		System.out.println("Result is "+o.sum());
		System.out.println("Result is "+o.sum(3,5,2));
		System.out.println("Result is "+o.sum(1,2));
		
	}	
}

