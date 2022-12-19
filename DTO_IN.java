package day11;
import java.util.logging.Level;
import java.util.Scanner;
public class DTO_IN 
{
	DTO_SetInfo set = new DTO_SetInfo();
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		int count=0;
		while(true)
		{
			if(count>0)
			{
				System.out.println("계속할까요?");
				set.SetSelHandler(set.scanf_Str("(YES / NO) 중 하나를 ",sc));
			}
			if(set.sel.equals("NO") || set.sel.equals("no") || set.sel.equals("No")
					|| set.sel.equals("아니오") || set.sel.equals("아니요") || set.sel.equals("n") || set.sel.equals("N"))
			{
				set.exitMsg();
				return;
			}
			else
			{
				if(count>0)
					System.out.println("\n"+set.underLine+"\n");
				System.out.println("원하는 작업번호를 입력하세요: (1) 이름/나이 입력 | (2) 결과 출력| (EXIT)");
				System.out.println("(Type 'EXIT' to terminate...)\n");
				set.SetSelHandler(set.scanf_Str("번호를 ",sc));
				for(;;)
				{
					if(set.sel.equals("EXIT")||set.sel.equals("exit")||set.sel.equals("Exit"))
					{
						set.exitMsg();
						return;
					}
					else
					{
						// Type codes here...
						if(set.sel.equals("1"))
						{
							set.setName(set.scanf_Str("당신의 이름을 ",sc));
							set.setAge(set.scanf_Str("당신의 나이를 ",sc));
							set.out();
						}
						else if(set.sel.equals("2"))
						{
							if(set.name == null || set.age == 0)
							{
								DTO_SetInfo.LOG.log(Level.WARNING, "입력된 값이 없어 출력할 수 없습니다.");
								break;
							}
							else
							{
								set.out();
							}
						}
						else if(!set.sel.equals("1")&&!set.sel.equals("2")&&!set.sel.equals("0"))
							set.InputException();
					set.reInit();		
				}
					break;
			}// end of for(;;)
			}	
			count++;
		} // end of while(true)
	}
}