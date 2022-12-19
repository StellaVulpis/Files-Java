package day11;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_Scanner 
{
	Scanner sc = new Scanner(System.in);
	Scanner ac = new Scanner(System.in);
	public String scanfAns(String text)
	{
	    System.out.print(text+": ");
	    return ac.nextLine();
	}
	public String scanfStr(String text)
	{
		System.out.print(text+": ");
		return sc.nextLine();
	}
	public int scanfInt(String text)
	{
		System.out.print(text+": ");
		return sc.nextInt();
	}
}