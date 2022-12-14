package day08;

public class Utility
{
	// Field
	String name, mthd0, mthd1, underLine;
	int age;
	// Constructor()
	Utility()
	{
		name=null;
		age=0;
		mthd0="out()";
		mthd1="out2()";
		underLine="----------------------------------------------";
	}
	// Method()
	public void out()
	{
		String name = "홍길동";
		int age = 38;
		this.name = name;
		this.age = age;
		System.out.println(underLine+"\n[클래스 이름: "+mthd0+"]\n");
		System.out.println("이름: "+this.name+"\n나이: "+this.age+"세");
		System.out.println("(This texts are from a method of outer class.)");
		System.out.println(underLine);
	}
	public void out2()
	{
		System.out.println("[클래스 이름: "+mthd1+"]\n");
		System.out.println("이름: "+name+"\n나이: "+age+"세");
		System.out.println("(This texts were inserted from main method to\n"
				+ "method of outer class.)");
		System.out.println(underLine);
	}
}
