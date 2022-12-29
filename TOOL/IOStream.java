// import TOOL.*;
// IOStream io = new IOStream();
package TOOL;
import java.util.Scanner;
public class util implements io
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
		System.out.printf(text);
	}
	@Override
	public void println(String text)
	{
		System.out.println(text);
	}
	@Override
	public void print(String text)
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
