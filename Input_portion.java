package day02;
public class Input_portion 
{
	public static void main(String[] args) 
	{
		// 두 수를 입력, 직접 대입방식, 몫과 나머지를 구하는 예제
		int a, b, portion, remainder;
		a=50;
		b=4;
		portion = a/b; // 몫을 구하는 과정
		remainder = a%b; // 나머지 구하는 과정
		System.out.printf("몫: %d\n나머지: %d\n", portion, remainder);
		// 문제: 사과 농장에서 수확한 사과가 2340개 있다. 한 박스에 50개씩 담으려고 할 때 나머지를 구하시오.
		int appleTotal = 2340;
		int box, remainApps;
		box = appleTotal / 50; 
		remainApps = appleTotal % box;
		System.out.println("총 사과: "+appleTotal);
		System.out.println("담은 상자: "+box);
		System.out.println("남은 사과 갯수: "+remainApps);
	}
}
