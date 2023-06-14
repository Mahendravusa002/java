import java.io.*;
//import java.io.BufferReader;
import java.util.Scanner;
import java.lang.Exception;
public class Split
{
	public static void main(String args[])
	{
		try
		{
			String inp="Exercise21.java";
			double no1=5.0;
			File f= new File(inp);
			Scanner s= new Scanner(f);
			int c=0;
			while(s.hasNextLine())
			{
				s.nextLine();
				c++;
			}
			System.out.println("Lines in the file"+c);
			double temp=(c/no1);
			int temp1=(int)temp;
			int nof=0;
			if (temp1==temp)
				nof=temp1;
			else
				nof=temp1+1;
			System.out.println("No:of files generated"+nof);
			BufferedReader br= new BufferedReader(new FileReader(inp));
			String strLine;
			for(int j=1;j<=nof;j++)
			{
				FileWriter fw= new FileWriter("File"+j+".txt");
				for(int i=1;i<=no1;i++)
				{
					strLine=br.readLine();
					if( strLine!=null)
					{
						strLine=strLine+"\r\n";
						fw.write(strLine);
					}
				}
				fw.close();
				br.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e.getMessage());
		}
		
	}
}
			
			
