package build02;
import java.util.Scanner;


public class 과제01_구구단 
{
	public static void main(String[] args) 
			throws Exception 
	{
		//실행 함수/변수 영역
		Scanner scanf = new Scanner(System.in);
		//scanf.close();//scanner의 sc를 사용 후 닫아줘야 함.
		int num = 0; //단수 입력
		num = scanf.nextInt();
		//System.out.println(num);
		//출력서식 사용할때 => System.out.printf
		for(int i = 0; i < 8; i++)
		{
			if (num == 10)
				return;
			for(int t = 0; t < 10; t++)
			{
				if(t == 0)
					t += 1;
				System.out.printf("%d x %d = %d\n", num, t, num * t);
				
			}
			num++;
			System.out.println("\n");
		}
		scanf.close(); //sc 함수를 사용 후 닫을 때 사용하는 sc.close();
	}
}
