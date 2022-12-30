package TOOL;
import java.util.Scanner;
// when calling this method: import TOOL.*; 
// IOStream io = new IOStream();
public class IOStream implements io
{
	public String ln="\n------------------------------------------------------\n";
	@Override
	public String scLine(String text)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextLine();
	}
	@Override
	public int scInt(String text)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextInt();
	}
	@Override
	public void printf(String text)
	{
		System.out.printf("%s",text);
	}
	public void printf(int num)
	{
		System.out.printf("%d",num);
	}
	public void printf(double num)
	{
		System.out.printf("%f",num);
	}
	public void printf(Boolean bool)
	{
		System.out.printf("%b",bool); // %B is also acceptable, %B is for printing capital letter.
	}
	@Override
	public void println(String text) // Method overriding 
	{
		System.out.println(text);
	}
	public void println(int num) // Method overriding 
	{
		System.out.println(num);
	}
	public void println(double num) // Method overriding 
	{
		System.out.println(num);
	}
	public void println(Boolean bool) // Method overriding 
	{
		System.out.println(bool);
	}
	public void println() // Method overriding 
	{
		System.out.println();
	}
	@Override
	public void print(String text) 
	{
		System.out.print(text);
	}
	public void print(int num) 
	{
		System.out.print(num);
	}
	public void print(Double num) 
	{
		System.out.print(num);
	}
	public void print(Boolean text) 
	{
		System.out.print(text);
	}
	@Override
	public void err(String text)
	{
		System.err.print(text);
	}
	@Override
	public void errln(String text)
	{
		System.err.println(text);
	}
	@Override
	public int toInt(String num)
	{
		return Integer.parseInt(num);
	}
	@Override
	public void exit() 
	{
		System.exit(0);
	}
}
interface io
{
	public String scLine(String text);
	int toInt(String num);
	public int scInt(String text);
	public void printf(String text);
	public void println(String text);
	public void print(String text);
	public void err(String text);
	public void errln(String text);
	public void exit();
}
