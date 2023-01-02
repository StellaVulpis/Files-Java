package day21;
import TOOL.IOStream;
public class TimeTable
{
	public static void main(String args[]) 
	{
		IOStream o = new IOStream();
		Calc c;
		o.print("단 수를 입력: ");
		try
		{
			c=new Calc(o.scanf(null));
			c.start();
		}catch(NumberArrangeException e)
		{
			e.printStackTrace();
		}	
	}
}
class Calc  extends Thread 
{
	IOStream o = new IOStream();
	int num;
	public Calc(String num) throws NumberArrangeException
	{
		try
		{
			this.num = Integer.parseInt(num.substring(0,1));
			NumberArrangeException.forInputArrange(this.num);
		}catch(NumberFormatException e)
		{
			o.errln("The data you've entered was not a number, please try again.");
			e.printStackTrace();
			o.exit();
		}
	}
	public void run()
	{
		for(int i=1;i<=9;i++)
		{	
			try
			{
				o.printf("%d x %d = %d\n", num, i, (num*i));
				Thread.sleep(300);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}













