package day22;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import TOOL.IOStream;
public class ListDAO22 extends IOStream implements Mthds
{
	Boolean isRead;
	ArrayList<ListDTO22> list = new ArrayList<ListDTO22>();
	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		isRead=false; int count=0;
		//======================
		while(true)
		{
			try
			{
				String data=""; 
				if(count > 0)
				{
					println("Do you wish to continue?");
					println("YES | NO");
					print("Your answer: ");
					data=scanf(null);
				}
				if(data.contains("exit") || data.contains("종료") || data.contains("EXIT") || 
						data.contains("finish") || data.contains("끝내기") || data.contains("no") || data.contains("NO"))
				{
					errln("The program was terminated.");
					break;
				}
				print("Type your name: ");
				String name=scanf(null);
				int age;
				print("Let us know your age: ");
				age=scanf(0);
				print("Where do you live?\nType your address: ");
				String address=scanf(null); 
				print("What is your favorite food: ");
				String favFood=scanf(null);
				name=name.trim(); address=address.trim(); favFood=favFood.trim();
				list.add(new ListDTO22(name,address,favFood,age));
				Collections.sort(list);
			}catch(NumberFormatException e)
			{
				errln(e.getMessage());
				errln("Please enter only number");
				continue;
			}
			finally
			{
				isRead=true;
				count++;
			}
		}
	}
	@Override
	public void Read() 
	{
		// TODO Auto-generated method stub
		isRead=false;
		try
		{
			/*
			 * Marshal 27AnimaIsle Apple  
				Raymond 24AnimaIsle  Peach 
				Isabelle26NewCityIsleBanana
				Punchy  27AnimaIsle  Grape 
			 * */
			FileReader f = new FileReader("C:/Data/D22Test.txt");
			BufferedReader bf = new BufferedReader(f);
			while(true)
			{
				String txt=bf.readLine();
				if(txt==null)
				{
					bf.close();
					break;
				}
				String name=txt.substring(0,8);
				int age=Integer.parseInt(txt.substring(8,10));
				String address=txt.substring(10,21);
				String favFood=txt.substring(21,27);
				name=name.trim(); address=address.trim(); favFood=favFood.trim();
				list.add(new ListDTO22(name,address,favFood,age));
				Collections.sort(list);
			}
		}catch(IOException e)
		{
			errln(e.getMessage());
			errln("Files cannot be found.");
			exit();
		}
		//======================
		finally
		{
		isRead=true;
		println(ln+"File was successfully loaded."+ln);
		}
	}
	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		if(isRead==false)
			In();
		list.forEach(s->println(s.toString()));
	}
	@Override
	public void Exit() 
	{
		// TODO Auto-generated method stub
		errln("The program was terminated.");
		exit();
	}
	
}
interface Mthds
{
	public void In();
	public void Read();
	public void Out();
	public void Exit();
}