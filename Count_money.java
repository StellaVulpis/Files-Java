package build02;

public class Count_money 
{
	public static void main(String [] args)
	{
	int n50k = 0, n10k = 0,  n1k = 0,  
			n100 = 0,  n10 = 0,n50 = 0, n1 = 0;
	int wallet = 67890, cycle = 0;
	System.out.printf("계산중입니다. . .\n\n");
	try // 1000당 1초 대기 함수
	{// 예외처리 발생 지역
		Thread.sleep(3000);
	}catch (InterruptedException e)
	{
		e.printStackTrace();
	} // 1000당 1초 대기 함수
	while(true)
	{
		if(wallet == 0)
			break;
	if(wallet >= 50000)
	{
		n50k += 1;
		wallet -= 50000;
	}
	
	else if(wallet >= 10000 && wallet < 50000)
	{
		n10k += 1;
		wallet -= 10000;
	}
	else if(wallet >= 1000 && wallet < 10000)
	{
		n1k += 1;
		wallet -= 1000;
	}
	else if(wallet >= 100 && wallet < 1000)
	{
		n100 += 1;
		wallet -= 100;
	}
	else if(wallet >= 50 && wallet < 100)
	{
		n50 += 1;
		wallet -= 50;
	}
	else if(wallet >= 10 && wallet < 50)
	{
		n10 += 1;
		wallet -= 10;
	}
	else if(wallet >= 1 && wallet < 10)
	{
		n1 += 1;
		wallet -= 1;
	}
	cycle++;
	}
	System.out.printf("5만원권은 %d장\n", n50k);
	System.out.printf("1만원권은 %d장\n", n10k);
	System.out.printf("1천원권은 %d장\n", n1k);
	System.out.printf("100원권은 %d개\n", n100);
	System.out.printf("50원권은  %d개\n", n50);
	System.out.printf("10원권은  %d개\n", n10);
	System.out.printf("1원권은   %d개\n", n1);
	}
}
