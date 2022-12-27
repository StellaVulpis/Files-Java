package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ArrayItems 
{
	public static String ln="\n---------------------------------------------------------------------\n";
	/*		  0	  1    2   3
	 *  상품명 수량 단가 매출액 순위
	 * 	감자군105000
		사과군032500
		신참외203300
		고구마152300
		컴퓨터029900
		청소기105000
	 * */
	public static void main(String args[])
	{
		String name[]=new String [10000];
		String na;
		int items[][] = new int [10000][4];
		int p=0, val=0, price=0, sales=0;
		try
		{
			FileReader file = new FileReader("C:/Data/items.txt");
			BufferedReader bf = new BufferedReader(file);
			while(true)
			{
				String txt = bf.readLine();
				if(txt==null)
				{
					bf.close();
					break;
				}
				na=txt.substring(0,3);
				val=Integer.parseInt(txt.substring(3,5));
				price=Integer.parseInt(txt.substring(5,10));
				sales=(price*val);
				name[p]=na;
				items[p][0]=val;
				items[p][1]=price;
				items[p][2]=sales;
				//-------------------------------
				p++; // [6] lines | if(txt==null) break;
				//-------------------------------
			}// end of while(true)
			ArrayItems.rank(name,items,p);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void rank(String Name[], int Items[][], int po)
	{
		for(int i=0;i<po;i++)
		{
			Items[i][3]=1;
			for(int t=0;t<po;t++)
			{
				if(Items[i][2]<Items[t][2])
					Items[i][3]+=1;
			}
		}
		System.out.print("이름\t수량\t단가\t매출액\t석차"+ln);
		for(int i=0;i<po;i++)
		{
			System.out.print(Name[i]+"\t");
			for(int t=0;t<4;t++)
			{
				System.out.print(Items[i][t]+"\t"); // 열(po; 생성된 줄만큼): 6개, 행(항목): 4개 >> [t]개씩의 항목을 [i]개 만큼 출력한다.
			}
			System.out.println();
		}
	}
}
