package day11;
import java.util.ArrayList;
public class ArrayList_DAO 
{
	ArrayList<ArrayList_Data> list = new ArrayList<ArrayList_Data>();
	ArrayList_Data ard = new ArrayList_Data();
	ArrayList_Scanner in = new ArrayList_Scanner();
	int count;
	ArrayList_DAO()
	{
	    count=0;
	}
	public void In()
	{
		ard.setName(in.scanfStr("이름을 입력"));
		ard.setKor(in.scanfInt("국어 점수를 입력"));
		ard.setEng(in.scanfInt("영어 점수를 입력"));
		ard.setMath(in.scanfInt("수학 점수를 입력"));
		ard.setTotal((double)(ard.kor+ard.eng+ard.math));
		ard.setAvrg((ard.total/3));
		if(ard.avrg>=90 && ard.avrg<=100)
			ard.setGrade("A");
		else if(ard.avrg>=80 && ard.avrg<90)
			ard.setGrade("B");
		else if(ard.avrg>=70 && ard.avrg<=80)
			ard.setGrade("C");
		else if(ard.avrg>=60 && ard.avrg<70)
			ard.setGrade("D");
		else if(ard.avrg<60)
			ard.setGrade("F");
		else
			ard.setGrade("NULL");
		list.add(ard);
	}
	public void Out()
	{
		System.out.print("이름\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("총점\t");
		System.out.print("평균\t");
		System.out.println("학점\t");
		for(ArrayList_Data a:list)
			{
				System.out.print(a.getName()+"\t");
				System.out.print(a.getKor()+"\t");
				System.out.print(a.getEng()+"\t");
				System.out.print(a.getMath()+"\t");
				System.out.printf("%.0f\t",a.getTotal());
				System.out.printf("%.2f\t",a.getAvrg());
				System.out.println(a.getGrade()+"\t\n");
			}
	}
	public void answer()
	{
		ard.setAns(in.scanfAns("Yes / No"));
	}
	public void MAIN_Loop()
	{
	    int sel=0;
		while(true)
		{
			if(count>0)
			{
			    System.out.println(ard.ans);
				System.out.println("계속?");
			    answer();
			}
			if(ard.ans.equals("NO")||ard.ans.equals("No")||ard.ans.equals("no")
				|| ard.ans.equals("아니요") || ard.ans.equals("아니오"))
			{
				System.out.println("종료되었습니다.");				
				return;
			}
			else 
			{
				for(;;)
				{
				    System.out.println("서비스를 선택해주세요.");
			    	ard.setSel(in.scanfAns("1. 입력\n2. 출력\n3. 종료"));
					if(ard.sel.equals("1") || ard.sel.equals("입력"))
						{
						sel=1; // To prevent getting values that is not from 0 to 3.
						In();
						Out();
						break;
						}
					else if(ard.sel.equals("2") || ard.sel.equals("출력"))
					{
					    sel=2;
					    if(ard.name.equals("null")||ard.kor==0||
					    ard.eng==0||ard.math==0)
					    {
					        System.out.println("출력하기 전에 먼저 데이터를 입력해주세요.");
					        break;
					    }
					    else
					    {
						Out();
						break;
					    }
					}
					else if(ard.sel.equals("3") || ard.sel.equals("종료"))
					{
					    sel=3;
						System.out.println("종료되었습니다.");
						return;
					}
					else if(sel<0 || sel>3)
					{
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
				}// end of for(;;)
			} // end of else
                  // Preventing value of previous answer(selection)
                  // to be maintained on next loop.
                  ard.sel="0";
                  sel=0;
                  count++;
		}// end of while
	} // end of MAIN_Loop()
}
