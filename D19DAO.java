package day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class D19DAO extends D19DTO implements Act 
{
	ArrayList<D19DTO> list = new ArrayList<D19DTO>();
	static String hr="인사과";
	static String md="자재과";
	static String ga="총무과";
	static String co="사업과";
	String ln = "\n---------------------------------------------------------\n";
	enum setName
	{
		hr,md,ga,co
	};
	int in=0;
	public D19DAO(String divName, String name, int age) 
	{
		super(divName, name, age);
	}

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		list.add(new D19DTO(hr,"Marshal",28));
		list.add(new D19DTO(md,"Raymond",27));
		list.add(new D19DTO(ga, "Punchy", 23));
		list.add(new D19DTO(STR("부서명을"),STR("이름을"),INT("나이를")));
		System.out.println("입력완료");
		in++; // Input method has executed.
	}

	@Override
	public int INT(String text) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(text+" 입력: ");
		return sc.nextInt();
	}
	@Override
	public String STR(String text) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(text+" 입력: ");
		return sc.nextLine();
	}
	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		if(in==0) // If user didn't execute input method, go execute it and run Out() method.
			In();
		for(D19DTO a:list)
		{
			System.out.print(ln);
			System.out.println("부서명:\t"+a.divName);
			System.out.println("이름:\t"+a.name);
			System.out.println("나이:\t"+a.age);
			System.out.print(ln);
		}
	}

	@Override
	public void Exit() 
	{
		// TODO Auto-generated method stub
		System.err.println("종료되었습니다.");
		System.exit(0);
	}

	@Override
	public void FileLoad() 
	{
		// TODO Auto-generated method stub
		try
		{
			FileReader f = new FileReader("C:/Data/Individuals.txt");
			BufferedReader bf = new BufferedReader(f);
			while(true)
			{
				String txt=bf.readLine();
				if(txt==null)
				{
					bf.close();
					break;
				}
				switch(txt.substring(0,2))
				{
				case "hr":
					list.add(new D19DTO(hr,(txt.substring(2,10)),(Integer.parseInt(txt.substring(10,12)))));
					break;
				case "md":
					list.add(new D19DTO(md,(txt.substring(2,10)),(Integer.parseInt(txt.substring(10,12)))));
					break;
				case "ga":
					list.add(new D19DTO(ga,(txt.substring(2,10)),(Integer.parseInt(txt.substring(10,12)))));
					break;
				case "co":
					list.add(new D19DTO(co,txt.substring(2,10),(Integer.parseInt(txt.substring(10,12)))));
					break;
				default:
					list.add(new D19DTO(txt.substring(0,2),(txt.substring(2,10)),(Integer.parseInt(txt.substring(10,12)))));
					break;
				}		
			}
			System.out.print(ln+"파일이 로드되었습니다."+ln+"\n");
			in++; // Input method has executed.
		}catch(IOException e)
		{
			System.err.println("파일을 찾을 수 없어 로드하지 못했습니다.");
			e.printStackTrace();
		}
	}
}
interface Act
{
	public void In();
	public int INT(String text);
	public String STR(String text);
	public void Out();
	public void Exit();
	public void FileLoad();
}