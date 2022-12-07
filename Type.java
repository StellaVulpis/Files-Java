package day01;
public class Type 
{
	public static void main(String[] args) 
	{
		int sum, avrg;
		double a=77.3, b=92.4, c= 48.6;
		sum = (int)a+(int)b+(int)c;
		avrg = ((int)a+(int)b+(int)c)/3;
		System.out.println("총점: " + sum + "점");
		System.out.println("평균 점수: " + avrg + "점");
	}
}
