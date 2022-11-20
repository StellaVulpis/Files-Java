package build02;
public class Firstweek_01 
{
	public static void main(String[] args)
	{
		System.out.printf("%d",test(4, 5));
		
		double v1 =2.5;
		float v2 = 1.8f;
		long v3 = 2L;
		String v4 = "3.9";
		char ch = 'a';
		char b;
		b = (char) ((int)ch + 1);
		// 저장할 변수 = (저장할 때 변환시킬 자료형) (변수);
		System.out.printf("%c\n", b);
		double n1 = 3.5, n2 = 2.7;
		int result =  (int)(v1 + v2) + (int)v3 + (int)Double.parseDouble(v4);
		System.out.printf("%d", result);
		//String을 정수로 형변환 시킬 땐 (int)Double.parseDouble(String 자료형); 형태로 사용한다.
		

		
	}
	public static int test(int a, int b)
	{ 	
		return a * b;
		//void가 아닌 '값이 있는 함수'는 반드시 return으로
		//괄호안의 변수를 return시켜줘야 한다.
	}
}
