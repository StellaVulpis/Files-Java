package day03;
import java.util.Scanner;
import java.text.DecimalFormat;
public class If_Practice 
{
	public static void main(String[] args)
	{
		// 이름, 국어, 영어, 수학을 '키보드'
		// 입력 바아서 총점, 평균, 학점을 구하는
		// 프로그램을 작성한다.
		// 평균은 소숫점 이하 1자리(%.1f), 
		// 학점은 평균이 90이상 A, 80점 이상 B, 70이상 C,
		// 60점 이상 D, 59 이하 F
		String name;
		int kor, eng, math, total;
		double avrg;
		char grade;
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("##.#");
		try
		{
			System.out.print("YOUR NAME: ");
			name = sc.nextLine();
			System.out.println();
			Thread.sleep(500);
			System.out.println("YOUR NAME IS "+name);
			Thread.sleep(1000);
			System.out.println();
			System.out.println("HOW INTERESTING.");
			System.out.println();
			Thread.sleep(1000);
			System.out.print("YOUR SCORE IN KOREAN: ");
			kor = sc.nextInt();
			Thread.sleep(1000);
			System.out.println();
			System.out.print("YOUR SCORE IN ENGLISH: ");
			eng = sc.nextInt();
			Thread.sleep(1000);
			System.out.println();
			System.out.print("YOUR SCORE IN MATH: ");
			math = sc.nextInt();
			System.out.println();
			System.out.println();
			System.out.println("[LOADING]");
			System.out.print("||");
			for(int i = 0; i< 20; i++)
			{
				System.out.print("=");
				Thread.sleep(300);
			}
			System.out.print("||\n");
			Thread.sleep(1000);
			System.out.println("[LOADING COMPLETED]");
			total=(eng+kor+math);
			avrg = (double)total / 3;
			if(avrg >= 90)
				grade = 'A';
			else if(avrg >= 80)
				grade = 'B';
			else if(avrg >= 70)
				grade = 'C';
			else if(avrg >= 60)
				grade = 'D';
			else
				grade = 'F';
			System.out.print("\nSO, YOUR NAME IS " + name);
			System.out.println();
			System.out.println();
			Thread.sleep(1500);
			System.out.print("AND YOUR TOTAL SCORE IS "
					+total);
			System.out.printf("\n\n\n");
			Thread.sleep(1500);
			System.out.print("YOUR AVERAGE SCORE IS "
			+dc.format(avrg));
			System.out.printf("\n\n\n");
			Thread.sleep(1500);
			System.out.print("FINALLY, YOUR GRADE IS");
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.println();
			System.out.println();
			for(int i = 0; i<3; i++)
			{
			System.out.print("(DRUM ROLL SOUNDS)");
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.println();
			}
			System.out.println();
			System.out.println();
			System.out.print("TADA! IT'S ["+grade+"].");
			System.out.printf("\n\n\n\n");
			for(int i = 0; i<2; i++)
			{
			System.out.print(".");
			Thread.sleep(800);
			System.out.print(".");
			Thread.sleep(800);
			System.out.print(".");
			Thread.sleep(800);
			}
			Thread.sleep(1500);
			System.out.print("OKAY, ");
			Thread.sleep(800);
			System.out.print("SEE YA THEN.");
		}catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
				
	}
}
