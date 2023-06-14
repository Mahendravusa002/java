import java.util.*;
class Dices
{
	public static void main(String args[])
	{
		int count=0;
		Random r= new Random();
		for(int i=1;i<=100;i++)
		{
			int dice1=r.nextInt(6)+1;
			int dice2=r.nextInt(6)+1;
			if(dice1==dice2)
			{
				count++;
			}
		}
		System.out.println("No:of matchings in Two DICES:"+count);
	}
}
