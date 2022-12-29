package day19;

public class D19Main 
{
	// 1. DTO 부서명, 이름, 나이 생성자를 이용하여 자료 입력
	// 2. 메뉴 1. 입력 2. 출력
	// DAO에서 객체를 list(ArrayList)에 저장
	public static void main(String args[])
	{
		D19DAO d = new D19DAO(null,null,0);
		while(true)
		{
		System.out.print(d.ln+"<1-입력 | 2-출력 | 3-파일로드 | 4-종료>"+d.ln);
		String num=d.STR("번호를");
			switch(num)
			{
			case "1":
				d.In();
				break;
			case "2":
				d.Out();
				break;
			case "3":
				d.FileLoad();
				break;
			case "4":
				d.Exit();
				break;
			case "exit":
				d.Exit();
				break;
			case "종료":
				d.Exit();
				break;
			default:
				System.err.println("Try again.");
				break;
			}
		}
	}
}
