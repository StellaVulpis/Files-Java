package day24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import TOOL.IOStream;
public class Map0105_DAO extends IOStream implements mthd, Runnable
{
	ArrayList<Map0105_DTO> list = new ArrayList<Map0105_DTO>();
	TreeMap<Integer, String>  tree = new TreeMap<Integer, String>();
	 Boolean isNull;
	 Map0105_DAO()
	 {
		 isNull=true;
	 }
	@Override
	public void in() 
	{	
		isNull=true;
		/*
		 * Item0101202000
			Item0200808000
			Item0301200900
			Item0400901200	
			Item0501312850
			Item0602324300
			Item0799817000
			(0,6)(6,9)(9,14)
			String, int, int
		 * */
		try
		{
			FileReader f = new FileReader("C:/Data/Map0105.txt");
			BufferedReader bf=new BufferedReader(f);
			while(true)
			{
				Map0105_DTO dat = new Map0105_DTO();
				try
				{
				String txt=bf.readLine();
				if(txt==null)
				{
					bf.close();
					break;
				}
				String item; int val, price, sale;
				item=txt.substring(0,6);
				val=toInt(txt.substring(6,9));
				price=toInt(txt.substring(9,14));
				sale=(val*price);
				dat.setItem(item); dat.setVal(val); dat.setPrice(price); dat.setSale(sale);
				list.add(dat);
				
				}catch(NullPointerException e)
				{
					errln("Null 값을 참조할 수 없습니다. 소스코드를 다시한번 확인해주세요.");
					break;
				}
			}
			for(int i=0;i<list.size();i++)
				tree.put(list.get(i).getSale(), list.get(i).getItem());
			Set<Integer> keyset=tree.keySet();
			Iterator<Integer> it = keyset.iterator(); // ArrayList에 있는 값을 호출함.
			print(ln+"파일의 로드가 완료되었습니다."+ln);
			isNull=false;
		}catch(IOException e)
		{
			errln(e.getMessage());
			errln("(파일을 찾을 수 없거나 더이상 사용할 수 없습니다.");
			return;
		}
	}
	@Override
	public void out()
	{
		DecimalFormat dc = new DecimalFormat("#,###,###");
		Set<Integer> keyset=tree.keySet();
		Iterator<Integer> it = keyset.iterator(); // ArrayList에 있는 값을 호출함.
		print(ln+"[출력 결과]"+ln);
		println("TreeMap output >>\n");
		while(it.hasNext())
		{
			Integer sale=it.next();
			String item=tree.get(sale);
			println("상품명: "+item+" | 매출액: "+dc.format(sale)+"원");
		}
		print(ln);
		print("ArrayList output >>\n\n");
		for(Map0105_DTO a:list)
			println("개수: "+dc.format(a.getVal())+"개"+" | 가격: "+dc.format(a.getPrice())+"원");
		print(ln);
	}
	@Override
	public void run() // menu
	{
		while(true)
		{
			println("[메뉴]");
			println("1. 입력(불러오기)\n2. 출력\n3. 종료");
			print("\n입력: ");
			String sel=scanf(null);
			switch(sel)
			{
			case "1":
			case "입력":
			case "불러오기":
				in();
				break;
			case "2":
			case "출력":
				if(isNull==true)
				{
					errln("파일이 로드되지 않았습니다. 파일을 불러온 뒤 다시 출력해주세요.");
					continue;
				}
				out();
				break;
			case "3":
			case "종료":
			case "exit":
				err(ln+"[종료되었습니다.]"+ln);
				exit();
				break;
			}
		}
	}
}
interface mthd
{
	public void in();
	public void out();
	public void run();
}