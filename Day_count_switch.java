package build02;
import java.util.Scanner;
public class Day_count_switch
{
	public static void main(String[] args) 
	{
		// 한달 30일, 1월1일부터 4/13까지 몇일 살았나
		int count = 0;
		int month = 4, day = 13;
		switch(month)
		{
		case 12:
			count += 31;
		case 11:
			count += 30;
		case 10:
			count += 31;
		case 9:
			count += 30;
		case 8:
			count += 31;
		case 7:
			count += 31;
		case 6:
			count += 30;
		case 5:
			count += 31;
		case 4:
			count += 30;
		case 3:
			count += 31;
		case 2:
			count += 28;
		default:
			System.out.printf("%d월 %d일까지는 총", month, day);
			System.out.println((count+day)+ "일 입니다.");
			break;
			
		}
	}
   }

