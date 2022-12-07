package day03;
import java.lang.Math;
public class Random 
{
	public static void main(String args[])
	{
	// 1~6 사이의 난수 발생
	double n = 0.00;
	for(int i = 0; i<6;i++)
	{
		n = Math.random()*6;
		if(n > 6.00)
			n = n-(n-6.00);
		else if(n < 1.00)
			n = n+(n-1.00)*(-1);
		System.out.printf("%.2f\n", n);
	}
	}
}
