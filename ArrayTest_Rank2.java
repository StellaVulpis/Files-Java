package day16_test_feedback;

public class ArrayTest_Rank2 
{
	public static void main(String args[])
	{
		ArrayTest_Rank2 ar = new ArrayTest_Rank2();
		String n[] = {"Jordan","Philip","Isabelle","Farnsworth","Leno"};
		int score[] = {75, 68, 97, 100, 87};
		int rank[] = new int[5];
		ar.getRank(n,score,rank);
		
	}
	private void getRank(String n[], int s[], int r[])
	{
		String name[] = new String[5]; 
		int score[] = new int[5]; 
		int rank[] = new int[5];
		// Getting ranks
		for(int i=0;i<n.length;i++)
		{
			r[i]=0;
			for(int t=0;t<n.length;t++)
			{
				if(s[i]<s[t])
					r[i]+=1;
			}
		}
		//----------------------------
		// [0]   [1]   [2]  [3]   [4]
		// 75    68    97   100    87
		// +3    +4    +1   +0     +2
		//----------------------------
		// Sorting values
		for(int i=0;i<n.length;i++)
		{
			for(int t=0;t<n.length;t++)
			{
				if(r[t]==i)
				{
					name[i]=n[t];
					score[i]=s[t];
					rank[i]=r[t];
				}
			}
		}
		//  i[0]         i[1]       i[2]      i[3]       i[4]
		//----------------------------------------------------------
		// r[t]==0      r[t]==1    r[t]==2    r[t]==3    r[t]==4
		// s[t]==100    s[t]==97   s[t]==87   s[t]==75   s[t]==68
		//----------------------------------------------------------
		// score[i]=s[t] / name[i]=n[t] / rank[i]=r[t]
		//----------------------------------------------------------
		// Printing out
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Name: "+name[i]+" | Score: "+score[i]+" | Rank: "+(rank[i]+1));
		}
	}
}

