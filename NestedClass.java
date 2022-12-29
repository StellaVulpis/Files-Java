package day19;
public class NestedClass 
{
	// 중첩 클래스
	// 한 클래스
	//	{
	// 		내부 클래스 {...}		
	//	}
	public static void main(String args[])
	{
		Outer ot = new Outer("Inner");
		Outer.Inner in = ot.new Inner(9999);
		Inner2 in2 = new Inner2(null);
		ot.pr();
		in.Print();
		in2.Print2();
	}
}
class Outer
{
	SingletonTEST sg = SingletonTEST.getInstance();
	String name;
	public Outer(String name)
	{
		super();
		this.name=name;
	}
	public void pr()
	{
		System.out.println("Outer: I am Outer() class.\n");
	}
	class Inner 
	{
		int age;
		public Inner(int age)
		{
			this.age=age;
		}
		public void Print()
		{
			System.out.println("Outer.Inner(): I am inner class of the Outer() class.\n");
			System.out.println("이름: "+name+" 나이: "+age);
		}
	}
}
class Inner2 extends Outer
{
	public Inner2(String name)
	{
		super(name);
	}
	public void Print2()
	{
		System.out.println("Inner2: I am inherited class of Outer() class.\n");
	}
}