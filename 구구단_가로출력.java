package build02;
import java.util.Scanner;
public class 구구단_가로출력
{
	public static void main(String[] args) 
	{
	 //과제 #1 수평 2-9단 출력
	 // 2 x 1 ==> 9 x 1 부터 가로로 출력(단수가 x, 가로가 된다.)
	 // 단수를 1씩 증가, 9단까지 옆으로 증가하고나서 \n으로 아래로 내림
	 // 곱하는 수를 한칸 내릴때마다 증가시킴
		for(int y = 1; y < 10; y++)
		{
			for(int x = 2; x < 10; x++)	
				System.out.printf("%2d x %d = %2d  ", x, y, x * y);
			System.out.printf("\n");
		}
		
		
		
	}
}  

