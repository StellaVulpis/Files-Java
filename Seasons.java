package day04;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Seasons 
{
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) 
	{
		// 월을 입력받아 계절을 출력(12/1/2 >> 겨울입니다, 3/4/5 >> 봄입니다 ...
		// 1~12 범위 초과시 에러 출력
		int currentSeason = 1;
		String userType = null;
		Scanner tc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type the month to calculate the season: ");
		currentSeason= sc.nextInt();
			switch(currentSeason)
			{
			case 1:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("겨울입니다.");
				break;
			case 2:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("겨울입니다.");
				break;
			case 3:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("봄입니다.");
				break;
			case 4:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("봄입니다.");
				break;
			case 5:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("봄입니다.");
				break;
			case 6:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("초여름입니다.");
				break;
			case 7:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("여름입니다.");
				break;
			case 8:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("여름입니다.");
				break;
			case 9:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("가을입니다.");
				break;
			case 10:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("가을입니다.");
				break;
			case 11:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("초겨울입니다.");
				break;
			case 12:
				System.out.println("현재 월: "+currentSeason+"월");
				System.out.println("겨울입니다.");
				break;
			default:
				LOG.log(Level.INFO, "Please type correct month, System was terminated.");
				sc.close();
				return;
			}
	}
}
