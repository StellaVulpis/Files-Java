package day17;

public class SnailArrayTest 
{
	public static void main(String args[])
	{
		// r: row, 가로
		// c: column, 세로
		// p: 이차원 배열의 크기(숫자를 채워줄 크기)
		// k: 증감하는 숫자를 저장할 변수 
		/*
		 * 	   1  2  3  4  5 >>
		 * 
		 *     16 17 18	19 6 >>
		 *      
		 *     15 24 25 20 7 >>
		 *     
		 *     14 23 22	21 8 >>
		 *     
		 *	   13 12 11 10 9
		 * */
		int a[][] = new int [5][5];
		int r=0, c=-1, p=5, k=0, sw=1;
		while(true)
		{
			System.out.println("sw: "+sw);
			System.out.println("p: "+p);
			for(int i=0;i<p;i++)
			{
				c=c+sw;
				k++;
				a[r][c]=k;
			}
			if(p==1)
				break;
			else
				p--;
			for(int i=0;i<p;i++)
			{
				k++;
				r=r+sw;
				a[r][c]=k;
			}
			sw=sw*(-1); // negative number >> positive number
		}// end of while(true)
		for(int i=0;i<5;i++)
		{
			try
			{
				
				for(int t=0;t<5;t++)
					System.out.print(a[i][t]+"\t");
				Thread.sleep(1000);
				System.out.println("\n");
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
