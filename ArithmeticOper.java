import java.util.Scanner; 
class ArithmeticOper extends Calculation
{ 
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		ArithmeticOper c=new ArithmeticOper();
		System.out.println("enter x,y values");
		int x=s.nextInt();
        int y=s.nextInt();
        int re=c.addition(x,y);
        int z=x-y;
        int k=x*y;
        float d=x/y;
        System.out.println("addition is"+re);
		System.out.println("sbstraction is"+z);
		System.out.println("multiplication is"+k);
		System.out.println("division is"+d);
		
		
	}
	
}
  
