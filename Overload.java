class Overload
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
		System.out.println(o.sum());
		System.out.println(o.sum(3,5,2));
		System.out.println(o.sum(1,2));
		
	}	
}

