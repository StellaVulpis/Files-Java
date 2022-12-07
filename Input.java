package day02;
import java.util.ArrayList;
import java.util.Scanner;
public class Input 
{
	public static void main(String args[])
	{	
		// 이름을 입력해서 출력
		String name = "홍길동";
		int age = 27;
		ArrayList<Integer> BirthDate = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		double score = 77.8;
		char scoreGrade = 'C';
		boolean isDead = false;
		int Whatis_a_inASCII = (int)'A';
		System.out.println("이름:"+" "+name);
		System.out.println("나이: "+age);
		System.out.println("중간고사 평점: "+score);
		System.out.println("사망여부: "+isDead);
		System.out.println("학기 성적: "+scoreGrade);
		System.out.println("A in ASCII: "+Whatis_a_inASCII);
		/*
		BirthDate.add(1997);
		BirthDate.add(7);
		BirthDate.add(25);
		*/
		System.out.print("출생년도를 입력해주세요: ");
		BirthDate.add(sc.nextInt());
		System.out.print("출생월을 입력해주세요: ");
		BirthDate.add(sc.nextInt());
		System.out.print("출생일을 입력해주세요: ");
		BirthDate.add(sc.nextInt());
		for(int i =0; i<3;i++)
		{
			switch(i)
			{
			case 0:
				System.out.print(BirthDate.get(i));
				System.out.printf("년 ");
			break;
			case 1:
				System.out.print(BirthDate.get(i));
				System.out.printf("월 ");
				break;
			case 2:
				System.out.print(BirthDate.get(i));
				System.out.printf("일 ");
				break;
			}
		}
		System.out.println("출생");
		System.out.println("(Texts were imported from indexes of ArrayList.)");
	}
}
