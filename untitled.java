import java.util.Scanner;
class Addition
{
	public  int  addition(int a,int b )
	{
		int c=a+b;
		return c;
		
	}
}
class Calculation extends Addition 
{
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
        Calculation c=new Calculation();
        System.out.println("enter x,y values");
        int x=s.nextInt();
        int y=s.nextInt();
		int s=c.addition(x,y);
		System.out.println("addition is"+s);
		
		
	}
}
			
			
		
 
