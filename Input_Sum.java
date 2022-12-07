package day02;
import java.time.Year;
import java.util.Scanner;
public class Input_Sum 
{	
	public static void main(String args[])
	{
		// 두 수 a,b를 입력받아 합을 구하는 프로그램을 작성하시오
		/*
		int a,b,sum; // 선언부
		// 입력부
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력: ");
		a=sc.nextInt();
		System.out.println("두번째 수를 입력: ");
		b=sc.nextInt();
		sum = a+b;
		System.out.println("총 합: "+ sum);
		*/
		//---------------------------------------------------------------------
		// 이름과 주민번호받고, 나이 출력
		Scanner sc = new Scanner(System.in);
		String name, birthDateA, birthDateB, ageStr;
		int yearNow = Year.now().getValue(); // 2022, Current year
		char a, b;
		int age = 0;
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("주민번호를 앞자리를 입력해주세요: ");
		birthDateA = sc.nextLine();
		// a = birthDateA.charAt(0);
		// b = birthDateA.charAt(1);
		// ageStr = ""+a+b;
		ageStr = birthDateA.substring(0,2); // Param 1: Start string
											// Param 2: Range to cut from the string, index begins with '1'.
		age=Integer.parseInt(ageStr);
		age=((age+1900)-yearNow)*(-1);
		// age = Integer.parseInt(birthDateA);
		System.out.print("주민번호를 뒷자리를 입력해주세요: ");
		birthDateB = sc.nextLine();
		System.out.println("이름: "+name);
		System.out.println("주민번호: "+birthDateA+"-"+birthDateB);
		System.out.println("현재나이: "+age);
	}
}
