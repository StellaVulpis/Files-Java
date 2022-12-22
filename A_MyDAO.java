package day14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import day14.A_Interface.*;
public class A_MyDAO extends A_MyDTO implements A_Interface, Acts 
{
	ArrayList<A_MyDTO> list = new ArrayList<A_MyDTO>();
	@Override
	public int scanInt(String text) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextInt();
	}
	@Override
	public String scanStr(String text) 
	{
		@SuppressWarnings("resource")
		Scanner tc = new Scanner(System.in);
		System.out.print(text+": ");
		return tc.nextLine();
	}
	@Override
	public void In() 
	{
		A_MyDTO dat = new A_MyDTO();
		dat.setName(scanStr(ln+"이름을 입력"));
		dat.setAge(scanInt("나이를 입력"));
		dat.setDo(scanStr("사는 도를 입력"));
		dat.setSi(scanStr("사는 시를 입력"));
		dat.setGu(scanStr("사는 구을 입력"));
		dat.setDong(scanStr("사는 동을 입력"));
		System.out.println(ln);
		list.add(dat);
	}
	@Override
	public void Out() 
	{
			//System.out.println("Out 실행됨"); // >> TRUE
			int count=1;
			Collections.sort(list); // Linked to Interface Comparable, getting the value which is returned in Comparable interface.
			for(A_MyDTO a:list)
			{
				System.out.println("<"+count+">");
				System.out.println("이름: "+a.getName());
				System.out.println("나이: "+a.getAge());
				System.out.printf("주소: %s %s %s %s",a.getDo(), a.getSi(),a.getGu(),a.getDong());
				System.out.print(ln);
				count++;
			}
	}
	@Override
	public void Load()
	{
		final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		/*
		Koo025경기도 수원시권선구호매실동
		Con031경기도 안산시안양구안산동 
		Jor044서울도 서울시구로구구로동 
		Nub052경기도 연천시연천구연천동 
		Den018경상남도부산광역시남구남동
		Dub100전라북도전주구전주시전주동
		 * */
		try
		{
			FileReader file = new FileReader("C:/Data/1332.txt");
			BufferedReader bf = new BufferedReader(file);
			while(true)
			{
				String txt = bf.readLine(); 
				if(txt == null)
				{
					bf.close();
					break;
				}
				A_MyDTO dat = new A_MyDTO();
				dat.setName(txt.substring(0,3));
				dat.setAge(Integer.parseInt(txt.substring(3,6)));
				dat.setDo(txt.substring(6,10));
				dat.setSi(txt.substring(10,15));
				dat.setGu(txt.substring(15,18));
				dat.setDong(txt.substring(18,22));
				list.add(dat);
			}
			System.out.print(ln+"\n파일의 로드가 완료되었습니다.\n");
		}catch(IOException e)
		{
			LOG.log(Level.WARNING,"파일을 찾을 수 없거나 더이상 사용할 수 없습니다.");
			e.printStackTrace();
		}catch(NullPointerException e)
		{
			System.out.println(ln+"Null값은 참조할 수 없습니다. 읽어들일 파일을 다시한번 체크해주세요."+ln);
			e.printStackTrace();
			return;
		}

	}
	@Override
	public void delete() 
	{
		// Note to myself: Finish this method to work properly some other time.
		//======================================================================================
		// int p=-1;
		// Search list objects with for loop(i=0;i<list.size();i++)
		// scanner >> type name 
		// if(list.get(i).getName().equals(name) >> found
		// found >> p=i; break;
		// Confirm whether to delete the data or not.
		// Yes >> list.remove(p);
		//=======================================================================================
	}
}
