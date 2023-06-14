class EgThread extends Thread
{
	public void run()
	{
		System.out.println("Running.......");
		System.out.println("Thread class Executed");
	}
	public static void main(String args[])
	{
		EgThread obj=new EgThread();     //newstate
		obj.start();                // caling start method
	}

		
}
