package day02;

public class Doc00 
{
	public static void main(String args[])
	{
		// int a;
		// a=a+1;  >> Exception occured.
		// Reason is because you didn't initialize it, so it's value is 'NULL'. 
		// You can't use variables with null value  to variables. So you must initialize it.
		// 두 변수 값 서로 바꾸기
		int a, b, swap;
		a=30;
		b=60;
		System.out.println("a: "+a+" b: "+b);
		swap=b;
		b=a;
		a=swap;
		System.out.println("a: "+a+" b: "+b);
	}
}
