package day14;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class ExceptionTest implements A_Interface
{
	String text;
	int year, month, day;
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String args[])
	{
		ExceptionTest ex = new ExceptionTest();
		//ex.ArithmeticExceptionTEST();
		//ex.FileNotFoundExceptionTEST();
		ex.TwoExceptionTEST();
	}
	public void ArithmeticExceptionTEST()
	{
		int a=0;
		try
		{
			a=5/0;
		}catch(ArithmeticException e)
		{
			LOG.log(Level.WARNING, "You can not devide number with 0.\n\n");
			System.out.println("[Exception Message]");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("A: "+a);
			LOG.log(Level.INFO, "System was terminated.");
		}
	}
	public void FileNotFoundExceptionTEST()
	{
		int ExOccur=0;
		try
		{
			FileReader file = new FileReader("C:/Data/Memo.txt");
			BufferedReader BR = new BufferedReader(file);
			while(true)
			{
				String txt = BR.readLine(); // Must drop it here in while loop, use field variable to save data.
				if(txt == null)
				{
					BR.close();
					break;
				}
				// Hello World! :)
				// Today is 2022-12-22.
				setTxt(txt.substring(0,15));
				
			}
		}catch(IOException e)
		{
			LOG.log(Level.WARNING, "There is no such file.\n\n");
			System.out.println("<Message>");
			e.printStackTrace();
			ExOccur=1;
		}
		finally
		{
			if(ExOccur==1)
			{
				System.out.println(ln);
				LOG.log(Level.INFO, "System was terminated.");
				System.out.println(ln);
				System.exit(0);
			}
		System.out.println(text);
		}
	}
	public void TwoExceptionTEST() // You can actually use multiple exception in one try/catch statement, 
									// but must write code that there is possibility for an exception to occur.
	{
		int a = 0,b = 0; double dev=0;
			try
			{
				FileReader file = new FileReader("C:/Data/11111.txt");
				// FileReader file = new FileReader("C:/Data/111117z.txt");
				BufferedReader BR = new BufferedReader(file);
				while(true)
				{
					/*
					 * 	1234  
						3200  
						1211  
						0009  
						441234
					 * */
					String str=BR.readLine();
					if(str==null)
					{
						BR.close();
						break;
					}
					//BR=null;
					a=Integer.parseInt(str.substring(0,2));
					b=Integer.parseInt(str.substring(2,4));
					dev=a/b;
				}
			
			}catch(FileNotFoundException f)
			{
				System.out.print(ln);
				System.out.println("\nThe file you look for does not exist.");
				System.out.print(ln);
				f.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}catch(ArithmeticException c)
			{
				LOG.log(Level.WARNING,"Line devided with 0 is exception."+ln);
				c.printStackTrace();
				System.exit(0);
			}catch(NullPointerException d)
			{
				System.out.print(ln);
				System.out.println("\nYou can not look up a data that the value is null.");
				System.out.print(ln);
				d.printStackTrace();
			}catch(NumberFormatException n)
			{
				System.out.print(ln);
				System.out.println("\nThe format of number is incorrect.");
				System.out.print(ln);
				n.printStackTrace();
			}
			finally
			{
				System.out.print(ln);
				System.out.println("[Result]\n");
				System.out.println("A: "+a+"\nB: "+b);
				System.out.print(ln);
			}
	}
	public String getTxt() {
		return text;
	}
	public void setTxt(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
