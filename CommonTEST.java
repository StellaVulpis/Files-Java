package day14;

public class CommonTEST 
{
	public static void main(String args[])
	{
		Sum3 s = new Sum3(22,37);
		Mul3 m3 = new Mul3(17,55);
		s.OUT();
		m3.OUT();
	}
}
class CM
{
	int a,b;
	public CM(int a, int b) 
	{
		super(); 
		this.a = a;
		this.b = b;
	}
}
interface Do
{
	public void OUT();
}
class Sum3 extends CM implements Do
{
	
	public Sum3(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void OUT() 
	{
		System.out.printf("%d+%d=%d\n", a,b,(a+b));
	}
	
}
class Mul3 extends CM implements Do
{
	public Mul3(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void OUT()
	{
		System.out.printf("%dx%d=%d\n", a,b,(a*b));
	}
	
}