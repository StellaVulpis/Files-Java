package day11;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DTO_SetInfo 
{
	int age;
	String name, sel, underLine;

	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	DTO_SetInfo()
	{
		age=0;
		underLine="------------------------------------------";
		sel=" ";
	}
	// 입력, 출력, 종료; 원하는 작업번호 입력>>실행
	public String scanf_Str(String text, Scanner sc)
	{
		System.out.print(text+"입력: ");
		return sc.nextLine();
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = Integer.parseInt(age);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String GetSelHandler()
	{
		return sel;
	}
	public void SetSelHandler(String sel)
	{
		this.sel = sel;
	}
	public void out()
	{
		System.out.println("\n\n"+underLine+"\n\n");
		System.out.println("당신의 이름은 ["+name+"] 입니다.");
		System.out.println("당신의 나이는 ["+age+"]세 입니다.");
		System.out.println("\n\n"+underLine+"\n\n");
	}
	public void queryNo()
	{
		System.out.println("System was terminated");
	}
	public void exitMsg()
	{
		LOG.log(Level.INFO, "Program was terminated.");
	}
	public void InputException()
	{
		LOG.log(Level.WARNING, "Try again.");
	}
	public void reInit()
	{
		sel="0";
		name=null;
		age=0;
	}
}