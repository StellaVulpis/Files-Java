package day17;

public class ArrayTest 
{
	public static void main(String args[])
	{
		/* 
		 * 1  6  11 16 21  
		 * 2  7  12 17 22
		 * 3  8  13 18 23
		 * 4  9  14 19 24
		 * 5  10 15 20 25
		 * */
		int a[][] = new int[5][5];
		int n=0;
		for(int i=0;i<5;i++)
		{
			if(i%2==1)
			{
				for(int t=4;t>=0;t--)
				{
					a[i][t]=t+1;
					System.out.print(a[i][t]+" ");
				}
			}
			else
			{
				for(int t=0;t<5;t++)
				{
					a[i][t]=t+1;
					System.out.print(a[i][t]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		for(int i=0;i<5;i++)
		{
				for(int t=0;t<5;t++)
				{
					n++;
					a[t][i]=n; 
					/* 
					 * n: 12345 678910 1112131415 1617181920 2122232425
					*/
				}
				System.out.println();
		}
		// 출력
		for(int i=0;i<5;i++)
		{
				for(int t=0;t<5;t++)
				{
					System.out.print(a[i][t]+" ");
				}
				System.out.println();
		}
	}
}
