package build02;
import java.util.Scanner;
public class 입력받기 
{
	public static void main(String[] args) 
	{
		Scanner scanf =new Scanner(System.in);
		String na;
		na = scanf.nextLine(); // 또는 .next()
		
		int input = 0;
		input = scanf.nextInt();
		char b;
		b = scanf.next().charAt(0);
		System.out.printf("%s\n%d\n%s", na, input, b);
		scanf.close();
	}
}
