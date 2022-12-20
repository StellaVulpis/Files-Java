package day12;
import java.util.Scanner;
public class Myinfo_Input 
{
	Scanner sc = new Scanner(System.in);
	public String scanfStr(String text)
	{
		System.out.print(text+": ");
		return sc.next();
	}
	public String scanfAns(String text)
	{
		System.out.print(text+": ");
		return sc.next();
	}
	public int scanfInt(String text)
	{
		System.out.print(text+": ");
		return sc.nextInt();
	}
	public int sel()
	{
		return sc.nextInt();
	}
}
