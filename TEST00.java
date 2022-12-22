package day14;
public class TEST00 
{
	public static void main(String args[])
	{
		Sum2 s2 = new Sum2();
		Multiply m2 = new Multiply();
		s2.Out();
		m2.Out();
	}
}
abstract class Common
{
	int a,b;
	public abstract void Out();
}
class Sum2 extends Common
{
	int resSum;
	public void Add()
	{
		a=25;b=27;
		resSum=a+b;
	}
	@Override
	public void Out() 
	{
		Add();
		System.out.printf("%d+%d=%d\n",a,b,resSum);
	}
}
class Multiply extends Common
{
	int resMul;
	public void multiply()
	{
		a=22;b=48;
		resMul=a*b;
	}
	@Override
	public void Out() 
	{
		multiply();
		System.out.printf("%d+%d=%d\n",a,b,resMul);
	}
	
}
