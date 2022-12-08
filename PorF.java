package day04;

public class PorF {
	public static void main(String[] args) 
	{
		// 성적 점수를 입력받아 90이상이면 합격, 아니면 불합격
		int score = 97;
		boolean isPass;
		char grade = ' ';
		if(score >= 90)
			isPass = true;
		else
			isPass = false;
		if(isPass == true)
			System.out.println("합격, 성적: "+score);
		else
			System.out.println("불합격, 성적: "+score);
		// 성적 점수를 입력받아 학점구하기 90이상이면 A
		// 80 B, 70 C, 60 D 59 이하 F
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else if(score < 59)
			grade = 'F';
		System.out.println(grade);
			
	}
}
