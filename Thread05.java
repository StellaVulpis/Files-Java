package day21;

import TOOL.IOStream;
public class Thread05 
{
    /*
	 *  1 증가 1,2,3,4,5  5보다 크면 안됨
	 *  1 감소 5, 4, 3, 2, 1  1보다 작으면 안됨
	 *  총 Thread로 3번 반복
	 */
	public static void main(String args[])
	{
		IOStream o = new IOStream();
		Share data = new Share(7);
		int count=0;
		while(true)
		{
			if(count==7)
				break;
			data.down();
			count++;
		}
}
}
class Share extends Thread
{
	IOStream o = new IOStream();
	int data; // 1 증가 / 감소
	public Share(int data) 
	{
		this.data = data;
	}
	// Increase
	public synchronized void up() // Methods using wait() must be synchronized. (IllegalMonitorStateException)
	{
				if(data > 5)
				{
					try
					{
						o.println("대기중");
						wait(); // It keeps wait untill the further notice.	
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				try
				{
					o.println("data++: "+data);
					sleep(500);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				data++;
				notifyAll();	
	}
	// Decrease
	public synchronized void down()
	{
			if(data < 0)
			{
				try
				{
					o.println("대기중");
					wait(); // It keeps wait untill the further notice.
					
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			try
			{
				o.println("data-- : "+data);
				sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			data--;
			notifyAll();	
	}
}

