package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Static_Test 
{
	static String man="Male"; // 클래스 변수
	static String woman="Female";
	enum sb
	{
		man, woman // 열거형, 변수명을 하나로 정해놓는 방식(마음대로 사용하는 것을 방지); 변수명 정의
	}
	static String sun="Sunday";
	static String mon="Monday";
	static String tue="Tuesday";
	static String wed="Wednesday";
	static String thu="Thursday";
	static String fri="Friday";
	static String sat="Saturday";
	enum week
	{
		sun,mon,tue,wed,thu,fri,sat
	}
	public static void main(String args[])
	{
		//System.out.println(sb.man); // Must be called in static way(call the class name directly).
		//System.out.println(sb.woman);
		//System.out.println(Static_Test.man+" "+Static_Test.woman);
		Scanner sc = new Scanner(System.in);
		int dd=0;
		String str=null, ln="\n-------------------------------------------------------------------------\n";	
		while(true)
		{
			System.out.println("원하는 번호를 입력하세요");
			System.out.println("일 1 | 월 2 | 화 3 | 수 4 | 목 5 | 금 6 | 토 7 | 종료 9");
			System.out.print("입력: ");
			try
			{
				dd=sc.nextInt();
				switch(dd)
				{
					case 1:
						str=Static_Test.sun;
						break;
					case 2:
						str=Static_Test.mon;
						break;
					case 3:
						str=Static_Test.tue;
						break;
					case 4:
						str=Static_Test.wed;
						break;
					case 5:
						str=Static_Test.thu;
						break;
					case 6:
						str=Static_Test.fri;
						break;
					case 7:
						str=Static_Test.sat;
						break;
					case 9:
						System.err.print(ln+"종료되었습니다."+ln);
						sc.close();
						System.exit(0);
					default:
						System.err.println("숫자는 반드시 1~7 이내로 입력해주세요.");
				}
			}catch(InputMismatchException e)
			{
				System.err.print(ln+"예외: 숫자만 입력해주세요."+ln);
				e.printStackTrace();
				System.err.print(ln+"종료되었습니다."+ln);
				sc.close();
				System.exit(0);
			}catch(NullPointerException e)
			{
				System.err.print(ln+"예외: 값이 Null인 변수는 참조할 수 없습니다."+ln);
				e.printStackTrace();
				System.err.print(ln+"종료되었습니다."+ln);
				sc.close();
				System.exit(0);
			}
			finally
			{
					System.out.print(ln+"입력된 값("+dd+")은 "+str+"입니다."+ln);
			}
		} // end of while(true)
	}
}
