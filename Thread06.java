package day21;
import TOOL.IOStream;
public class Thread06 
{
	public static void main(String args[])
	{
		T06_test01 t1 = new T06_test01();
		Thread tr = new Thread(t1);
		T06_test02 t2 = new T06_test02();
		tr.start();
		t2.start();
	}
}
class T06_test01 implements Runnable
{
	IOStream o = new IOStream();
	public void run()
	{
		o.println("I am a thread implemented from Runnable interface.");
	}
}
class T06_test02 extends Thread
{
	IOStream o = new IOStream();
	public void run()
	{
		o.println("I am a thread extended from Thread class.");
	}
}