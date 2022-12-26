package day16_test_feedback;

public class ArrayTest3 
{
	public static void main(String args[])
	{
		int a[] = {45,88,66,33,99};
		ArrayTest3_AAA a3 = new ArrayTest3_AAA();
		ano(a); // 배열을 다른 메소드의 파라미터로 넘길땐 배열에 값을 전부 저장한 후 단순히 배열의 이름만 넣어주면 값이 전부 넘어간다. 
		System.out.println("-----------------------------");
		a3.Out(a);
	}
	private static void ano(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
