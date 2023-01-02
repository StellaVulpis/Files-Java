package TOOL;
import java.util.Scanner;
public class IOStream implements io
{
	public String ln="\n------------------------------------------------------\n";
	@Override
	public String scanf(String text) // put "" to use.
	{
		Scanner sc = new Scanner(System.in);	
		text=sc.nextLine();
		return text;
	}
	public int scanf(int num) // put 0 to use.
	{
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		return num;
	}
	@Override
	public double scanf(double num) // put 0 to use.
	{
		Scanner sc = new Scanner(System.in);
		num=sc.nextDouble();
		return num;
	}
	@Override
	public String scLine() 
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	@Override
	public char scChar() 
	{
		Scanner sc = new Scanner(System.in);
		return sc.next().charAt(0);
	}
	@Override
	public int scInt() 
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	@Override
	public double scDouble() 
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	@Override
	public void printf(String text)
	{
		System.out.printf("%s",text);
	}
	@Override
	public void printf(int num)
	{
		System.out.printf("%d",num);
	}
	@Override
	public void printf(String text, int num) 
	{
		System.out.printf(text, num);
	}
	@Override
	public void printf(String text, int n1, int n2, int n3) 
	{
		System.out.printf(text, n1, n2, n3);
	}
	@Override
	public void printf(double num)
	{
		System.out.printf("%f",num);
	}
	@Override
	public void printf(Boolean bool)
	{
		System.out.printf("%b",bool); // %B is also acceptable, %B is for printing capital letter.
	}
	@Override
	public void println(String text) // Method overloading
	{
		System.out.println(text);
	}
	@Override
	public void println(int num) // Method overloading
	{
		System.out.println(num);
	}
	@Override
	public void println(double num) // Method overloading
	{
		System.out.println(num);
	}
	@Override
	public void println(Boolean bool) // Method overloading
	{
		System.out.println(bool);
	}
	@Override
	public void println() // Method overloading
	{
		System.out.println();
	}
	@Override
	public void print(String text) 
	{
		System.out.print(text);
	}
	@Override
	public void print(int num) 
	{
		System.out.print(num);
	}
	@Override
	public void print(double num) 
	{
		System.out.print(num);
	}
	@Override
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
	@Override
	public String format(String t, int n) 
	{
		return String.format("%"+n+
				"s", t);
	}	
	@Override
	public String formatReverse(String t, int n)
	{
		return String.format("%-"+n+"s", t);
	}
}
interface io
{
	public String scanf(String text);
	public int scanf(int num);
	public double scanf(double num);
	public String scLine();
	public char scChar();
	public int scInt();
	public double scDouble();
	public int toInt(String num);
	public void printf(String text);
	public void printf(String text, int num);
	public void printf(String text, int n1, int n2, int n3);
	public void printf(int num);
	public void printf(double num);
	public void printf(Boolean bool);
	public void println(String text);
	public void println(int num);
	public void println(double num);
	public void println(Boolean bool);
	public void println();
	public void print(String text);
	public void print(int num);
	public void print(double num);
	public void print(Boolean bool);
	public void err(String text);
	public void errln(String text);
	public void exit();
	public String format(String t, int n);
	public String formatReverse(String t, int n);
}
