package day02;
import java.util.Scanner;
import java.util.ArrayList;
public class Input_Selection 
{	
	public static void main(String args[])
	{
	// 사람의 이름 키 몸무게 나이 학점 입력받아 출력
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	ArrayList<Integer> birthDate = new ArrayList<Integer>();
	String phoneNum = "";
	int sel = 0;
	String name = "홍길동";
	int height = 167;
	double weight = 52.25;
	int age = 30;
	char grade = 'A';
	System.out.println("예시 보기 1 : 직접 입력 2");
	sel = sc.nextInt();
	switch(sel)
	{
	case 1:
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
		System.out.println("나이: "+age);
		System.out.println("점수: "+grade);
		System.out.println("출생월일: 1994년 11월 27일");
		System.out.println("전화번호: 010-1212-3333");
		break;
	case 2:
		System.out.print("이름을 입력하세요: ");
		name = sc2.nextLine();
		System.out.println();
		System.out.print("키를 입력하세요: ");
		height = sc2.nextInt();
		System.out.println();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc2.nextDouble();
		System.out.println();
		System.out.print("나이를 입력하세요: ");
		age = sc2.nextInt();
		System.out.println();
		System.out.print("점수 등급(알파벳)을 입력하세요: ");
		// If you use wrong type of variable on Scanner, the line will be ignored.
		grade = sc2.next().charAt(0); // Cutting and converting a character in String(next()) type of Scanner, 
									  // and putting it in char type of variable. 
									  // Alternative >> String gradeStr = sc2.next(); 
								      // char grade = gradeStr.charAt(0);
		System.out.println();
		System.out.print("출생년도를 입력해주세요: ");
		birthDate.add(sc2.nextInt());
		System.out.print("출생월을 입력해주세요: ");
		birthDate.add(sc2.nextInt());
		System.out.print("출생일을 입력해주세요: ");
		birthDate.add(sc2.nextInt());
		System.out.print("휴대전화 번호를 입력해주세요: ");
		phoneNum = sc3.nextLine();
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("[입력결과]");
		System.out.println("이름: "+name);
		System.out.println("키: "+height+"cm");
		System.out.println("몸무게: "+weight+"kg");
		System.out.println("나이: "+age+"세");
		System.out.println("점수: "+grade);
		System.out.print("출생월일: ");
		for(int i = 0;i<3;i++)
		{
			switch(i)
			{
			case 0:
				System.out.print(birthDate.get(i)+"년 ");
				break;
			case 1:
				System.out.print(birthDate.get(i)+"월 ");
				break;
			case 2:
				System.out.print(birthDate.get(i)+"일 ");
				break;
			}
		}
		System.out.println();
		System.out.printf("전화번호: %c%c%c-", phoneNum.charAt(0), phoneNum.charAt(1), phoneNum.charAt(2));
		System.out.printf("%c%c%c%c-", phoneNum.charAt(3),phoneNum.charAt(4),phoneNum.charAt(5), phoneNum.charAt(6));
		System.out.printf("%c%c%c%c", phoneNum.charAt(7), phoneNum.charAt(8), phoneNum.charAt(9), phoneNum.charAt(10));
		break;
	}
	sc.close();
	sc2.close();
	sc3.close();
	}
}
