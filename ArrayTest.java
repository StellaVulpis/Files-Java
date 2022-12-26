package day16_test_feedback;

public class ArrayTest 
{
	public static void main(String args[])
	{
		int a[]=new int[5]; // 고정
		a[0]=128;
		a[1]=32;
		a[2]=11;
		a[3]=45;
		a[4]=22;
		int count=0;
		System.out.println("<빠른 for 배열>");
		for(int i:a)
		{
			System.out.println("인덱스: "+count+", 값: "+i);
			count++;
		}
		System.out.println("-----------------------------------------");
		System.out.println("<일반 for 배열>");
		for(int i=0;i<5;i++)
			System.out.println("인덱스: "+i+", 값: "+a[i]);
	}
}
