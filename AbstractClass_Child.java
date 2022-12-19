package day11;
import java.util.Scanner;
public class AbstractClass_Child 
{
	public static void main(String args[])
	{
		AClass a = new AClass();
		a.out();
	}
}
class AClass extends AbstractClass_Parent
{
	Scanner sc = new Scanner(System.in);
	String name;
	@Override
	void out() 
	{
		setName(scanf("Your name",sc));
		System.out.println("Your name is "+name);
	}
	@Override
	String scanf(String text, Scanner sc)
	{
		System.out.print(": ");
		return sc.nextLine();
	}
	@Override
	String getName()
	{
		return name;
	}
	@Override
	void setName(String name)
	{
		this.name=name;
	}
}