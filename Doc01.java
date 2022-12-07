package day03;
import java.util.Scanner;
// Import classes here (java.util...etc)
public class Doc01
{
	// Write field variables here 
	public static void main(String args[])
	{
		// 이름과 나이 입력
		// 선언부.. 기억장소 확보
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		// 입력부 >> 확보된 기억장소에 입력
		name = "Conan O'Brien";
		age = 53;
		System.out.print("이름 직접 입력: ");
		name = sc.nextLine();
		System.out.print("나이 직접 입력: ");
		age = sc.nextInt();
		// 출력부
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		// System.out.printf("Name: %s \nAge: %d",name, age, "\n");
		// Always close Scanner when it's not used anymore.
		sc.close();
	}
}
// Write classes here
// Write constructor here