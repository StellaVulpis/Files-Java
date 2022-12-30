package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import TOOL.*;
public class Item1230_DAO  implements Menu
{
	private Item1230_DAO() {	}
	
	private static Item1230_DAO instance = new Item1230_DAO();
	public static Item1230_DAO getInstance()
	{
		return instance;
	}
	DecimalFormat dc = new DecimalFormat("#,###,###,###");
	ArrayList<Item1230_DTO> list = new ArrayList<Item1230_DTO>();
	IOStream io = new IOStream();
	int dinput; String ln=io.ln;
	@Override
	public void in()
	{
		dinput=0;
		String name, addr1, addr2;
		int price, val, sale; String item;
		int  age, count=0; 
		String answer;
		
		while(true)
		{
			Item1230_DTO dat = new Item1230_DTO();
			if(count>0)
			{
				io.print(ln+"계속하시겠습니까?\nYes\t|\tNo"+ln);
				io.print("입력: ");
				answer=io.scLine();
				if(answer.equals("NO") || answer.equals("No") || answer.equals("no")
						|| answer.equals("n") || answer.equals("N") || answer.equals("아니요")||
						answer.equals("아니오"))
				{
					dinput++;
					break;
				}
				else
				dinput++;
				}

			io.print(ln+"환영합니다. 기본 정보를 입력해주세요.\n"+ln);
			io.print("이름을 입력: ");
			name=io.scLine();
			io.print("판매를 담당한 상품명을 입력: ");
			item=io.scLine();
			io.print("상품의 가격을 입력: ");
			price=io.scInt();
			io.print("판매한 총 개수를 입력: ");
			val=io.scInt();
			sale=price*val;
			io.print("나이를 입력: ");
			age=io.scInt();
			io.print("시 군 구 주소를 입력: ");
			addr1=io.scLine();
			io.print("상세 주소(번지수 포함)를 입력: ");
			addr2=io.scLine();
			dat.setName(name);
			dat.setAge(age);
			dat.setItems(item);
			dat.setPrice(price);
			dat.setVal(val);
			dat.setSale(sale);
			dat.setAddress(addr1+addr2);
			list.add(dat);
			Collections.sort(list);
			count++;
		}
		dinput++;
	}
	@Override
	public void out()
	{
		if(dinput==0)
			read();
		io.print("\n"+ln+"\t\t\t[출력 결과]"+ln+"\n");
		for(Item1230_DTO a:list)
		{
			io.println("사원명: "+a.getName());
			io.println("연령: "+a.getAge());
			io.println("주소: "+a.getAddress());
			io.println("담당 품목: "+a.getItems());
			io.println("품목 가격: "+dc.format(a.getPrice())+"원");
			io.println("판매량: "+a.getVal());
			io.println("총 매출액: "+dc.format(a.getSale())+"원");
			io.print(ln);
			/*
			io.println(a.getName()+"\t"+a.getAge()+"\t\t"+a.getAddress()
			+"\t\t"+a.getItems()+"\t\t\t"+a.getPrice()+"\t\t\t"+a.getVal()+"\t\t\t"+a.getSale());
			*/
		}
	}
	@Override
	public void menu()
	{
		io.print(ln+"1. 직접입력\n2. 불러오기\n3. 출력\n4. 종료"+ln);
		io.print("입력: ");
		String sel=io.scLine();
		switch(sel)
		{
		case "직접 입력":  case "직접입력":  case "1":
			in();
			break;
		case "2": case "불러오기": case "load":
			read();
			break;
		case "3": case "출력":
			out();
			break;
		case "4": case "종료": case  "exit":
			io.exit();
			break;
		}
	}
	@Override
	public void read() 
	{
		try
		{
			dinput=0;
			String item, name, addr1, addr2;
			int price, val,  age, sale;
			FileReader f1 = new FileReader("C:/Data/Item1230.txt");
			BufferedReader b1 = new BufferedReader(f1);
			FileReader f2 = new FileReader("C:/Data/Company1230.txt");
			BufferedReader b2 = new BufferedReader(f2);
			for(;;)
			{
				Item1230_DTO dat = new Item1230_DTO();
				String txt1, txt2;
				txt1=b1.readLine();
				txt2=b2.readLine();
				if(txt1 == null && txt2 == null)
				{
					b1.close();
					b2.close();
					break;
				}
				item=txt1.substring(0,9);
				name=txt2.substring(0,8);
				val=io.toInt(txt1.substring(9,11));
				price=io.toInt(txt1.substring(11,16));
				age=io.toInt(txt2.substring(8,10));
				addr1=txt2.substring(11,17);
				addr2=txt2.substring(17,30);
				sale=val*price;
				//item=item.trim();
				//name=name.trim();
				//addr2=addr2.trim();
				dat.setItems(item);
				dat.setVal(val);
				dat.setPrice(price);
				dat.setSale(sale);
				dat.setName(name);
				dat.setAddress(addr1+addr2);
				dat.setAge(age);
				list.add(dat);
				Collections.sort(list);
			}
			io.print(ln+"파일의 로드가 완료되었습니다."+ln);
			dinput++;
		}catch(IOException e)
		{
			io.err(ln);
			io.errln("파일을 찾을 수 없거나 더이상 사용할 수 없습니다.");
			io.err(ln);
			e.printStackTrace();
			io.errln("종료합니다.");
			io.exit();
		}
		
	}
}
