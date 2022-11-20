package build02;

public class Try_catch 
{
	public static void main(String[] args) 
	{
		// Try Catch 예외처리 코드
		try 
		{ // 에러가 발생할 수 있는 코드 영역
			Thread.sleep(2000);
		}catch (InterruptedException e)
		{ // 에러시 실행 
			e.printStackTrace(); // 발생한 오류 출력
		}
	}
}
