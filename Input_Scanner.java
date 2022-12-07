package day02;
import java.util.Scanner;
public class Input_Scanner 
{
	public static void main(String args[])
	{
		// 국어 영어 수학 => 총점,평균
		int Korean = 0;
		int English = 0;
		int Math = 0;
		double avrg = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		Korean = sc.nextInt();
		System.out.print("영어점수: ");
		English = sc.nextInt();
		System.out.print("수학점수: ");
		Math = sc.nextInt();
		avrg = (double)(Korean+English+Math)/3;
		total = Korean+English+Math;
		System.out.printf("-국어: %d점\n-영어: %d점\n-수학: %d점\n", Korean, English, Math);
		System.out.println("-총점: "+total+"점");
		System.out.printf("-평균: %.2f점\n", avrg);
		sc.close();
	}
}
