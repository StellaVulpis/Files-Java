package day04;
import java.util.Scanner;
public class For 
{
	public static void main(String[] args) 
	{
		Pyramid Py = new Pyramid();
		// for(변수명 = 처음값; 조건; 증감치)
		Py.PyramidMaker();
		//Py.Sum();
		//Py.OddSum();
		//Py.EvenSum();
		//Py.MultiTable();
		//Py.Equation();
		//Py.multiPly();
		//Py.BuyItem();
	}
}
class Pyramid
{
	// (i*1)-1
	Scanner sc = new Scanner(System.in);
	Pyramid()
	{
		
	}
	void PyramidMaker()
	{
				// Algorithem: 5 - 3 - 1 | 1 + 3 + 5 | 5 - 3 - 1
				for(int i=1;i<=6;i++)
				{
					for(int a=1; a<=11-i*2;a++)
						System.out.print(" ");
					for(int t=1; t<=(i*2-1); t++)
						System.out.print(" *");
				System.out.println();
				}
	}
	void Sum()
	{
		int sum = 0;
		for(int i =1; i<=10;i++)
		{
			sum+=i;	
		}
		System.out.println("1부터 10까지의 합: "+sum);
	}
	void OddSum()
	{
		int sum = 0;
		for(int i = 0;i<10;i++)
		{
			if(i%2==1)
			{
				sum+=i;
			System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.println("홀수의 합: "+sum);
	}
	void EvenSum()
	{
		int sum = 0;
		for(int i = 1; i<= 10; i++)
		{
			if(i%2 == 0)
				sum+=i;
		}
		System.out.println("짝수의 합: "+sum);
	}
	void MultiTable()
	{
		// 키보드 입력에서 원하는 구구단을 입력시 구구단 출력
		int scan = 0;
		System.out.print("계산할 구단을 입력: ");
		scan=sc.nextInt();
		for(int i = 1; i<=9;i++)
		{
			System.out.printf("%d x %d = %d\n",scan, i, scan*i);
			switch(scan)
			{
			case 0:
				System.out.println("Wrong number.");
				sc.close();
				return;
			case 1:
				System.out.println("Wrong number.");
				sc.close();
				return;
			}	
		}
	}
	void Equation()
	{
		// 방정식의 해를 구하는 프로그램을 작성하시오
		System.out.println("*2X=14일 때 X(해)를 구하시오*");
		System.out.println("2X=14의 X: "+(14/2));
		System.out.println("4X=20의 X: "+(20/4));
		System.out.println("7X=49의 X: "+(49/7));
	}
	void multiPly()
	{
		for(int i=2; i<= 9; i++)
		{
			for(int t=1;t<=9;t++)
			{
				System.out.printf("%d x %d = %d\n",i, t, (i*t));
				System.out.println();
			}
		}
	}
	void BuyItem()
	{
		Scanner sc = new Scanner(System.in);
		// 일정 잔고가 있고 빵이 200원 음료수 100, 커피 120원일 때 살 수 있는 갯수를 구하자
		int balance = 500;
		//int Cart[] = {1, 3, 2};
		int BPrice=200, CdPrice=100, CfPrice=120;
		int Bread = 0, Cider = 0, Coffee = 0;
		int sel = 0, boughtItem = 0;
		for(;;)
		{
			
			System.out.println("구입할 항목을 선택해주세요.");
			System.out.printf("\n잔고: %d원\n\n", balance);
			System.out.println("현재");
			System.out.printf("1. 빵(200원)\n2. 사이다(100원)\n3. 커피(120원)\n4. 종료\n\n");
			System.out.print("당신의 선택: ");
			sel = sc.nextInt();
			if(sel == 4)
			{
				System.out.println("종료되었습니다.");
				sc.close();
				return;
			}
			if(balance < BPrice || balance < CdPrice || balance < CfPrice)
			{
				System.out.println();
				System.out.println("잔고가 부족합니다.");
				System.out.println();
			}
			else
			{
			if(sel == 1 || sel == 2 || sel == 3)
			{
				switch(sel)
				{
				case 1:
					Bread+=1;
					balance -= 200;
					System.out.println("빵을 구입했습니다.");
					System.out.println("남은 잔고: "+balance);
					break;
				case 2: 
					Cider+=1;
					balance -= 100;
					System.out.println("사이다을 구입했습니다.");
					System.out.println("남은 잔고: "+balance);
					break;
				case 3: 
					Coffee+=1;
					balance -= 120;
					System.out.println("커피를 구입했습니다.");
					System.out.println("남은 잔고: "+balance);
					break;
				}
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			}
			
			System.out.printf("---------------------------------------------\n\n");
	}
	}

}