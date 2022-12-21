package day13;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
public class ScoreDAO extends ScoreDTO
{
	ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();
	// FileReader can't be declared in the field;Default Constructor.
	public void In() throws FileNotFoundException, IOException
	{
		FileReader file = new FileReader("C:/Data/1221.txt");
		BufferedReader bf = new BufferedReader(file);
		while(true)
		{
			int rank,kor,eng,math; String name;
			ScoreDTO dat = new ScoreDTO();
			String line = " ";
			line=bf.readLine();
			if(line==null) 
			// This line is not exception, it stops while loop
			// when reading is finished.
			{
				System.out.println(underLine);
				System.out.println("Message: File loaded.");
				break;
			}
			rank=Integer.parseInt(line.substring(0,1));
			name=line.substring(1,4);
			kor=Integer.parseInt(line.substring(4,7));
			eng=Integer.parseInt(line.substring(7,10));
			math=Integer.parseInt(line.substring(10,13));
			dat.setName(name);
			dat.setRank(rank);
			dat.setKor(kor);
			dat.setEng(eng);
			dat.setMath(math);
			dat.setTot((double)(kor+eng+math));
			dat.setAvrg(dat.getTot()/3);
			if(dat.getAvrg()>=90 && dat.getAvrg()<=100)
				dat.setGrade("A");
			else if(dat.getAvrg()>=80 && dat.getAvrg()<90)
				dat.setGrade("B");
			else if(dat.getAvrg()>=70 && dat.getAvrg()<80)
				dat.setGrade("C");
			else if(dat.getAvrg()>=60 && dat.getAvrg()<70)
				dat.setGrade("D");
			else if(dat.getAvrg()<60)
				dat.setGrade("F");
			else 
				dat.setGrade("WRONG SCORE");
			list.add(dat);
		}
	}
	public void Out()
	{
		System.out.println(underLine+"  순위\t이름\t국어\t영어\t수학\t총점\t평균\t학점"+underLine);
		Collections.sort(list);
		for(ScoreDTO a:list)
		{
			System.out.print("   "+a.getRank()+"\t");
			System.out.print(a.getName()+"\t");
			System.out.print(a.getKor()+"\t");
			System.out.print(a.getEng()+"\t");
			System.out.print(a.getMath()+"\t");
			System.out.printf("%.0f\t",a.getTot());
			System.out.printf("%.2f\t",a.getAvrg());
			System.out.print(" "+a.getGrade()+"\t");
			System.out.println();
		}
	}
	public void Del()
	{
		int p=-1;
		String nSearch, ans;
		for(;;)
		{
			System.out.println("종료하려면 종료 또는 EXIT를 입력");
			System.out.print("삭제할 데이터의 이름을 입력: ");
			nSearch=ScanStr();
			if(nSearch.equals("EXIT")||nSearch.equals("Exit")||nSearch.equals("exit")||nSearch.equals("종료")
					||nSearch.equals("끝내기")||nSearch.equals("shutdown"))
			{
				System.out.println(underLine+"종료합니다."+underLine);
				break;
			}
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getName().equals(nSearch))
				{
					p=i;
					System.out.println(underLine+"이름을 찾았습니다."+underLine);
				}
			}
			if(p==-1)
			{
				System.out.println(underLine+"찾는 이름이 없습니다. 다시 시도해주세요."+underLine);
				break;
			}
			System.out.println(underLine+"정말 "+list.get(p).getName()+"의 데이터를 삭제하시겠습니까?");
			System.out.print("네 / 아니요: ");
			ans=ScanStr();
			System.out.println(underLine);
			if(ans.equals("YES")||ans.equals("네")||ans.equals("예")||ans.equals("Yes")
					||ans.equals("yes")||ans.equals("Y")||ans.equals("y"))
			{
				System.out.println(underLine+"성공적으로 삭제가 완료되었습니다. 초기화면으로 돌아갑니다."+underLine);
				list.remove(p);
			}
		}
	}
	public int ScanInt()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public String ScanStr()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public void run() throws FileNotFoundException, IOException
	{
		final Logger LOG=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		int sel=0;
		while(true)
		{
			System.out.print(underLine+"[Please selelect. (Type only number)]");
			System.out.println(underLine+"1. Load file");
			System.out.println("2. Open file data");
			System.out.println("3. Search data to delete");
			System.out.println("4. Exit"+underLine);
			System.out.print("Enter: ");
			sel=ScanInt();
			System.out.println(underLine);
			switch(sel)
			{
			case 1:
				In();
				break;
			case 2:
				Out();
				break;
			case 3:
				Del();
				break;
			case 4:
				LOG.log(Level.INFO, "System was terminated.");
				return;
			}
		}
	}
}
