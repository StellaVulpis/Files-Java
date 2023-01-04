import java.util.ArrayList;
public class Main {
	public static void main(String[] args) 
	{
		int rank[]=new int[5];
		int length=rank.length;
		String name[]={"Marshal","Raymond","Punchy","Isabelle","Teddy"};
		int age[]={24,27,25,22,28};
		ArrayList<String> N=new ArrayList<String>();
		ArrayList<Integer> A=new ArrayList<Integer>();
		int count=0;
		while(true)
		{
			try
			{
				if(name[count].equals(null))
					break;
				for(int i=0;i<length;i++)
				{
					rank[i]=0;
					for(int t=0;t<length;t++)
					{
						if(age[i]<age[t])
							rank[i]++;
					} // end of for(t)
				} // end of for(i)
			}catch(IndexOutOfBoundsException e)
			{
			System.err.println("Due to index was out of bounds, Loop was ended.");
			break;
			}
			count++;
		}// end of while(true)
			count=0;
		while(true)
		{
			try
			{
			if(name[count].equals(null))
				break;
		for(int i=0;i<length;i++)
				{
					for(int t=0;t<length;t++)
					{
							if(rank[t]==i)
							{
							N.add(name[t]);
							A.add(age[t]);
							}
					} // end of for(t)
				} // end of for(i)
				count++;
		}catch(IndexOutOfBoundsException e)
		{
			System.err.println("Due to index was 			out of bounds, Loop was ended.");
			break;
		}
		}// end of while(true)
			for(int i=(length-1);i>=0;i--)
			{
				// ++ Ascending order
				// -- Descending order
				System.out.println(rank[i]);
				System.out.printf("Name: %s\nAge: %d\n\n", N.get(i),A.get(i));
			}
	} // end of main(String args[])
} // end of Main
