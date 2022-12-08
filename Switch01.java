package day04;

public class Switch01 
{
	public static void main(String args[])
	{
		// 짝수 홀수 출력
		int num = 48, num2 = 875; 
		int isit = 0;
		int isMultipleof4 = 0;
		isit = num%2;
		switch (isit)
		{
			case 0:
				System.out.println("짝수, 나머지: "+isit);
			break;
			case 1:
				System.out.println("홀수, 나머지: "+isit);
			break;
		}
		System.out.printf("------------------------------------------------\n");
		// 어떤 수를 입력하여 4의 배수인지 체크, 나머지 값 출력.
		isMultipleof4 = num2%4;
		switch(isMultipleof4)
		{
			case 0:
				System.out.println("4의 배수, 나머지: "+isMultipleof4);	
				break;
			case 1:
				System.out.println("4의 배수 X, 나머지: 1");	
				break;
			case 2:
				System.out.println("4의 배수 X, 나머지: 2");	
				break;
			case 3:
				System.out.println("4의 배수 X, 나머지: 3");	
				break;
			default:
				break;
		}
	}
}
