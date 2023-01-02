package day21;

import TOOL.IOStream;
import java.util.Random;
public class Thread04
{ 
	// 랜덤 구구단 생성, 홀수단이라면 10초 대기 
	public static void main(String args[])
	{
		RandTimesTable rt = new RandTimesTable();
		rt.start();
	}
}
class RandTimesTable extends Thread
{
	IOStream o = new IOStream();
	int num;
	public void run()
	{
		int count=0; 
		while(true)
		{	
			Random r = new Random();
			num = r.nextInt(9)+1;
			if(count == 10)
				break;
			if(num==1)
				num=2;
			else if(num==10)
				num=9;
				if(num%2==1)
				{
					try
					{
						for(int i=num;i<=num;i++)
						{
							for(int t=1;t<=9;t++)
							{
								o.printf("%dx%d=%d\n", i,t,(i*t));
								sleep(1000);
								Thread.yield();
							}
						}
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				else
				{
					for(int i=num;i<=num;i++)
					{
						for(int t=1;t<=9;t++)
							o.printf("%d x %d = %d\n", i,t,(i*t));
					}
				}
			o.println();
			count++;
		}
	}
}
