package day17;

public class MagicSquareTest 
{
	public static void main(String args[])
	{
		// 마방진의 규칙: 마방진은 x축, y축의 인덱스들을 전부 합했을 때 같은 수가 나와야한다. (가로 합, 세로 합, 대각선 합)
		// 예: 3*3 마방진의 경우 3개의 열, 행, 대각선의 인덱스들을 합했을 때 전부 15가 나온다.
		// 홀수 마방진의 경우 가로, 세로, 
		int a[][] = new int [5][5];
		int r=0,c=2;
		/*
		 * 17  24  1   8   15   [0 0] [0 1] [0 2] [0 3] [0 4]
		 * 23  5   7   14  16   [1 0] [1 1] [1 2] [1 3] [1 4]
		 * 4   6   13  20  22   [2 0] [2 1] [2 2] [2 3] [2 4]
		 * 10  12  19  21   3   [3 0] [3 1] [3 2] [3 3] [3 4]
		 * 11  18  25   2   9   [4 0] [4 1] [4 2] [4 3] [4 4]
		 * */
		for(int i=1;i<=25;i++)
		{
			a[r][c]=i;
			if(i%5==0)
				r++;
			else
			{
				r--;
				c++;
			}
			if(r<0)
				r=4;
			if(r>4)
				r=0;
			if(c<0)
				c=4;
			if(c>4)
				c=0;
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int t=0;t<5;t++)
			{
				System.out.print(a[i][t]+"\t");
			}
			System.out.println("\n");
		}
	}
}
