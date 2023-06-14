import java. util.Scanner;
class FindIntrest extends Addition
{
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
        FindIntrest c=new FindIntrest();
        System.out.println("enter original money");
        int x=s.nextInt();
        System.out.println("enter Intrest");
        int y=s.nextInt();
		int e=c.addition(x,y);
		System.out.println("total amount is"+e);
		
		
		
	}
}
