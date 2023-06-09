import java.util.*;
import java.io.*;
class AboutFile
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter name of File ");
		String file=inp.nextLine();
		File f=new File(file);
		if (f.exists())
			System.out.println(file+"File found ");
		else
			System.out.println(file+"File not  found ");
		if (f.exists())
		{
			if(f.canRead())
				System.out.println(file+"can readable ");
			else
				System.out.println(file+"cannot readable ");
			if (f.canWrite())
				System.out.println(file+"can Writable ");
			else
				System.out.println(file+"cannot  Writable ");
			System.out.println("File type is :"+file.substring(file.indexOf('.')+1));
			System.out.println("File length "+file.length());
		}
	}

}
			
			
		
		
