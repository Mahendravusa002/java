import java.io.*;
class  
{
	public static void main(String args[])throws IOException;
	{
		FileInputstream fil;
		LineNumberInputstream line;
		int i;
		try
		{
			fil=new FileInputstream(args[0]);
			line=new LineNumberInputstream(fil);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("not found");
			return;
		}
		do
		{
			i=line.read();
			if (i=='\n')
				{System.out.println();
				System.out.println(line.getLineNumber()+"");}
			else
				{System.out.println((char)i);}
		}while(i!=-1);
		fil.close();
		line.close();
	}
}

		
		
		
