package build02;
import java.util.Scanner;
public class Grade_Method 
{
	public static void main(String[] args) 
	{
		int Grade[] = new int[4];
		int total = 0;
		double avg = 0;	
		char grade;
		Scanner sc = new Scanner (System.in);
		
		for(int t = 0; t < 4; t++)
		{
		int LPcount = 0;
		Grade[t] = sc.nextInt();
		if (Grade[t] < 0 || Grade[t] > 100)
		{
			System.out.printf("다시 입력해주세요. LPcount = %d", LPcount);
			t = LPcount;
		}	
		LPcount++;
		}
		total = calc(Grade[0], Grade[1], Grade[2], Grade[3]);
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
	System.out.printf("총점: %d\n평균점수: %.2f\nGrade: %c\n", total, avg, grade);
	}

	public static int calc(int a, int b, int c, int d)
	{
		int result = 0;
		result = (a + b + c + d);
		return result;               
	}

}  

