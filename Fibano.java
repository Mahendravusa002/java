import java.util.Scanner;
class Fibano
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int f1=0,f2=1,res=0;
		System.out.println("enetr n value");
		int n= s.nextInt();
                System.out.println("fibanosis series are:"+f1+" "+f2);
		for(int i=0;i<n;i++)
		{
                        res=f1+f2;
                        System.out.println(res);
			f1=f2;
			f2=res;
                 }
         }
}
			 
	
