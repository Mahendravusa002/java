import java.lang.*;
class ThreadA extends Thread
{
	public void run()
	{
		System.out.println("ThreadA RUNNING");
		System.out.println("ThreadA is Executed");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		System.out.println("ThreadB Running");
		System.out.println("ThreadB is Executed");
	}
}
class Multithread extends Thread
{
	public static void main(String args[])
	{
		System.out.println("welcome to multithreading");
		ThreadA a= new ThreadA();
		ThreadB b= new ThreadB();
		a.start();
		b.start();
	}
} 