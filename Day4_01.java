package build02;

public class Day4_01
{
	public static void main(String[] args)
	{
		int CTcode = 1; 
		String CTstr;
		//1 서울 환영합니다 else 그 외 지역, 환영합니다
		if (CTcode == 1)
			CTstr = "서울, 환영합니다.";
		else
			CTstr = "그 외 지역, 환영합니다";
		System.out.println(CTstr);
		if(CTcode == 1)
			CTstr = ((CTcode == 1) ? 
					"서울, 환영합니다.":"그 외 지역, 환영합니다");
		System.out.println(CTstr);
	}
}
