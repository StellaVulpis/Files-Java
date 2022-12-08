package day04;

public class MultipleFor 
{

	public static void main(String[] args) 
	{
		int numA=0, numB=0, numC=0;
		// 다중 for >> for문이 여러개 있는 경우
		for(int a=0;a<5;a++)
		{	// a가 1번 돌 때 (총 5회)
			System.out.print(a+" ");
			numA+=a;
			
			for(int b=0;b<5;b++)
			{ // b는 5번 돈다. (총 25회)
				System.out.print(b+" ");
				numB+=b;
				System.out.println();
				for(int c=0;c<5;c++)
				{
					// c는 25번 돈다.
					numC+=c;
					System.out.print(c+" ");
					System.out.println();
				}
			}
			System.out.println();
			System.out.printf("%d %d %d", numA, numB, numC);
		}
	}
}
