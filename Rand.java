package day19;
import java.util.Random;
import TOOL.util;
public class Rand 
{
	public static void main(String args[])
	{
		util io = new util();
		Random rd = new Random();
		int c1=0, c2=0;
		int n = io.scInt("주사위를 던질 횟수를 입력");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=rd.nextInt(n)+1;
			switch(a[i])
			{
				case 7:
					io.println("A arrived.\n");
					c1++;
				break;
				case 11: 
					io.println("B arrived.\n");
					c2++;
				break;
			}			
		}
		io.println("A 나온 횟수: "+c1);
		io.println("B 나온 횟수: "+c2);

	}
}
