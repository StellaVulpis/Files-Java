package day21;

import TOOL.IOStream;

public class Thread03 
{
	public static void main(String args[])
	{
		IOStream o = new IOStream();
		TimesTable t; 
		String num;
		o.print("계산할 단을 입력: "); 
		num=o.scanf(null);
		t = new TimesTable(num);	
	}
}
class TimesTable extends Thread
{
	IOStream o = new IOStream();
	int num; int sel;
	public TimesTable(String num) 
	{
		super();
		if(num.equals("전체"))
			sel=0;
		else
		{
			sel=1;
			this.num=Integer.parseInt(num.substring(0,1));
		}
	}
	public void run()
	{
	if(sel==0)
	{
		for(int i=2;i<=9;i++)
		{
			num=i;
			for(int t=1;t<=9;t++)
				o.printf("%d x %d: %d\n",num,t,(num*t));
			o.println();
		}
	}
	else if(sel==1)
	{
			try
			{
				for(int i=1;i<=9;i++)
				{
					o.printf("%d x %d: %d\n", num, i, (num*i));	
					sleep(10000);
				}
				o.println();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
	System.exit(0);
	}
}
