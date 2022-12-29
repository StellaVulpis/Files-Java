package day19;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import TOOL.util;
	public class TEST1_DAO extends util implements action
	{
		ArrayList<TEST1_DTO> list = new ArrayList<TEST1_DTO>();
		int run;
		private static TEST1_DAO instance = new TEST1_DAO();
		private TEST1_DAO(){}
		public static TEST1_DAO getInstance()
		{
			return instance;
		}
		@Override
		public void read() 
		{
			run=0;
			try
			{
				/*
				 * 	사과 0081500
					참외 0122000
					바나나0053100 
					※파일을 읽어들일때 숫자에는 절대 공백이 들어가면 안된다. 
					공백대신 0을 사용해서 문자열의 길이를 맞춘다.
				 * */
				FileReader file = new FileReader("C:/Data/sale.txt");
				BufferedReader bf = new BufferedReader(file);
				int val=0,price=0,sale=0; String name=null;
				while(true)
				{
					TEST1_DTO d = new TEST1_DTO();
					String txt = bf.readLine();
					if(txt==null)
					{
						bf.close();
						break;
					}
					name=txt.substring(0,2);
					val=toInt(txt.substring(3,6));
					price=toInt(txt.substring(6,10));
					sale=val*price;
					d.setItem(name);
					d.setVal(val);
					d.setPrice(price);
					d.setSale(sale);
					list.add(d);
				}
				run++;
				print(ln+"입력이 완료되었습니다."+ln);
			}catch(IOException e)
			{
				err(ln+"파일을 찾을 수 없습니다."+ln);
				return;
			}
		}
		@Override
		public void out() 
		{
			if(run==0)
			{
				err(ln+"파일이 로드되지 않아 자동으로 로드되었습니다."+ln);
				read();
			}
			print("[출력 결과]"+ln);
			println("상품명\t가격\t수량\t매출액");
			for(TEST1_DTO a:list)
			{
				print(a.getItem()+"\t");
				print(a.getPrice()+"\t");
				print(a.getVal()+"\t");
				println(a.getSale()+"\t");
			}
		}
		@Override
		public void fin() 
		{
			err(ln+"종료되었습니다."+ln);
			exit();
		}
		public void menu()
		{
			while(true)
			{
				print(ln+"메뉴를 선택하세요."+ln);
				println("1. 입력");
				println("2. 출력");
				print("3. 종료\n"+ln);
				String num=scLine("입력");
				print(ln);
				switch(num)
				{
					case "1":
						read();
						break;
					case "2":
						out();
						break;
					case "3":
						fin();
						break;
					default:
						err(ln+"잘못 입력하셨습니다. 다시 시도해주세요."+ln);
				}
			}	
		}
	}
	interface action
	{
		public void read();
		public void out();
		public void fin();
		public void menu();
	}
