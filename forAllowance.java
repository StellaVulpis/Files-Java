package day04;
import java.text.DecimalFormat;
public class forAllowance 
{
	public static void main(String[] args) 
	{	
		// 용돈을 받아서 많다 / 적다 / 적당하다
		DecimalFormat dc = new DecimalFormat("###,###,###");
		int allowance = 5845;
		int omanWon = 0, manWon = 0, ocheonWon = 0, cheonWon = 0, 
			obaekWon = 0, baekWon = 0, oshipWon = 0, shipWon = 0, ilWon = 0;
		if(allowance >= 30000)
			System.out.println("용돈이 많다. 받은 용돈: "+dc.format(allowance)+"원");
		else if(allowance >= 10000)
			System.out.println("용돈이 적당하다. 받은 용돈: "+dc.format(allowance)+"원");
		else if(allowance >= 5000)
			System.out.println("용돈을 받았다. 받은 용돈: "+dc.format(allowance)+"원");
		else if(allowance < 5000 && allowance >= 10)
			System.out.println("용돈이 너무 적다. 받은 용돈: "+dc.format(allowance)+"원");
		else 
			System.out.println("용돈을 받지 못했다.");
		System.out.println("------------------------------------------------------");
		System.out.println("[집계결과]");
		for(int i=allowance; i>=0; i--)
		{
			if(allowance >= 50000)
			{
				omanWon +=1;
				allowance -= 50000;
			}
			else if(allowance >= 10000)
			{
				manWon +=1;
				allowance -= 10000;
			}
			else if(allowance >= 5000)
			{
				ocheonWon +=1;
				allowance -= 5000;
			}
			else if(allowance >= 1000)
			{
				cheonWon +=1;
				allowance -= 1000;
			}
			else if(allowance >= 500)
			{
				obaekWon +=1;
				allowance -= 500;
			}
			else if(allowance >= 100)
			{
				baekWon +=1;
				allowance -= 100;
			}
			else if(allowance >= 50)
			{
				oshipWon +=1;
				allowance -= 50;
			}
			else if(allowance >= 10)
			{
				shipWon +=1;
				allowance -= 10;
			}
			else if(allowance >= 1)
			{
				ilWon +=1;
				allowance -= 1;
			}
		}
	if(omanWon>0)
	System.out.println("오만원권: "+omanWon+"장");
	if(manWon>0)
	System.out.println("만원권: "+manWon+"장");
	if(ocheonWon>0)
	System.out.println("오천원권: "+ocheonWon+"장");
	if(cheonWon>0)
	System.out.println("천원권: "+cheonWon+"장");
	if(obaekWon>0)
	System.out.println("오백원권: "+obaekWon+"장");
	if(baekWon>0)
	System.out.println("백원권: "+baekWon+"장");
	if(oshipWon>0)
	System.out.println("오십원권: "+oshipWon+"장");
	if(shipWon>0)
	System.out.println("십원권: "+shipWon+" 장");
	if(ilWon>0)
	System.out.println("일원권: "+ilWon+" 장");
	System.out.println("------------------------------------------------------");
	System.out.println("지페 잔액: "+dc.format(allowance)+"원");
	}	
}
