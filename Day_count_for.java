package build02;
import java.util.Scanner;
public class Day_count_for 
{
	public static void main(String[] args) 
	{
		// 한달 30일, 1월1일부터 4/13까지 몇일 살았나
		int count = 0;
		
		for(int i =0 + 1; i <13; i++)
		{
			for(int t = 0 + 1; t < 31; t++)
			{
				count +=1;
				if(i == 4 && t == 13)
				{
					System.out.printf("%d월 %d일\n", i, t);
					System.out.printf("day = %d", count);
					break;
				}
			}
		}
		
		
	}
}
