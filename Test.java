package day09;
import java.util.Scanner;
public class Test 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		//test00 t = new test00();
		//test00.SUM(12.7, 82.1); // If you set the methods() private, it only can be accessed in same class.
								// If it is private static, it should be called with original name of the class. (Calling in static way)
		//t.sum();
	}
	private int a,b,sum;
	String underLine;
	String t1, t2; Boolean t3; String fly; int t4; 
	String name, grd, note; int kor,eng,math,sbjC; double tot, avrg;
	public Test() // To use classes outside of the package or project, you must declare constructor() to public.
	{
		a=0; b=0;
		kor=0; eng =0; math=0; tot=0.0; avrg=0.0; sbjC=3;
		sum=0;
		underLine="------------------------------------------------------------------";
	}
	public void sum() // >> In case of methods() and variables, not like the constructor, 
					   // you can use them outside of package, Using setter and getter even if you set them as pravate.
	{
		// 두 수를 입력해서 합을 구한다
		System.out.print("First num: ");
		a=sc.nextInt();
		System.out.print("Second num: ");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of two numbers: "+sum);
	}
	protected static void SUM(double a, double b)
	{
		System.out.printf("%.2f\n",a+b);
	}
	// 정수/정수, 실수/정수, 정수/실수, 실수/실수를 하나의 메서드에 매개변수로 입력받을 수 있게 한다.
	// 메서드 오버라이딩
	void ovrSum(int p1, int p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (int, int)");
	}
	void ovrSum(double p1, double p2) 
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (double, double)");
	}
	void ovrSum(int p1, double p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (int, double)");
	}
	void ovrSum(double p1, int p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (double, int)");
	}
	void ovrSum(String p1, String p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (String, String)");
	}
	void ovrSum(String p1, int p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (String, int)");
	}
	void ovrSum(int p1, String p2)
	{
		System.out.println("입력한 값: "+p1+", "+p2+" (int, String)");
	}
	// 동물이름, 식성, 날 수 있다 없다 여부, 나이 >> true 날 수 있다, false 날 수 없다
	// 독수리, 육식, 날 수 있다, 2
	// 늑대, 육식, 날 수 없다, 4
	String flyornot()
	{
		if(t3 == true)
			return "날 수 있다";
		else
			return "날 수 없다";
	}
	void scanfAnimals()
	{
		String ans;
		System.out.print("종 이름을 입력하세요: ");
		t1=sc.nextLine();
		System.out.print("식성을 입력하세요: ");
		t2=sc.nextLine();
		System.out.println("해당 동물은 날 수 있습니까?");
		System.out.print("(예 / 아니오): ");
		ans=sc.nextLine();
		if(ans.equals("예"))
			t3=true;
		else
			t3=false;
		System.out.print("나이를 입력해주세요: ");
		t4=sc.nextInt();
		System.out.println(underLine);
	}
	void printAnimals()
	{
		fly = flyornot();
		System.out.println("Species\t식성\t비행가능 여부\t나이");
		System.out.println(underLine);
		System.out.printf("%s\t%s\t %s\t %d\n",t1,t2,fly,t4);
	}
	
	void getScore(String name, int kor, int eng, int math)
	{
		// 이름, 국영수 점수, 총점, 평균, 학점
		/*
		System.out.print("Name: ");
		name=sc.nextLine();
		System.out.print("Korean: ");
		kor=sc.nextInt();
		System.out.print("English: ");
		eng=sc.nextInt();
		System.out.print("Mathematics: ");
		math=sc.nextInt();
		*/
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	String printScore()
	{
		tot=(double)kor+eng+math;
		avrg=tot/sbjC;
		switch((int)avrg/10) 	// 100 >> 10 | 10 >> 1
		{
			case 10:			// Score: 100~90
			case 9:
					grd="A";
					break;
			case 8:				// Score: 80~89
					grd="B";
					break;
			case 7: 			// Score: 70~79
					grd="C";
					break;
			case 6: 			// Score: 60~69
					grd="D";	
					break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1: 
					grd="F";
					break;
			default:
				System.out.println("Wrong score, try again.");
		}
		if(avrg>=60&&avrg<=100)
			note="Note: You have passed the test.";
		else
			note="Note: You have failed the test, please attend to makeup test.\nThe date of retest will be announced.";
		/*
		if(avrg >= 90 && avrg <= 100)
			grd="A";
		else if(avrg >= 80 && avrg < 90)
			grd="B";
		else if(avrg >= 70 && avrg < 80)
			grd="C";
		else if(avrg >= 60 && avrg < 70)
			grd="D";
		else if(avrg < 60)
			grd="F";
		else
			System.out.println("Wrong score, try again.");
		*/
		System.out.println(underLine+"\n[Result]\n"+underLine);
		System.out.println("Name: "+name);
		System.out.println("Korean: "+kor);
		System.out.println("English: "+eng);
		System.out.println("Mathematics: "+math+"\n"+underLine);
		System.out.printf("Total score: %.0f\n",tot);
		System.out.printf("Average Score: %.2f\n",avrg);
		System.out.print("Grade: ");
		return grd;
	}
}
