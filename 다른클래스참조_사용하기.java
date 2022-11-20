package build02;

import java.util.ArrayList;
public class 다른클래스참조_사용하기 
{
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();// () 생성자
		calc.num1 =32;
		calc.num2 =20;
		calc.addRes = calc.num1 + calc.num2;
		System.out.println(calc.addRes);
		// 객체 ==> 행위의 대상이 되는 object
		// 클래스 안의 생성된 객체 ==> 인스턴스
		// new 명령어 뒤에 오는 () 중괄호 블록 
		ArrayList<Integer> arr = new ArrayList();
		for(int i = 0; i < 10; i++)
		{
			if(i == 3)
			arr.add(i, 44);
			else
			arr.add(i, 0);
			System.out.println(arr);
		
		}
	}
		
}
