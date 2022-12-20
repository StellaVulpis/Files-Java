package day12;
//import java.util.Calendar;
import java.util.GregorianCalendar;
public abstract class AbstractClass // Only can be used in extended child class 
{
	String name;
	int age;
	// 일반 메소드
	/*
	public void out() 
	{
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	*/
	// 추상 메소드
	public abstract void out(); // Only can be defined in abstract classes.
}
/*
 class AA extends Calendar // Exception: Add unimplemented methods; add methods in Calender class and override because Calender is abstract class.
						   // (Override: Add same methods in Calender which is abstract class, and make functions in it.)
{
	
}
*/

final class ChildGregorian extends GregorianCalendar
{
	private static final long serialVersionUID = 1L;
	void func1()
	{
		ChildGregorian CG = new ChildGregorian();
		CG.add(0, FIELD_COUNT);
	}
}