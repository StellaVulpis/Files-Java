package day26;
public class StreamTest 
{
	// 반드시 싱글톤 형식을 유지
	// 파일처리 >> 동아리 코드(f:축구 / b:야구 / g: 게임)
	// 평균 구할때 ChoiceFormat 이용
	public static void main(String args[])
	{
		StreamDAO s = StreamDAO.getInstance();
		s.run();
	}
}

