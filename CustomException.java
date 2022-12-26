package day16_test_feedback;
import java.util.Scanner;
public class CustomException
{
	public static void main(String args[]) throws NotOdd
	{
		NotOdd no = new NotOdd();
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력: ");
		no.ODD(sc.nextInt());
	}
}
class NotOdd extends Exception
{
	void ODD(int a) throws NotOdd
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			if(a%2==1)
				throw new NotOdd();
			else
				System.out.println("짝수입니다.");
		}catch(NotOdd e)
		{
			System.err.println("It is not even num.");
			e.printStackTrace();
		}
	}
}
