package day14;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import day14.A_Interface.*;
	// 이름, 나이 거주지를 입력받아 출력하는 프로그램을 생성.
	// 클래스 상속, 인터페이스. 추상 클래스 중에서 임의로 사용해서 생성
	class A_MyMenu extends A_MyDTO implements A_Interface, RunInterf
	{
		A_MyDAO dao = new A_MyDAO();
		Scanner sc = new Scanner(System.in);
		public void Exit()
		{
			final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
			System.out.println(ln);
			LOG.log(Level.INFO,  "종료되었습니다.");
			System.exit(0);
		}
		@Override
		public void Run() 
		{
			int sel;
			for(;;)
			{
				System.out.println(ln+"1. 입력\n2. 파일 로드\n3. 출력\n4. 종료");
				sel=dao.scanInt("선택하세요");
					switch(sel)
					{
					case 1:
						dao.In();
						break;
					case 2:
						dao.Load();
						break;
					case 3:
						dao.Out();
						break;
					case 4:
						Exit();
						break;
				}
			}
		}
	}
	
	