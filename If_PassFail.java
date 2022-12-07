package day03;

public class If_PassFail
{
	public static void main(String args[])
	{
		// 학생 학년 및 점수 입력받아 
		// 1~3학년이면 60점 이상 합격
		// 4학년은 70점 이상 합격
		int score = 59, grade = 3;
		String P = "Pass";
		String F = "Fail";
		if(score >= 60 && grade < 4)
			System.out.println(P);
		else if(score >= 70 && grade >= 4)
			System.out.println(P);
		else if(score >= 60 && score < 70 && grade >= 4)
			System.out.println(F);
		else if(score < 60)
			System.out.println(F);
		else if(score > 100 || score < 0)
			System.out.println("Error, check your score.");
	}
}
