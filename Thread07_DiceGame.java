package day21;
import java.util.Random;
import TOOL.IOStream;
public class Thread07_DiceGame 
{
	public static void main(String args[])
	{
		diceGame d = new diceGame();
		d.start();
	}
}
class diceGame extends Thread
{
	public void run()
	{
		IOStream o = new IOStream();
		Random r = new Random();
		int n1, n2, n1Win=0, n2Win=0; // 철수 N1, 영희 N2
		int s1=0, s2=0; String result;
		int count=1;
		while(true)
		{
			try
			{
				o.println("[턴: "+count+"]");
				o.print(o.ln+"철수가 주사위를 던졌습니다."+o.ln);
				n1=r.nextInt(5)+1;
				s1+=n1;
				sleep(1000);
				o.print(o.ln+n1+"(이)가 나왔습니다."+o.ln);
				sleep(1000);
				o.print(o.ln+"영희가 주사위를 던졌습니다."+o.ln);
				sleep(1000);
				n2=r.nextInt(6)+1;
				s2+=n2;
				o.print(o.ln+n2+"(이)가 나왔습니다."+o.ln);
				sleep(1000);
				o.print(o.ln+"철수: "+n1+"\t|\t영희: "+n2+o.ln+"\n");
				sleep(2000);
					if(n1>n2)
						n1Win++;
					else
						n2Win++;
					if(count == 5)
					{
							result=(n1Win>n2Win) ? "철수가 이겼습니다." : "영희가 이겼습니다.";
							if(n1Win > n2Win)
							{
								o.print(o.ln+"["+n1Win+" vs "+n2Win+"] 차이로 ");
								o.println(result);
								o.print("[철수 총 점수: "+s1+" | 영희 총 점수: "+s2+"]"+o.ln);
								break;
							}
							else if(n1Win < n2Win)
							{
								o.print("["+n1Win+" vs "+n2Win+"] 차이로 ");
								o.println(result);
								o.print("[철수 총 점수: "+s1+" | 영희 총 점수: "+s2+"]"+o.ln);
								break;
							}
							else
							{
								o.print("["+n1Win+" vs "+n2Win+"] 점수가 나왔으므로 ");
								o.print("철수와 영희가 무승부로 비겼습니다.");
								o.print("[철수 총 점수: "+s1+" | 영희 총 점수: "+s2+"]"+o.ln);
								break;
							}
					}
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			finally
			{
				count++;
			}
		}
	}
}