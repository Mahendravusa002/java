import java. util.Scanner;
class AddSalary extends Addition
{
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
        AddSalary c=new AddSalary();
        System.out.println("enter net salary");
        int x=s.nextInt();
        System.out.println("enter bonus");
        int y=s.nextInt();
		int t=c.addition(x,y);
        System.out.println("total salary is"+t);
		
		
	}
}
