package day17;
import java.util.Scanner;
public class CustomMagicSquare 
{
	public static void main(String args[])
		{
		
		// 마방진의 규칙: 마방진은 x축, y축의 인덱스들을 전부 합했을 때 같은 수가 나와야한다. (가로 합, 세로 합, 대각선 합)
		// 예: 3*3 마방진의 경우 3개의 열, 행, 대각선의 인덱스들을 합했을 때 전부 15가 나온다.
		// 1. 행과 열은 동일하게 수x수가 된다. (3: 3x3, 7: 7x7)
		// 2. 모든 행과 열은 0부터 시작해서 수-1 만큼 증가한다. (배열의 규칙과 같음)
		// 3. 첫번째에 행과 열의 변수를 이차원배열의 인덱스에 넣어서 1부터 수*수 길이만큼 증가하는 반복문의 i값을 
		// 집어넣는다.
		// 4. 수+1을 할 시 최대 크기에 도달하면 인덱스 변수를 0으로 초기화, 최소 크기에 도달했을 때 수-1을 하면
		// 수를 최대크기로 초기화.
		// (예: 5가 수일 시: 4에 도달해서 +1을 할 때 0으로, 0에 도달해서 -1을 하면 4로 초기화한다.)
		Scanner sc = new Scanner(System.in);
		int a[][];
		int n;
		int r,c; // row, column
		System.out.print("마방진의 길이를 입력하세요: ");
		n=sc.nextInt();
			if(n%2==0)
			{
				System.err.println("홀수만 입력해주세요.");
				System.err.println("종료되었습니다.");
				System.exit(0);
			}
			r=n/2; c=n-1; // row는 center, column은 수의 최대크기(5면 4, 7이면 6)
			a = new int[n][n];
			/*
			 *  [0 0] [0 1] [0 2] [0 3] [0 4]
			 *  [1 0] [1 1] [1 2] [1 3] [1 4]
			 *  [2 0] [2 1] [2 2] [2 3] [2 4]
			 *  [3 0] [3 1] [3 2] [3 3] [3 4]
			 *  [4 0] [4 1] [4 2] [4 3] [4 4]
			 * */
			for(int i=1;i<=(n*n);i++)
			{
				a[r][c]=i;
				if(i%n==0)
					r--;
				else
				{
					r++;
					c++;
				}
				if(r<0)
					r=(n-1);
				if(r>(n-1))
					r=0;
				if(c<0)
					c=(n-1);
				if(c>(n-1))
					c=0;
			}
			for(int i=0;i<n;i++)
			{
				for(int t=0;t<n;t++)
				{
					System.out.print(a[i][t]+" ");
				}
				System.out.println();
			}
		}
}

