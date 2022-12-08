package day04;
import java.util.logging.Level;
import java.util.Scanner;
import java.util.logging.Logger;

public class Score_Switch 
{
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) 
	{
		// 학점(A-F)입력받아 A-> 우수 B->열심히 함 C->최선을 다함 D->더 노력할것 F->분발할 것
		// 학점 외의 문자 입력받으면 학점 입력 에러
		char grade = ' ';
		double avrg = 66.66666;
		String getS = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("학점을 입력 (INPUT T TO TERMINATE THE PROGRAM): ");
			grade = sc.next().charAt(0);
			switch(grade)
			{
			case 'A':
				// Type here
				break;
			case 'B':
				// Type here
				break;
			case 'C':
				// Type here
				break;
			case 'D':
				// Type here
				break;
			case 'E':
				// Type here
				break;
			case 'F':
				// Type here
				break;
			case 'T':
				LOG.log(Level.INFO, "System was terminated.");
				sc.close();
				return;
			case 't':
				LOG.log(Level.INFO, "System was terminated.");
				sc.close();
				return;
			}
		}
		// It is infinite loop, so you can't reach outside below the loop.
	}
	}

