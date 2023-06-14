class Egthread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread class is created by Runnable interface");
	}
	public static void main(String args[])
	{
		Egthread1 o= new Egthread1();
		Thread obj=new Thread(o);
		obj.start();
	}
}
