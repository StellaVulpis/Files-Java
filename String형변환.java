package build02;
import java.util.Scanner;
public class String형변환
{
	public static void main(String[] args) 
	{
		Scanner scanf = new Scanner(System.in);
		String num1, num2;
		num1 = scanf.nextLine();
		num2 = scanf.nextLine();
		double result = (double)(Double.parseDouble(num1) / Double.parseDouble(num2));
		int num = (int) (Double.parseDouble(num2));
		if(result == 2.92)
			System.out.println("결과값 = " + result);
		else
			System.out.println("결과값 = 무한대");
		
		

	}
}
