package build02;
import java.util.Scanner;
public class II_week_02
{
	public static void main(String[] args) 
	{
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		int total = 0;
		double avg = 0;	
		char grade;
		Scanner sc = new Scanner (System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sci = sc.nextInt();
		total = calc(kor, eng, math, sci);
		avg = (double)total / 4;
		if (avg > 90)
			grade = 'A';
		else if (avg >= 80 && avg < 90)
			grade = 'B';
		else if (avg >= 70 && avg < 80)
			grade = 'C';
		else if (avg >= 60 && avg < 70)
			grade = 'D';
		else
			grade = 'F';
	System.out.printf("ÃÑÁ¡: %d\nÆò±ÕÁ¡¼ö: %.2f\nGrade: %c\n", total, avg, grade);
		
		
	}

	public static int calc(int a, int b, int c, int d)
	{
		int result = 0;
		result = (a + b + c + d);
		return result;               
	}

}  

