package build02;

public class Array 
{
//배열의 인덱스 개수 == 반복문 한개
//이차원배열 == 중첩 2중 반복문
public static void main(String[] args)
{
		//문자열은 c와 달리 크기를 자동으로 설정하기에
		//이차원 배열을 사용할 이유가 없다.
		String str[] = {"STR", "Error", "sss"};
		int num[][] = new int[5][10]; 
		//2차원 배열 초기화 "new + 자료형[인덱스][크기]
		//이차원 배열에는 반복문을 거치지 않고 특정 인덱스에 값을 저장할 수 없다
		// num[2] = 4; (X) 오류
		// num[0][0] = 12; (O)
		// num[i+3][10] = 19 (O)
		
		//이차원 배열의 특정 인덱스에 값을 넣는 방법
		for(int t = 0; t < 2; t++)
		{
		   for(int s = 0; s < 10; s++)
	       {
		    //1차반복문은 2차원배열의 1번째 인덱스를 호출하기 위한 페이크
		    //2차원 배열의 인덱스를 호출하는건 2차반복문의 변수.
		    //C언어에서완 다르게, 직접 인덱스를 간섭하는 것이 아닌
		    //IF문을 사용해서 2차 반복문 변수를 호출해서 간섭한다.
			if(s == 2 && t == 0)
			{
			num[t][s] = 12; //특정 인덱스에 값 대입하는 방법
			System.out.printf("%d",num[t][s]);
			}
			else
			{
				num[t][s] = 3;
				System.out.printf("0");
			}
		   }
		}
}
}
