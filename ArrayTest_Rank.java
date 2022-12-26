package day16_test_feedback;

public class ArrayTest_Rank 
{
	public static void main(String args[])
	{
		String name[] = {"A","C","D","B","E"};
		int a[] = {75,88,66,33,97};
		int r[] = new int[5];
		String ln = "\n----------------------------------------------------------------\n";
		rank(a, r, name); // 배열을 다른 메소드의 파라미터로 넘길땐 배열에 값을 전부 저장한 후 단순히 배열의 이름만 넣어주면 값이 전부 넘어간다. 
	}
	private static void rank(int a[], int r[], String n[])
	{
		int sort[] = new int[5];
		int rank[] = new int[5];
		String name[] = new String[5];
		for(int i=0;i<a.length;i++)
		{
			r[i] = 0;
			for(int t=0;t<a.length;t++)
			{
				if(a[i] < a[t]) // 점수가 현재 비교하는 점수보다 작으면 랭킹 배열의 값을 1에서 증가시켜서, 가장 작을수록 반복해서 증가하고, 제일 크면 증가하지 않아서 
					r[i]+=1;	// 점수 0~4 인덱스와 랭킹 0~4인덱스가 연동되어 랭킹이 저장된다. (점수 0~4, 랭킹 0~4 같은 인덱스에서 점수를 비교해서 랭킹 배열의 값을 증가시킴)
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int t=0;t<a.length;t++)
			{
				if(r[t] == i) // 점수에 따라 랭크를 저장하고, 해당 랭크의 값이 현재 돌고있는 1차 반복문과 같으면 0~4 작은 수>큰 수 순서로 새로운 배열에 값들을 저장한다.  
				{
					sort[i]=a[t]; // 1차 반복문의 0, 1, 2, 3, 4 마다 매번 5번씩 반복하면서 1차 반복문의 숫자와 같은 r[t]의 값을 rank[i]에 저장, 점수에 맞게 r의 석차 값이 저장되었으므로   
					rank[i]=r[t]; // 2차 반복문의 인덱스에 있는 랭크를 저장하면서 점수 배열도 같이 저장하면 점수가 큰 순서대로 나열되게 된다. 
					name[i]=n[t]; // 이름은 0~4번째 순서대로 점수와 인덱스가 같으므로, 이 방식으로 저장하면 이름또한 순서대로 연동되서 나오게 된다.
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println("이름: "+name[i]+" | 점수: "+sort[i]+" | 순위: "+(rank[i]+1));
	}
}
