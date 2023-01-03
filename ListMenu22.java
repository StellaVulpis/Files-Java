package day22;

import TOOL.IOStream;
public class ListMenu22 extends Thread
{
	public void run() 
	{
		// TODO Auto-generated method stub
		IOStream o = new IOStream();
		ListDAO22 l = new ListDAO22(); 
		String sel;
		while(true)
		{
			o.println("\t1. 입력\t|\t2. 불러오기\t|\t3. 출력\t|\t4. 종료");
			o.print("Enter: ");
			sel=o.scanf(null);
			switch(sel)
			{
			case "1": 
			case "입력":
				l.In();
				break;
			case "2": 
			case "불러오기":
				l.Read();
				break;
			case "3": 
			case "출력":
				l.Out();
				break;
			case "4": 
			case "종료":
				l.Exit();
				break;
			}
		}
	}
}
