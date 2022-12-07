package day01;
import java.util.Scanner;
public class Sum 
{
	public static void main(String args[])
	{
		int sel = 0;
		// 국어 수학 영어의 총점을 구하시오.
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum, avrg = 0;
		System.out.print("국어의 점수를 입력해주세요: ");
		a = sc.nextInt();
		System.out.println();
		System.out.print("수학의 점수를 입력해주세요: ");
		b = sc.nextInt();
		System.out.println();
		System.out.print("영어의 점수를 입력해주세요: ");
		c = sc.nextInt();
		avrg = (a+b+c)/3;
		sum = (a+b+c);
		System.out.println("----------------------------------------------");
		switch(sel)
		{
		case 0: 
			System.out.printf("평균 점수는 %d 입니다.\n", avrg);
			System.out.printf("총점은 %d 입니다.\n", sum);
			System.out.printf("System.out.printf\n");
			break;
		case 1:
			System.out.println("평균 점수는 " + avrg +"점 입니다");
			System.out.println("총점은 " + sum +"점 입니다");
			System.out.println("System.out.println");
			break;
		}
		sc.close();
		
	}
}
