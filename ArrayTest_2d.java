package day16_test_feedback;

public class ArrayTest_2d 
{
	public static void main(String args[])
	{
		ArrayTest_2d a2 = new ArrayTest_2d();
		int s[][] = new int[5][5];
		s[0][0] = 68;
		s[1][0] = 75;
		s[2][0] = 97;
		s[3][0] = 88;
		s[4][0] = 57;
		a2.getRank2(s);
	}
	private void getRank2(int s[][])
	{
		int r[] = new int[5];
		int rank[] = new int[5];
		int score[][] = new int[5][5];
		for(int i=0;i<s.length;i++)
		{	
			r[i]=0;
			for(int t=0;t<s.length;t++)
			{
				if(s[i][0] < s[t][0])
					r[i]+=1;
			}
		}
		for(int i=0;i<s.length;i++)
		{	
			for(int t=0;t<s.length;t++)
			{
				if(r[t]==i)
				{
					rank[i]=r[t];
					score[i][0]=s[t][0];
				}
			}
		}
		for(int i=0;i<s.length;i++)
			System.out.println("Score: "+score[i][0]+" Rank: "+(rank[i]+1));
	}
}

