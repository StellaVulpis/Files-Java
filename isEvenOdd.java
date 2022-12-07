package day03;
import java.util.logging.Logger;
import java.util.logging.Level;
public class isEvenOdd 
{
	public final static Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) 
	{
		int num = 37585;
		String isEvenOdd;
		String isMultipleofFive;
		String isPass;
		// 짝수 홀수 판별
		if(num % 2 == 0)
			isEvenOdd = "짝수입니다.";
		else
			isEvenOdd = "홀수입니다.";
		System.out.println(isEvenOdd);
		// 어떤 수를 입력하여 그 수가 5의 배수인지를 판별
		if(num % 5 == 0)
			isMultipleofFive = "5의 배수입니다.";
		else
			isMultipleofFive = "5의 배수가 아닙니다.";
		System.out.println(isMultipleofFive);
		System.out.println();
		// 필기점수와 실기점수를 입력받아 평균이 85 이상이면 "합격", 아니면 "불합격"
		int writtenScore = 85, performScore = 92;
		double avrg = (double)(writtenScore+performScore)/2;
		System.out.println("[정보처리산업기사 필기/실기 시험 평균점 기반 합격 여부 조회 결과]");
		System.out.print("귀하는 시험에 ");
		if(avrg >= 85 && writtenScore >= 80 && performScore >= 80)
		// && and , || or , ! not
			System.out.print("'합격'");
		else
			System.out.print("'불합격'");
		System.out.println(" 하셨습니다.");
		System.out.println("시험 평균 점수: "+avrg+"점");
		System.out.println("필기 점수: "+writtenScore);
		System.out.println("실기 점수: "+performScore);
		System.out.println();
		System.out.println();
		// 필기점수와 실기점수 두개 중 하나가 90 이상이면 합격, 아니면 불합격
		if(writtenScore >= 90 || performScore >= 90)
			isPass = "합격";
		else if(writtenScore >= 90 && performScore >= 90)
			isPass = "불합격";
		else
			isPass = "불합격";
		System.out.println("필기/실기 둘 중 하나가 합격이면 합격,\n아니면 불합격, 둘 다 합격이면 불합격.\n");
		System.out.println("결과: "+isPass+"\n");
		// ------------------------프로그램 종료 로그출력 해보기--------------------------------
		LOG.log(Level.INFO, "Program is terminated.");
	}
}
