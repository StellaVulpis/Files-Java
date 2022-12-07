package day02;

public class Casting 
{
	public static void main(String args[])
	{
		// 형변환 정수->실수
		int a=71, b=63, c=78;
		double total = (double)(a+b+c);
		double avrg = total/3;
		double  d = 33.78872;
		int num1 = 66;
		int num2 = 0;
		int num3 = 48;
		char char1 = 'e';
		System.out.println((double)a);
		System.out.printf("%.3f\n", d);
		System.out.println("총점: "+ (int)total +"점");
		System.out.printf("평균 점수: %.2f점\n", avrg);
		System.out.println();
		// 형변환 정수->문자
		System.out.println("66 in ASCII: '"+(char)num1+"'");
		System.out.println("0 in ASCII: '"+(char)num2+"'");
		System.out.println("48 in ASCII: '"+(char)num3+"'");
		System.out.println("e in ASCII: '"+(int)char1+"'");
	}
}
