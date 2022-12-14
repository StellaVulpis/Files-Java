package day08;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Score 
{
	// It may seem unnecessary for simple program to use OOP, but it helps the programmer 
	// a lot when it comes to coding and developing longer and much complicated programs.
	// 이름, 국어, 영어, 수학 >> 총점, 평균, 학점 구하는 클래스 생성
	String name, underLine;
	int sbjCount, creditforEach[] = {3, 1, 3}, credit;
	Boolean isPass;
	private int subjects[] = new int[3];
	private double tot, avrg;
	private String grade;
	Scanner sc = new Scanner(System.in);
	Scanner tc = new Scanner(System.in);
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	Score()
	{
		sbjCount=subjects.length;
		credit=0;
		underLine="-------------------------------------------------------------------";
	}
	void sClose() // Scanner Closer, can close multiple Scanners at once.
	{
		sc.close();
		tc.close();
	}
	void scanf()
	{
		int a=0, b=0, c=0;
		String name;
		System.out.print("이름을 입력하세요: ");
		name = tc.nextLine();
		System.out.print("국어 점수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		c = sc.nextInt();
		getInfo(a,b,c,name);
	}
	void getInfo(int kor, int eng, int math, String name)
	{
		this.subjects[0] = kor;
		this.subjects[1] = eng;
		this.subjects[2] = math;
		this.name = name;
	}
	void Calc()
	{
		for(int t=0;t<subjects.length;t++)
			tot+=subjects[t];
		avrg = tot/sbjCount;
		for(int i = 0;i<creditforEach.length;i++)
		{
			if(subjects[i] >= 60)
				credit+=creditforEach[i];
		}
		if(avrg >= 60)
			isPass = true;
		else
			isPass = false;
		if(avrg >= 90 && avrg <= 100)
			grade = "A";
		else if(avrg >= 80 && avrg < 90)
			grade = "B";
		else if(avrg >= 70 && avrg < 80)
			grade = "C";
		else if(avrg >= 60 && avrg < 70)
			grade = "D";
		else if(avrg < 60)
			grade = "F";
		else
			LOG.log(Level.WARNING, "You typed incorrect range of score, please try again.");
		
	}
	String print()
	{
		System.out.println(underLine);
		System.out.println("[입력 결과]\n"+underLine);
		System.out.println("이름: "+name);
		System.out.println("국어: "+subjects[0]+"점");
		System.out.println("수학: "+subjects[1]+"점");
		System.out.println("수학: "+subjects[2]+"점");
		System.out.println(underLine);
		System.out.printf("총점: %.0f점\n",tot);
		System.out.printf("평점: %.2f점\n",avrg);
		System.out.println("학점: "+grade);
		System.out.println(underLine);
		if(isPass == true)
		{
			
			System.out.println("이수 총 학점: "+credit+"점");
			System.out.println("학기 이수 완료, 학점 취득 가능");
			System.out.println(underLine);
			System.out.print("비고: ");
			return "합격";
		}
		else
		{
			System.out.println("비고: 학기 이수 실패, 재수강 필요");
			System.out.println(underLine);
			System.out.print("비고: ");
			return "불합격";
		}
	}
}
