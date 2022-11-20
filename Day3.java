package build02;

public class Day3 
{
	public static void main (String[] args)
	{
	char unicode = 65; //ASCII 'A'
	System.out.printf("%c\n", unicode);
	char alpha = 'A'; // ASCII 65
	System.out.printf("Ascii val = %d\n\n", (int)alpha); 
	//char형의 문자를 아스키로 출력하기 위해 int형으로 형변환을 해준다.
	
	int age = 20;
	double kg = 49.9;
	System.out.printf("나이%d + 몸무게%.1f == %d\n",age,  kg, age + (int)kg);
	System.out.printf("나이%d + 몸무게%.1f == %.1f", age, kg, (double)age + kg);
	
	}
}
