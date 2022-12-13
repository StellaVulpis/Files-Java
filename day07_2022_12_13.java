package day07;
import java.util.Scanner;
public class day07_2022_12_13 
{
	public static void main(String[] args) 
	{
		Method1 mthd = new Method1();
		Score scr = new Score();
		//innerMthd();
		//mthd1.outerMthd();
		//mthd1.name();
		//mthd.THIS();
		//mthd.space();
		//int sum = mthd.add();
		//System.out.println("Sum of a+b+c: "+sum);
		//String lunch = mthd.lunch();
		//mthd.printStr(lunch);
		//mthd.space();
		//mthd.printInt(mthd.num);
		//mthd.space();
		//mthd.space();
		//mthd.printStr("특정 메소드한테 이름을 넘겨받아서 5번 출력\n\n");
		//for(int i=0;i<5;i++)
			//mthd.printStr(mthd.name+"\n");
		//mthd.space();
		//mthd.plainMethod();
		//mthd.space();
		//mthd.printChar(mthd.Char); // only get char type of values.
		//mthd.space();
		//mthd.printDouble(mthd.dnum); // only get double type of values.
		//mthd.space();
		//mthd.space();
		//  1. 인수가 없고 리턴값 없음
		//mthd.test1();
		//  2. 인수가 있고 리턴값 없음
		//String test2Text = "2. No return value, Yes Parameter";
		//mthd.test2(test2Text);
		//  3. 인수가 없고 리턴값 있음
		//String test3 = mthd.test3();
		//mthd.printStr(test3);
		// 4. 인수가 있고 리턴값도 있음
		//mthd.printStr(mthd.test4(null));
		//--------------------------------------
		//scr.scoreCalc();
		//scr.scorePrint();
		//mthd.shareRemain();
		//mthd.smallBig();
		//mthd.IDPW();
		//mthd.printStr("이름은 "+mthd.name);
		//mthd.getSum(26, 77);
		//System.out.println("Second sum: "+mthd.getSum2());
		//mthd.getFavMountains();
		//mthd.printStr(mthd.favMtn());
		//mthd.printStr("입니다.");
		//mthd.comparingNum();
		//mthd.strLength("The Good Place was very interesting drama to watch on Netflix.");
		//mthd.howisMyScore();
		//mthd.returnMthd(-22);
		// ▼ Executing method and printing returned result at the same time. ▼
		//System.out.println("Bigger number: "+mthd.returningBiggerNum(1));
		System.out.println("Result: "+mthd.returningOddEven(94)); 
		//----------------------------------------------------------------------
	}
	public static void innerMthd()
	{
		System.out.println("Class1\n{\npublic static void main(String args[])\n{\n\n}\n\t"
				+ "I am inner method of the class.\n}");
	}
}
class Score
{
	ScoreVars scv = new ScoreVars();
	void scoreCalc()
	{
		scv.total = (double)(scv.kor+scv.eng+scv.math+scv.french+scv.history);
		scv.average = (double)(scv.total / scv.sbjCount);
		if(scv.average >= 90)
			scv.grd = 'A';
		else if(scv.average >= 80 && scv.average < 90)
			scv.grd = 'B';
		else if(scv.average >= 70 && scv.average < 80)
			scv.grd = 'C';
		else if(scv.average >= 60 && scv.average < 70)
			scv.grd = 'D';
		else
			scv.grd = 'F';
	}
	void scorePrint()
	{
		System.out.println("----------------------");
		System.out.println("Name: "+scv.name);
		System.out.println("----------------------");
		System.out.println("Korean: "+scv.kor);
		System.out.println("English: "+scv.eng);
		System.out.println("Math: "+scv.math);
		System.out.println("History: "+scv.history);
		System.out.println("----------------------");
		System.out.printf("Total Score: %.0f\n",scv.total);
		System.out.printf("Average Score: %.1f\n", scv.average);
		System.out.println("Grade: "+scv.grd);
		System.out.println("----------------------");
	}
}
class ScoreVars
{
	String name;
	char grd;
	int kor, eng, math, french, history, sbjCount;
	double total, average;
	ScoreVars()
	{
		name="Jordan";
		kor=85;
		eng=100;
		math=65;
		french=78;
		history=98;
		sbjCount=5;
		total=0.0;
		average=0.0;
	}
}
class Method1
{
	Scanner sc = new Scanner(System.in);
	Scanner tc = new Scanner(System.in);
	String var, name, sentence, ID, PW, favMountain, whichNum, Exit;
	int num, share, a, b, c, biggerNum, score;
	boolean isitPositive;
	double dnum, remainder, Num1, Num2, small, big;
	char Char = 'A';
	Method1()
	{
		var = "this.Variable: I am field variable and must be initialized in the constructor!";
		a=10; b=11; c=12;
		small = 0; big = 0;
		dnum = 4.8;
		name = "Jordan";
		num = 305;
		Num1 = 37;
		Num2 = 59;
		share = 0;
		remainder = 0.00;
		ID = "ABCDE";
		PW = "12345";
		biggerNum=0;
		score=0;
		Exit = " ";
	}
	void space()
	{
		System.out.println();
	}
	void outerMthd()
	{
		System.out.println("Class2\n{\n\tI am outer method of the class.\n}");
	}
	void name()
	{
		String Name = "Jordan";
		System.out.println(Name);
	}
	void THIS()
	{
		String var = "Variable: I am variable in the method! You should use 'this' "
				+ "method to call other me in the field!";
		System.out.println(this.var); // Calling field variable.
		System.out.println(var);
	}
	void printStr(String str) // Parameter; Getting String type of value and returning it.
	{
		System.out.print(str);
	}
	void printInt(int num) // Parameter; Getting Integer type of value and returning it.
	{
		System.out.print(num);
	}
	void printDouble(double dnum)
	{
		System.out.print(dnum);
	}
	void printChar(char Char)
	{
		System.out.print(Char);
	}
	int add() // Returning sum of a+b+c
	{
		int result=this.a+this.b+this.c;
		return result; // Returned result will be the value of add() method.
	}
	String lunch()
	{
		String foods = "Spam, Noodle, Rice, Bread, Soup";
		return foods;
	}
	void plainMethod()
	{
		printStr("I am just a method.");
	}
	void test1()
	{
		System.out.println("1. No return value, no parameter.");
	}
	void test2(String param)
	{
		System.out.println(param);
	}
	String test3()
	{
		String text = "3. Yes return value, No parameter.";
		return text;
	}
	String test4(String param2)
	{
		param2 = "4. Yes return value, yes parameter";
		return param2;
	}
	void shareRemain()
	{
		if(Num1 > Num2)
		{
			big = Num1;
			small = Num2;
		}
		else
		{
			big = Num2;
			small = Num1;
		}
		share = (int)(big/small);
		remainder = big%small;
		System.out.println("Share: "+share);
		System.out.println("Remainder: "+remainder);
	}
	void smallBig()
	{
		// 두개의 수를 특정 메소드에 넘겨서 작은 수 큰 수 까지의 값을 구한다 
		// 시작점, 끝점이 있어야 되기에 반드시 비교할 수는 두개까지만 사용해야함.
		int a=100, b=17, smaller=0, bigger=0, sum=0;
		if(a > b)
		{
			bigger = a;
			smaller = b;
		}
		else
		{
			bigger = b;
			smaller = a;
		}
		for(int i = smaller; i<=bigger; i++)
			sum+=i;
		System.out.println("작은수: "+smaller+" | "+"큰 수: "+bigger);
		System.out.println("작은 수부터 큰 수까지의 합: "+sum);
	}
	void IDPW()
	{
		System.out.println("ID: "+ID);
		System.out.println("PW: "+PW);
	}
	void getSum(int n1, int n2)
	{
		int result=0;
		result=n1+n2;
		System.out.println("Sum: "+result);
	}
	int getSum2()
	{
		int n1 = 12, n2 = 22;
		int result = n1+n2;
		return result;
	}
	void getFavMountains()
	{
		System.out.print("가장 좋아하는 산을 입력하세요: ");
		this.favMountain = sc.nextLine();
		System.out.println("당신이 좋아하는 산은 "+this.favMountain+" 입니다.");
	}
	String favMtn()
	{
		System.out.print("가장 좋아하는 산을 입력하세요: ");
		this.favMountain = sc.nextLine();
		System.out.print("당신이 좋아하는 산은 ");
		return this.favMountain;
	}
	void favMtn3(String mtnName)
	{
		System.out.print("가장 좋아하는 산을 입력하세요: ");
		this.favMountain = sc.nextLine();
		System.out.println(mtnName);
	}
	void comparingNum()
	{
		int n1=22, n2=12;
		if(n1 > n2)
		{
			this.whichNum = "n1";
			this.biggerNum=n1;
			System.out.println("둘 중 큰 값은 "+whichNum+", "+biggerNum);
		}
		else
		{
			this.whichNum = "n2";
			this.biggerNum=n2;
			System.out.println("둘 중 큰 값은 "+whichNum+", "+biggerNum);
		}
	}
	void strLength(String stence)
	{
		System.out.println("입력한 문장: "+stence);
		int len = stence.length();
		System.out.println("입력하신 문장의 글자수는 ["+len+"] 입니다.");
	}
	void howisMyScore()
	{
		int count = 0;
		while(true)
		{
			if(count > 0)
			{
				System.out.println("Do you wish to continue?");
				System.out.print("\n(Y/N): ");
				Exit=tc.nextLine(); // NEVER USE SAME SCANNER WITH INT TYPE OF VARIABLES AND STRING TYPE OF VARIABLES.
				System.out.println();
			}
			if(Exit.equals("N") || Exit.equals("NO") || Exit.equals("no") 
					|| Exit.equals("n") || Exit.equals("No"))
			{
				System.out.println("Program was terminated.");
				return;
			}
			else
			{
				System.out.print("Enter Your Score: ");
				score = sc.nextInt();
				if(score >= 90 && score <= 100)
					System.out.println("Your Score: ["+score+"] \nPerfect!!!");
				else if(score >= 80 && score <= 90)
					System.out.println("Your Score: ["+score+"] \nGood!!!");
				else if(score >= 70 && score <= 80)
					System.out.println("Your Score: ["+score+"] \nNot Bad!");
				else if(score >= 60 && score <= 70)
					System.out.println("Your Score: ["+score+"] \nDid good, but you can do better, pal.");
				else if(score < 60)
					System.out.println("Your Score: ["+score+"] \nNot great, you difinitely need more practice.");
				else
					System.out.println("Your Score: ["+score+"] \nYou've typed wrong range of score, try again.");
			}
		count++;
		}
	}
	int returnMthd(int p)
	{
		System.out.println("The number you added to parameter is positive, returns 1 to boolean\n"
				+ "and if it is negative it returns 0 to boolean.\n\n");
		if(p >= 0)
		{
			System.out.println("Result: positive. Your number is ["+p+"].");
			System.out.println("Returning 1.");
			this.isitPositive = true;
			System.out.println("Is it positive(bool): "+isitPositive);
			return 1;
		}
		else
		{
			System.out.println("Result: negative. Your number is ["+p+"].");
			System.out.println("Returning 0.");
			this.isitPositive = false;
			System.out.println("Is it positive(bool): "+isitPositive);
			return 0;
		}
	}
	int returningBiggerNum(int NUM)
	{
		int a = 10; b = NUM;
		int BIG = a>b ? a:b; 
		System.out.println("Your number: "+NUM);
		System.out.print("Number you typed is ");
		if(a>b)
			System.out.println("Smaller than number a("+a+").");
		else
			System.out.println("Bigger than number a("+a+").");
		return BIG;
	}
	int returningOddEven(int sbjNumber)
	{
		//짝수이면 10을 더하고 홀수이면 1을 더하여 반환시킨다
		System.out.println("Your number: "+sbjNumber);
		if(sbjNumber%2==0)
		{
			sbjNumber+=10;
			System.out.println("\n>> ["+(sbjNumber-10)+"+10]\n");
			return sbjNumber;
		}
		else
		{
			sbjNumber+=1;
			System.out.println("\n>> ["+(sbjNumber-1)+"+1]\n");
			return sbjNumber;
		}
	}

}














