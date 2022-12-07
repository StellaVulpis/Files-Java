package day02;

public class charAt 
{
	public static void main(String args[])
	{
		String a1 = "ABCDEF";
		// String은 자료형이 아닌 클래스이기 때문에 String으로 생성한 변수는 Object(객체)가 된다. 그래서 불러올 수 있는 것.
		char A = a1.charAt(0); // --> 'A' || ABCDF라는 문자열에서 A만 잘라와서 char 타입으로 변환시킨 것.
		char C = a1.charAt(2);
		char F = a1.charAt(5);
		System.out.println("학점: "+A);
		System.out.println(a1+"에서 잘라낸 문자(char): "+A);
		System.out.println(a1+"에서 잘라낸 문자(char): "+C);
		System.out.println(a1+"에서 잘라낸 문자(char): "+F);
	}
}
