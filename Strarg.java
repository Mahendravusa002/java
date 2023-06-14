import java.util.Scanner;
import java.lang.String;
class Strarg
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String ar[]=new String[10];
		System.out.println("enter size to array");
		int n=s.nextInt();
		System.out.println("enter strings to array");
		for (int i=0;i<n;i++)
		{
                        ar[i]=s.nextLine();
                   
		}
                for (int i=0;i<n;i++)
		{ for (int j=i+1;j<n;j++)
                   {
                   if (ar[i].compareTo(ar[j])>0)
                   {
                     String temp=ar[i];
                     ar[i]=ar[j];
		     ar[j]=temp;}}
		}
                System.out.println("strings in ascending order ");
                for (int i=0;i<n;i++)
		{
                    System.out.println(ar[i]);
		}
	}
}