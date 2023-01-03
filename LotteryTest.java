package day22;
import java.util.Random;
import java.util.TreeSet;

import TOOL.IOStream;

public class LotteryTest 
{
	public static void main(String args[])
	{
		IOStream o = new IOStream();
		TreeSet<Integer> tr = new TreeSet<Integer>();
		int con[][];
		o.println("Howdy, How many do you need to purchase the lottery ticket?");
		o.print("I need: ");
		int n=o.scanf(0);
		con=new int[n][6];
		o.println("of 'em.");
		for(int i=0;i<n;i++)
		{
			for(int t=tr.size();t<6;t++)
			{
				Random r = new Random();
				int ticket=r.nextInt(99)+1;
				tr.add(ticket);
				con[i][t]=ticket;
			}
			if(i==0)
				o.println("Here's your ticket!");
			tr.forEach(go->o.print(go+" "));
			tr.clear();
			o.println();
		}
		/* forEach sorts all the values automatically in numerical order, so it can't be used with normal array.
			o.println("All the tickets are below."+o.ln+o.ln);
			for(int i=0;i<n;i++)
			{
				o.println("["+(i+1)+"]"+" th ticket");
				for(int t=0;t<6;t++)
				{
					o.print(con[i][t]+" ");
				}
				o.println();
			}
		*/
		/*
		tr.forEach(go-> // treeset, hashset 은 큰 값부터 작은 값, 작은 값부터 큰 값까지 순차적으로 출력한다. forEach는 작은 값부터 큰 값 까지 출력.
				{
		for(int i=0;i<n;i++)
		{
		if(i%6==0)
		{
			o.print(go+" ");
			o.println();
		}
		else
			o.print(go+" ");
		}
		});
		*/
		
	}
}
