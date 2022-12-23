package day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreDAO1223 extends ScoreDTO1223 implements SCAN, funcs
{
	ArrayList<ScoreDTO1223> list = new ArrayList<ScoreDTO1223>();
	Boolean isLoaded;
	ScoreDAO1223()
	{
		isLoaded=false;
	}
	public void menu()
	{
		while(true)
		{
			String sel=null;
			System.out.println("1. 자료 입력\n2. 자료 출력\n3. 자료 검색\n4. 자료 삭제\n5. 자료 수정\n6. 파일 삭제\n7. 종료");
			sel=scStr(ln+"메뉴 입력");
			switch(sel)
			{
			case "1":
				In();
				break;
			case "2":
				Out();
				break;
			case "3":
				Search();
				break;
			case "4":
				Delete();
				break;
			case "5":
				Edit();
				break;
			case "6":
				Remove();
				break;
			case "7":
				Exit();
				break;
			case "종료":
				Exit();
				break;
			}
		}
	}
	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		isLoaded=true;
		try
		{
			FileReader file = new FileReader("C:/Data/1144.txt");
			BufferedReader bf = new BufferedReader(file);
			while(true)
			{
				String name;
				int kor,eng,math;
				double tot,avg;
				ScoreDTO1223 dat = new ScoreDTO1223();
				String txt=bf.readLine(); // 이름 국어 영어 수학 3자리씩
				if(txt==null)
				{
					bf.close();
					break;
				}
				name=txt.substring(0,3);
				kor=Integer.parseInt(txt.substring(3,6));
				eng=Integer.parseInt(txt.substring(6,9));
				math=Integer.parseInt(txt.substring(9,12));
				tot=(double)kor+(double)eng+(double)math;
				avg=tot/3;
				dat.setName(name);dat.setKor(kor);dat.setEng(eng);dat.setMath(math);
				dat.setTotal(tot);dat.setAvrg(avg);
				if(avg>=90&&avg<=100)
				{
					dat.setGrade("A");
				}
				else if(avg>=80&&avg<90)
				{
					dat.setGrade("B");
				}
				else if(avg>=70&&avg<80)
				{
					dat.setGrade("C");
				}
				else if(avg>=60&&avg<70)
				{
					dat.setGrade("D");
				}
				else if(avg<60)
				{
					dat.setGrade("F");
				}
				else
					dat.setGrade(null);
				list.add(dat);
			}
			System.out.print(ln+"자료가 로드되었습니다."+ln);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		if(isLoaded==false)
		{
			System.out.print(ln+"자료가 로드되지 않아 자동으로 로드되었습니다."+ln);
			In();
		}
		System.out.print(ln+"[출력 결과]"+ln+"\n이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
		for(ScoreDTO1223 a:list)
			System.out.printf("%s\t%d\t%d\t%d\t%.0f\t%.2f\t%s\n",a.name,a.kor,a.eng,a.math,a.total,a.avrg,a.grade);
		System.out.print(ln);
	}

	@Override
	public void Search() 
	{
		if(isLoaded==false)
		{
			System.out.print(ln+"자료가 로드되지 않아 자동으로 로드되었습니다."+ln);
			In();
		}
			// TODO Auto-generated method stub
			String val=" ";int po=-1;
			for(;;)
			{
				if(val.equals("exit")||val.equals("EXIT"))
					break;
				System.out.print(ln+"자료를 검색해주세요.\n");
				System.out.print("(검색을 끝내시려면 exit를 입력해주세요.)"+ln);
				val=scStr("검색");
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getName().equals(val))
					{
						po=i;
						break;
					}
				}
				if(po==-1) 
					break;
				else
				{
					System.out.print(ln+"자료를 찾았습니다."+ln);
					System.out.print("찾은 자료는 "+list.get(po).getName()+" 입니다."+ln);
					System.out.print("[자료 상세 정보]"+ln);
					System.out.print("\n이름\t국어\t영어\t수학\t총점\t평균\t학점\n"+ln);
					System.out.print(list.get(po).getName()+"\t");
					System.out.print(list.get(po).getKor()+"\t");
					System.out.print(list.get(po).getEng()+"\t");
					System.out.print(list.get(po).getMath()+"\t");
					System.out.printf("%.0f\t",list.get(po).getTotal());
					System.out.printf("%.2f\t",list.get(po).getAvrg());
					System.out.print(list.get(po).getGrade()+ln);
				}
	
			}
	}
	@Override
	public void Delete() 
	{
		// TODO Auto-generated method stub
		if(isLoaded==false)
		{
			System.out.print(ln+"자료가 로드되지 않아 자동으로 로드되었습니다."+ln);
			In();
		}
		String del=" ", conf=" "; int l=-7;
		while(true)
		{
			if(del.equals("exit")||del.equals("EXIT"))
				break;
			System.out.print(ln+"자료를 삭제하기 전에 먼저 검색해야 합니다.\n검색을 실행합니다."
					+ "\n(종료하려면 'exit'를 입력해주세요.)"+ln);
			System.out.println("");
			del=scStr("삭제할 자료를 검색");
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getName().equals(del))
				{
					l=i;
					break;
				}
			}
			if(l==-7)
				break;
			else
			{
				System.out.print(ln+"삭제할 자료를 찾았습니다."+ln);
				System.out.println(ln+"정말로 삭제하시겠습니까?");
				System.out.println("네 / 아니요");
				conf=scStr("입력");
				if(conf.equals("네")||conf.equals("예")||conf.equals("yes")||conf.equals("YES")
						||conf.equals("Yes")||conf.equals("Y")||conf.equals("y"))
				{
					list.remove(l);
					System.out.print(ln+"삭제가 완료되었습니다. 처음 화면으로 돌아갑니다."+ln);
					break;
				}
			}
		}
	}
	@Override
	public void Edit() 
	{
		// TODO Auto-generated method stub
		if(isLoaded==false)
		{
			System.out.print(ln+"자료가 로드되지 않아 자동으로 로드되었습니다."+ln);
			In();
		}
		String name=" ",ans=" ",altName;
		int altKor,altEng,altMath;
		int l=-7; // 기본 전산 개념에서 마이너스(-)는 없는 개념, 플러스(+)는 있는 개념이다.
		while(true)
		{
			ScoreDTO1223 dat = new ScoreDTO1223();
			if(name.equals("exit")||name.equals("EXIT")||name.equals("종료"))
				break;
			System.out.print(ln+"자료를 수정하기 전에 먼저 검색해야 합니다.\n검색을 실행합니다.\n"
					+ "(종료하려면 'exit'를 입력해주세요.)"+ln);
			name=scStr("수정할 자료의 이름을 입력");
			
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getName().equals(name))
				{
					l=i;
					break;
				}
			}
			if(l==-7)
			{
				System.out.print(ln+"자료를 찾지 못했습니다. 처음 화면으로 돌아갑니다."+ln);
				break;
			}
			else
			{
				System.out.print(ln+"수정할 자료를 찾았습니다."+ln);
				System.out.print("정말로 교체할까요?"+ln);
				ans=scStr("네 / 아니요");
				if(ans.equals("네")||ans.equals("예")||ans.equals("Y")||ans.equals("y"))
				{
					System.out.print(ln);
					altName=scStr("교체할 이름을 입력해주세요");
					altKor=scInt("교체할 국어점수를 입력해주세요");
					altEng=scInt("교체할 영어점수를 입력해주세요");
					altMath=scInt("교체할 수학점수를 입력해주세요");
					dat.setName(altName);
					dat.setKor(altKor);
					dat.setEng(altEng);
					dat.setMath(altMath);
					list.set(l, dat);
					System.out.print(ln+"교체가 완료되었습니다. 처음 화면으로 돌아갑니다."+ln);
					break;
				}
				else
				{
					System.out.print(ln+"처음 화면으로 돌아갑니다."+ln);
					break;
				}
			}
		}
	}

	@Override
	public void Exit() 
	{
		// TODO Auto-generated method stub
		System.out.println("종료되었습니다.");
		System.exit(0);
	}
	@Override
	public void Remove() 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(isLoaded==false)
				{
					System.out.print(ln+"자료가 로드되지 않아 자동으로 로드되었습니다."+ln);
					In();
				}
				String del=" ", conf=" ", Path; int l=-7;
				java.nio.file.Path pths = Paths.get("C:\\Data\\DeleteTest.txt");
				while(true)
				{
						System.out.println(ln+"정말로 파일을 삭제하시겠습니까?");
						System.out.println("(실제 디렉토리의 파일이 완전히 삭제됩니다.)");
						System.out.println("네 / 아니요"+ln);
						conf=scStr("입력");
						if(conf.equals("네")||conf.equals("예")||conf.equals("Y")||conf.equals("y"))
						{
							try
							{
								Files.delete(pths);
							}catch(NoSuchFileException e)
							{
								e.printStackTrace();
							}catch(DirectoryNotEmptyException e)
							{
								e.printStackTrace();
							}catch(IOException e)
							{
								e.printStackTrace();
							}
							System.out.print(ln+"삭제가 완료되었습니다. 처음 화면으로 돌아갑니다."+ln);
							break;
						}
				}
	}
}