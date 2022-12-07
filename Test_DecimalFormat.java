package day03;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Test_DecimalFormat
{
	public static void main(String[] args) 
	{
		// 키보드로 이름, 국어, 영어, 수학을 입력받아
		// 총점과 평균을 구하는 프로그램을 작성
		// 평균은 소숫점 이하 2자리까지 구함
		String name = null;
		int kor = 0, eng = 0, math = 0, total = 0;
		double avrg;
		DecimalFormat dcmal = new DecimalFormat("##.00");
		Scanner sc = new Scanner(System.in);
		// 입력부
			System.out.print("이름을 입력: ");
			name = sc.nextLine();
			System.out.print("국어 점수 입력: ");
			kor = sc.nextInt();
			System.out.print("영어 점수 입력: ");
			eng = sc.nextInt();
			System.out.print("수학 점수 입력: ");
			math = sc.nextInt();
			if(kor < 0 || kor > 100)
			{
				System.out.println("Please type the score above 0, below 100.");
				sc.close();
				System.out.println("System terminated.");
				return;
			}
			else if(eng < 0 || eng > 100)
			{
				System.out.println("Please type the score above 0, below 100.");
				sc.close();
				System.out.println("System terminated.");
				return;
			}
			else if(math < 0 || math > 100)
			{
				System.out.println("Please type the score above 0, below 100.");
				sc.close();
				System.out.println("System terminated.");
				return;
			}
			else
			{
				total = kor+eng+math;
				avrg = (double)(kor+eng+math)/3;
				// 출력부
				System.out.println("------------------------------");
				System.out.println("이름: "+name);
				System.out.println("총점: "+total+"점");
				System.out.println("평균: "+dcmal.format(avrg)+"점");
				sc.close();
				System.out.println("System terminated.");
			}
	}
}
