package day17;

public class ArrayTest2 
{
	public static void main(String args[])
	{
		int a[][] = new int[3][3];
		int r=2,c=1;
		/*
		 * 4  9  2
		 * 3  5  7
		 * 8  1  6
		 * 
		 * */
		for(int i=1;i<=9;i++)
		{
			a[r][c]=i;
			System.out.println("r: "+r+" c: "+c);
			if(i%3==0)
			{
				r--;
			}
			else
			{
				r++;
				c++;
			}
			if(r>2)
				r=0;
			if(c>2)
				c=0;
		}
		for(int i=0;i<3;i++)
		{
			for(int t=0;t<3;t++)
			{
				System.out.print(a[i][t]+" ");
			}
			System.out.println();
		}
	}
}
