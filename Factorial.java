package build02;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)throws Exception
	{
	Scanner scanf = new Scanner(System.in);
	int num = 0; //!팩토리얼 입력
	int result = 0;
	num = scanf.nextInt(); //입력받을 자료형 입력, num에 입력.
	System.out.printf("Factorial: %d <%d x", num, num);
	for(int i = 1; i < num; i++)
	{
		
		System.out.printf(" %d", num - i);
		if(i != (num - 1))
		System.out.printf(" x");
		result += num * (num - i);
	}
	System.out.printf(">\n");
	System.out.printf("Sum = %d\n", result);
	}
}
