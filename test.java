package day04;

import java.util.logging.Logger;
import java.util.logging.Level;
public class test 
{
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String args[])
	{
	// 100부터 59 이하까지 A~F학점 출력
		double avrg = 72.6666;	
		if(avrg >= 90.00 && avrg < 100.00)
				System.out.println("학점: A");
		else if(avrg >= 80.00 && avrg < 90.00)
				System.out.println("학점: B");
		else if(avrg >= 70.00 && avrg < 80.00)
				System.out.println("학점: C");
		else if(avrg >= 60.00 && avrg < 70.00)
				System.out.println("학점: D");
		else if(avrg < 60)
			System.out.println("학점: F");
		else // Below the score of 60
		{
			LOG.log(Level.INFO, "Grade is out of range(A~F), System was terminated.");
			return;
		}
	System.out.println();
	// 수를 입력받아 양수, 음수 판별 (삼항 연산자)
	int num = 50;
	boolean isPositive;
	String NP = (num >= 0) ? "양수":"음수";
	isPositive = (num >= 0) ? true : false;
	System.out.println("입력받은 숫자는 "+NP+" 입니다. "+isPositive);
	}		
}
