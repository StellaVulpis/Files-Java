package day14;

public class MainClassTest
{
	public static void main(String args[])
	{
		Sum s = new Sum();
		Mul ml = new Mul();
		s.out();
		ml.out();
	}
}
class Sum implements Mthd
{
	int sum;
	public void add()
	{
		sum=a+b;
	}
	@Override
	public void out()
	{
		add();
		System.out.printf("%d+%d=%d\n",a,b,sum);
	}
}
class Mul implements Mthd
{
	int mul;
	public void multiply()
	{
		mul=a*b;
	}
	@Override
	public void out()
	{
		multiply();
		System.out.printf("%dx%d=%d\n",a,b,mul);
	}	
}
interface Mthd
{
	final int a=22; // Can't change the value of final variables after this initialization.
	final int b=37;
	public void out();
}