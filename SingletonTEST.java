package day19;

import java.util.Scanner;

public class SingletonTEST
{
	private static SingletonTEST instance = new SingletonTEST();
	private SingletonTEST()
	{
	}
	public static SingletonTEST getInstance()
	{
		return instance;
	}
	public static void IOStream(int n)
	{
		n=0;
		String text=null; int number=0; double fnum=0.0; 
		Scanner sc = new Scanner(System.in);
		switch(n)
		{
		case 1:
			text=sc.nextLine();
			System.out.println(text);
			break;
		case 2:
			number=sc.nextInt();
			System.out.println(number);
			break;
		case 3:
			fnum=sc.nextDouble();
			System.out.println(fnum);
		default:
			System.err.println("Wrong number input, try again.");
			return;
		}
	}
	public int INT()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		return sc.nextInt();
	}
	public String STR()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		return sc.nextLine();
	}
}
