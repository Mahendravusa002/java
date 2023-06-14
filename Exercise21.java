import java.util.*;
class Exercise21 
{
	public static void main(String args[])
	{
		ArrayList<String>l=new ArrayList<String>();
		l.add("python");
		l.add("java");
		l.add("php");
		String m[]=new String[l.size()];
		l.toArray(m);
		for(String s:m)
		{
			System.out.println(s);
		}
	}
}
