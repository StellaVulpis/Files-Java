package day21;
import TOOL.IOStream;

public class Thread02
{
	public static void main(String args[])
	{
		ThreadTest_3 t = new ThreadTest_3();
		Runtest r = new Runtest();
		Thread tt = new Thread(t);
		Thread tt2 = new Thread(r);
		tt.start();
		tt2.start();
	}
}
class ThreadTest_3 extends Thread
{
	IOStream i = new IOStream();
	public void run()
	{
		i.println("Printing my name using Thread class.");
	}
}
class Runtest implements Runnable
{
	IOStream i = new IOStream();
	@Override
	public void run() 
	{
		i.println("This is a thread made by user.");
	}
	
}