import java.lang.*;
import java.util.*;
class Counting
{
	public static void main(String args[])
	{
		int vowel_count=0,conson_count=0,num_count=0,spesym_count=0;
		Scanner o= new Scanner(System.in);
		System.out.println("Enter srtring");
		String s= o.nextLine();
		//char ar[]={'a','e','i','o','u','A','E','I','O','U'};
		for( int i=0;i<s.length();i++)
		{
			char str=s.charAt(i);
			if ((str >='a'&&str <='z')||(str >='A'&&str <='Z'))
			{
				if (str==)
				{
					vowel_count++;
			
				}
				else
				{
					conson_count++;
				}
			}
			else if (str >=0 &&str <=9)
			{
				num_count++;
			}
			else
			{
				spesym_count++;
			}
		}
		System.out.println(conson_count);//+conson_count+num_count+spesym_count);
		
	}
}
	
				
				
				
	
