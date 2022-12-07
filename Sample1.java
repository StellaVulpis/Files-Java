package day01;
// import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Sample1 
{
	public static void main(String[] args) 
	{
		System.out.print("Please type your value: ");
		Scanner sc = new Scanner(System.in);
		int a = 0;
		try
		{
			a = sc.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Your input was not in Interger format.");
			e.getStackTrace();
		}
		finally
		{
			System.out.println("My input: " + a);
		}
		byte Byte = 46;
		System.out.println("입력값 = " + Byte);
		int aaa = 222545451;
		System.out.println(aaa);
	}
}
