package day21;
import TOOL.IOStream;
public class Thread01 
{
	public static void main(String args[])
	{
		//IOStream i = new IOStream();
		ThreadTest tt = new ThreadTest();
		Thread t=new Thread(tt);
		ThreadTest_2 t2 = new ThreadTest_2();
		t.start(); // Thread(ThreadTest implements Runnable) class
		t2.start(); // ThreadTest_2 extends Thread
	}
}
class ThreadTest implements Runnable
{
	IOStream i = new IOStream();
	@Override
	public void run() // run() method can be executed with start(), on the classes which are inherited(extends) from Thread class, 
							// or the Thread classes having a class which is inherited(implements) from Runnable interface.
	{
		i.println("Inherited from Runnable interface.");
	}	
}
class ThreadTest_2 extends Thread
{
	IOStream i = new IOStream();
	public void run()
	{
		i.println("Using Thread class.");
	}
}