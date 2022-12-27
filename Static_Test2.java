package day17;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
// static 객체가 자원을 공유
//
// 여러개의 객체가 자원(필드)를 공유하려면 반드시
// 필드 앞에 static이 붙어야 한다.
// 어떤 객체를 클래스에서 공유하려면 객체앞에 static
// 다만 static을 써서 너무 많이 공유하게 되면 과부하가 걸릴 수 있음.
@SuppressWarnings("serial")
class korea extends GregorianCalendar
{
	static korea k = new korea();
	Calendar cal = Calendar.getInstance(); // 추상 클래스는 new를 사용할 수 없음.
	static int count=0;
	static int yyyy=k.get(Calendar.YEAR);
	static int mmmm=k.get(Calendar.MONTH)+1;
	static int dddd=k.get(Calendar.DAY_OF_MONTH);
	static final LocalDate date = LocalDate.now(); // final class, 역시 new를 사용할 수 없음.
	static int yy=date.getYear();
	static Month MM=date.getMonth();
	static int mm=date.getMonthValue();
	static int dd=date.getDayOfMonth();
	static DayOfWeek day=date.getDayOfWeek();
	public int out()
	{
		count++;
		return count;
	}	
	public int addone(int n)
	{
		n++;
		return n;
	}
}
public class Static_Test2 
{
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		korea kr = new korea();
		for(int i=0;i<5;i++)
			System.out.println(kr.out());
		System.out.println();
		korea kr2 = new korea(); // 객체를 부를때마다 자원이 초기화됨. >> static을 붙이면 여러개 객체가 자원을 공유할 수 있음.
								 // int count=0; >> 1 2 3 4 5 >> 다른 호출자 호출 >> 1 2 3 
								 // static int count=0; >> 1 2 3 4 5 >> 다른 호출자 호출 >> 6 7 8 
		for(int i=0;i<3;i++)
			System.out.println(kr2.out());
		System.out.println("연도: "+kr2.yyyy+" "+kr.yy);
		kr2.yyyy=kr2.addone(kr2.yyyy);
		System.out.println("연도: "+kr2.yyyy);
		System.out.println(kr.mm+""+"연도: "+kr.yyyy);
		System.out.println("날짜: "+kr.day+", "+kr.mm+"-"+kr.dd+", "+kr.yy);
		System.out.println("날짜: "+kr.day+", "+kr.MM+" "+kr.dd+", "+kr.yy);
		System.out.println("날짜: "+kr.mmmm+" "+kr.dddd+", "+kr.yyyy);
	}
}
@SuppressWarnings("serial")
class childCalendar extends Calendar
{

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}