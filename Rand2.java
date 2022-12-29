package day19;

import java.util.Random;

import TOOL.util;

public class Rand2 
{
	public static void main(String args[])
	{
		// 컴퓨터가 1~100 중 한 숫자를 기억함
		// 키보드로 입력받아 그 수를 알아맞추는 것
		/*
		 1. 수를 1~100까지 난수 발생
		 2. 무한 반복
		 3. 생각한 수를 입력
		 4. 입력한 수와 컴퓨터가 발생시킨 수를 비교
		 */
		Random rd = new Random();
		util io = new util();
		int a[] = new int[100];
		int myNum=0, botNum=0, i=0, temp=0; String num;
			while(true)
			{
				a[i]=rd.nextInt(100);
				botNum=a[i]+1; // 한번 숫자가 정해지고 내가 맞추는 것.
				if(botNum!=0)
					break;
				i++;
			}
			while(true)
			{
				io.println("1~100 범위에서 수를 입력하세요");
				io.println("[종료하려면 'exit' 입력]");
				num=io.scLine("입력");
				if(num.equals("exit"))
				{
					io.errln("종료되었습니다.");
					break;
				}
				else if(num.equals("show me the number"))
				{
					System.out.println(botNum);
					io.errln("종료되었습니다.");
					break;
				}
				myNum=io.toInt(num);
				temp=(myNum-botNum);
				
				io.print(io.ln);
				if(botNum==myNum)
				{
					io.print(io.ln+"숫자를 맞히셨습니다!");
					io.println("봇 숫자: "+botNum+" | 내 숫자: "+myNum+io.ln);
				}
				else if(botNum!=myNum && botNum <= 24 && botNum >= 1)
				{
					io.print(io.ln+"숫자를 맞히지 못했습니다...");
					io.println("힌트: 1~24 이내입니다."+io.ln);
				}
				else if(botNum!=myNum && botNum >= 25 && botNum <= 50)
				{
					io.print(io.ln+"숫자를 맞히지 못했습니다...");
					io.println("힌트: 25~50 이내입니다."+io.ln);
				}
				else if(botNum!=myNum && botNum > 50 && botNum <= 75)
				{
					io.print(io.ln+"숫자를 맞히지 못했습니다...");
					io.println("힌트: 51~75 이내입니다."+io.ln);
				}
				else if(botNum!=myNum && botNum > 75 && botNum <= 100)
				{
					io.print(io.ln+"숫자를 맞히지 못했습니다...");
					io.println("힌트: 76~100 이내입니다."+io.ln);
				}
				else if(myNum>100 || myNum<1)
				{
					io.errln("숫자는 반드시 1~100 범위내에서 입력해주세요.");
					break;
				}
				switch(temp/10)
				{
				case 0:
					io.print(io.ln+"It's burning like desert. Come just a little more closer."+io.ln);
					break;
				case 1:
					io.print(io.ln+"Damn, it's hot in here."+io.ln);
					break;
				case 2:
					io.print(io.ln+"Hotter."+io.ln);
					break;
				case 3: 
					io.print(io.ln+"Hot."+io.ln);
					break;
				case 4:
					io.print(io.ln+"Warmer."+io.ln);
					break;
				case 5:
					io.print(io.ln+"Warm."+io.ln);
					break;
				case 6:
					io.print(io.ln+"Cold."+io.ln);
					break;
				case 7:
					io.print(io.ln+"Colder."+io.ln);
					break;
				case 8:
					io.print(io.ln+"Damn, too cold."+io.ln);
					break;
				case 9:
				case 10:
					io.print(io.ln+"It's freezing in here."+io.ln);
					break;
				}
			}	
	}
}
