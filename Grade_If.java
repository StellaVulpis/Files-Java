package day03;

public class Grade_If 
{
	public static void main(String args[])
	{
		int a = 12;
		int max = a;
		double scoreAverage =50.84;
		char grade;
		boolean isPass;
		System.out.println("가장 큰 값: "+max);
		// 평균을 입력받아 학점이 90 이상이면 A, 80이상이면 B
		// 70 이상 C 60 이상 D 59 이하면 F 로 출력
			if(scoreAverage > 90)
			{
				grade = 'A';
				isPass = true;
				System.out.println("학점: "+grade);
			}
			else if(scoreAverage > 80)
			{
				grade = 'B';
				isPass = true;
				System.out.println("학점: "+grade);
			}
			else if(scoreAverage > 70)
			{
				grade = 'C';
				isPass = true;
				System.out.println("학점: "+grade);
			}
			else if(scoreAverage > 60)
			{
				grade = 'D';
				isPass = true;
				System.out.println("학점: "+grade);
			}
			else
			{
				grade = 'F';
				isPass = false;
				System.out.println("학점: "+grade);
			}
			if(isPass == true)
			{	
				System.out.println("비고: 시험에 합격했습니다.");
			}
			else
			{
				System.out.println("비고: 시험에 과락했습니다. 추가 시험이 예상됩니다.");
			}

			
	}
}
