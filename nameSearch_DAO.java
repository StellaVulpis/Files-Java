package day12;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
public class nameSearch_DAO // DAO: Data Access Object; 데이터에 접근하기 위한 동작이 담긴 객체
{
	String underLine;
	nameSearch_DAO()
	{
		underLine="\n----------------------------------------\n";
	}
	nameSearch_Input in = new nameSearch_Input();
	ArrayList<nameSearch_DTO> list = new ArrayList<nameSearch_DTO>();
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	void In()
	{
		nameSearch_DTO dat = new nameSearch_DTO();
		dat.setName(in.nameScan("이름을 입력"));
		list.add(dat);
	}
	void Out()
	{
		System.out.println(underLine);
		System.out.println("[출력 결과]");
		for(nameSearch_DTO a:list)
			System.out.println(a.getName());
	}
	void Delete()
	{
		int po=-1;
		String ans;
		while(true)
		{
			System.out.print("찾을 이름을 입력: ");
			String nameToDelete=in.sc.next();
			for(int i=0;i<list.size();i++)
			{
				// list(ArrayList) == nameSearch_Dat
				if(list.get(i).getName().equals(nameToDelete))
				{
					po=i;
					break;
				}
			}
			if(po==-1)
			{
				System.out.println(underLine+"찾으시는 이름이 없습니다. 처음으로 돌아갑니다."+underLine);
				break;
			}
			else // Name found
			{
				System.out.println(underLine+"이름을 찾았습니다.\n");
				System.out.println("이름: "+list.get(po).getName());
				System.out.println("정말 삭제할까요?"+underLine);
				System.out.print("네 / 아니오: ");
				ans=in.sc.next();
				if(ans.equals("네")||ans.equals("Yes")||ans.equals("YES")||ans.equals("yes")||
						ans.equals("Y")||ans.equals("y"))
						{
							list.remove(po);
							System.out.println(underLine+"삭제가 완료되었습니다. 종료합니다.");
							System.exit(0);
						}
				else if(ans.equals("아니오")||ans.equals("No")||ans.equals("NO")||ans.equals("no")||
						ans.equals("N")||ans.equals("n"))
				{
					System.out.println(underLine+"알겠습니다. 처음 화면으로 돌아갑니다.");
					break;
				}
					
			}
		}
	}
	void Run()
	{
		nameSearch_DTO dat = new nameSearch_DTO();
		int sel;
		while(true)
		{
			System.out.println(underLine+"선택하세요");
			System.out.println("1. 입력\t2. 출력\t3. 삭제\t4. 종료");
			System.out.print("\n입력: ");
			sel=in.sc.nextInt();
			switch(sel)
			{
			case 1:
				In();
				break;
			case 2:
					Out();
				break;
			case 3:
				Delete();
				break;
			case 4:
				System.out.println(underLine);
				LOG.log(Level.INFO, "종료되었습니다.");
				System.out.println(underLine);
				return;
			}
		}
	}
}
