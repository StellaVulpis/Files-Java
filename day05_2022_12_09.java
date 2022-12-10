package day05;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;
import java.util.logging.Level;
public class day05_2022_12_09
{
	public static void main(String args[])
	{
		Test te = new Test();
		te.GetID();
		//te.stars();
	    //te.pyramidPractice();
		//te.score();
		//te.scoreWhile();
		//te.forWhile();
		//te.addNums();
		//te.onlyEven();
		//te.evenCount();
		//te.countSum();
		//te.Sum();
		//te.comparingNumbers();
		//te.twoNums();
		//te.doubleFor();
	}
}
class Test
{
	Scanner sc = new Scanner(System.in);
	GregorianCalendar calendar = new GregorianCalendar();
	Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	Test()
	{
		
	}
	void pyramidPractice()
	{
		// i = 3, a = 11, b = (i*2)-1
		// Max loop range will be shorter every time it is excuted(A/B).

		System.out.printf("\n\n\n\n");
		for(int i = 1; i<=5;i++) // size
		{
			// Start of triangle | 1 3 5 7 9

			for(int a=1; a<=11-(i*2); a++) // margin-left, spaces | big num >> small num
					System.out.print(" ");
			for(int b=1;b<=(i*2)-1;b++) // Pyramid | small num >> big num
					System.out.print(" *");

			// Start of reverse triangle right after the triangle | 9 7 5 3 1
			// *의 시작포인트에서 9개로 시작을 해야함.
			
		System.out.println();
		}
		for(int j=1;j<=5;j++)
		{
			for(int d=1;d<=(j*2)+1;d++)
				System.out.print(" ");
			for(int c=1;c<=9-(j*2);c++)
				System.out.print(" *");
			
		System.out.println();
		}
	}	
    void score()
	{
		// 학점을 입력해서 A->
		String msgA = "You did perfect!!";
		String msgB = "You did very good. :)";
		String msgGrdMismatchException = "Grade you entered was incorrect, try again.";
		char grd;
		for(int i = 0; i<5;i++)
		{
		System.out.print("학점을 입력하세요: ");
		grd = sc.next().charAt(0);
		if(grd == 'A' || grd == 'a')
			System.out.println(msgA);
		else if(grd == 'B' || grd == 'b')
			System.out.println(msgB);
		else
			System.out.println(msgGrdMismatchException);
		}
	}
    void scoreWhile()
	{
		String msgA = "You did perfect!!";
		String msgB = "You did very good. :)";
		String msgGrdMismatchException = "Grade you entered was incorrect, try again.";
		String grd;
		int count = 0;
		while(true)
		{
			if(count > 0)
			{
				System.out.println("-------------------------------------\n");
				System.out.printf("Do you want to exit?\n");
				System.out.println("Type [Y / N] or 'exit' to exit.");
				System.out.println("\n-------------------------------------");
			}
			System.out.print("Enter your grade: ");
			grd = sc.nextLine();		
				if(grd.equals("exit")||grd.equals("EXIT")||grd.equals("Exit")||
						grd.equals("y")||grd.equals("Y"))
				{
					System.out.println("Program was terminated, Goodbye!");
					sc.close(); // If it is infinite loop, you should only close Scanner 
								//	under specific condition of program termination in loop.
					return;
				}
				else
				{
					if(grd.equals("A") || grd.equals("a"))
						System.out.println(msgA);
					else if(grd.equals("B") || grd.equals("b"))
						System.out.println(msgB);
					else
							System.out.println(msgGrdMismatchException);
				}
		++count;
		}
	}
    void forWhile()
    {
    	int l=0, L = 0, Ll = 0;
    	System.out.print("For loop: ");
    	for(int i=0;i<5;i++)
    		System.out.printf("%d ",i+1);
    	System.out.println();
    	System.out.print("While loop: ");
    	while(l<5)
    	{
    		System.out.printf("%d ", l+1);
    		l++;
    	}
    	System.out.println();
    	System.out.print("For infinite loop: ");
    	// For Infinite Loop
    	for(;;)
    	{
    	if(L==5)
    		break;
    	System.out.printf("%d ",L+1);
    	L++;
    	}
    	System.out.println();
    	// While Infinite Loop
    	System.out.print("While infinite loop: ");
    	while(true)
    	{
    		if(Ll==5)
    		return;
    		System.out.printf("%d ",Ll+1);
    		Ll++;
    	}
    }
    void addNums()
    {	
    	int sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		sum+=i;
    		if(i<10)
    			System.out.print(i+" + ");
    		else
    			System.out.print(i+" = "+sum);
    	}
    }
    void onlyEven()
    {
    	int odd[] = new int[16];
    	System.out.print("1~16 짝수만 출력: ");
    	
    	for(int i=1;i<=16;i++)
    	{
    		if(i%2==0)
    			System.out.print((i)+" ");
    		else if(i%2==1)
    			odd[i] += i;
    	}
    	System.out.println();
    	System.out.print("홀수(배열): ");
    	for(int t = 1;t<=16;t++)
    	{
    		if(t%2==1)
    			System.out.print(odd[t]+" ");
    	}
    	System.out.println();
    }
    void evenCount()
    {
    	// 1~16까지에서 짝수의 갯수 count, 1씩 증가
    	int count = 0;
    	System.out.print("짝수: ");
    	for(int i = 1;i<16;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.print(i+" ");
    			count+=1;
    		}
    	}
    	System.out.println("짝수의 갯수: "+count);
    }
    void countSum()
    {
    	int count=0, sum = 0;
    	// 1-100까지의 홀수의 갯수와 그 수들의 합을 구하시오
    	for(int i =1;i<100;i++)
    	{
    		if(i%2==1)
    		{
    			count+=1;
    			sum+=i;
    		}
    	}
    	System.out.println("홀수의 합: "+sum);
    	System.out.println("홀수의 갯수: "+count);
    }
    void Sum()
    {
    	// 1-100까지에서의 합, 그 합이 3000을 넘는 최초의 수를 구하시오
    	int sum = 0;
    	for(int i=1;i<=100;i++)
    	{
    		sum+=i;
    		if(sum >= 3000)
    		{
    			System.out.println("반복 횟수에서 1~100의 합이 3000을 넘는건 "+i+"번째 입니다.");
    			break;
    		}
    	}
    	System.out.println("전체 합: "+sum);
    }
    void comparingNumbers()
    {
    	// 두 수를 입력받아 큰 수, 작은 수를 출력
    	int n01=0, n02=0;
    	System.out.print("비교할 첫번째 수를 입력하세요: ");
    	n01=sc.nextInt();
    	System.out.print("비교할 두번째 수를 입력하세요: ");
    	n02=sc.nextInt();
    	System.out.println("-------------------------------");
    	System.out.println("[결과]\n");
    	if(n01 > n02)
    	{
    		System.out.println("첫번째 수가 두번째 수보다 큽니다.\n");
    		System.out.println("입력받은 수: "+n01+" | "+n02);
    	}
    	else
    	{
    		System.out.println("두번째 수가 첫번째 수보다 큽니다.\n");
    		System.out.println("입력받은 수: "+n01+" | "+n02);
    	}
    }
    void twoNums()
    {
    	// 두 수를 입력받아 몫과 나머지를 구하는 프로그램을 작성하시오
    	int num1=0, num2=0, quo=0, remain=0;
    	double result=0.00;
    	System.out.print("첫번째 수: ");
    	num1=sc.nextInt();
    	System.out.print("두번째 수: ");
    	num2=sc.nextInt();
    	result=(double)num1/(double)num2;
    	quo=(int)result;
    	remain=num1%num2;
    	System.out.println("첫 번째 수("+num1+")와 두번째 수("+num2+")의 나눈 값은 "+result+" 입니다.");
    	System.out.println("몫은 "+quo+"이며 나머지는 "+remain+" 입니다.");
    }
    void doubleFor()
    {
    	System.out.println("Double for statement is basically same as two dimensional array.\n");
    	for(int a=1;a<=5;a++)
    	{
    		System.out.print(a+" ");
    		for(int b=1;b<=5;b++)
    			System.out.print(b+" ");
    	}
    	// 1 2 3 4 5 | 6 7 8 9 10 | 11 12 13 14 15 >> 25
    	int loop=0;
    	System.out.println("\n\n");
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=5;j++) // 1, 1 2, 1 2 3
    		{
    			loop++;
    			if(loop <= 10)
    				System.out.print(loop+"  ");
    			else
    				System.out.print(loop+" ");
    		}
    		System.out.println();
    	}
    }
    void stars()
    { // 종결값을 1차 반복문으로 하는 이유: 매번 반복할 때 마다 특정 조건에 따라서 최댓값을 그때그때 줄이거나 늘리기 위해서이다. (가감식으론 불가능.)
    	System.out.println("(1)");
    	// 1개씩 감소/증가하는 5줄 높이 반삼각형(우측)
    	for(int i=1;i<=5;i++)
    	{
    		for(int a=1;a<=i;a++)
    			System.out.print("*");
    		System.out.println("\n");
    	}
    	System.out.println("\n\n");
    	// 1개씩 감소/증가하는 5줄 높이 반삼각형(좌측)
    	System.out.println("(2)");
    	for(int i2=1;i2<=5;i2++)
    	{
    		for(int b=1;b<=6-i2;b++) // 54321
    			System.out.print(" ");
    		for(int b2=1;b2<=i2;b2++) // 12345
    			System.out.print("*");
    		System.out.println("\n");
    	}
    	System.out.println("\n\n");
    	// 1개씩 감소/증가하는 5줄높이 역반삼각형(우측)
    	System.out.println("(3)");
    	for(int i3=1;i3<=5;i3++)
    	{
    		for(int c=1;c<=i3;c++) // 
    			System.out.print(" ");
    		for(int c2=1;c2<=6-i3;c2++) // 종결조건은 처음부터 마지막 반복까지 전부 사용되므로 처음값과 종결값을 미리 생각하고 사용해야 한다.
    			System.out.print("*");
    		System.out.println("\n");
    	}
    	System.out.println("\n\n");
    	// 1개씩 감소/증가하는 5줄높이 역반삼각형(좌측) | 별 >> 공백 순서
    	for(int i4=1;i4<=5;i4++)
    	{
    		for(int d=1; d<=6-i4;d++)
    			System.out.print("*");
    		System.out.println("\n");
    	}	
    }
    void GetID()
    {
    	// 이름, 주민번호로 나이, 성별 구하기
    	int age=0, birth2Digits=0, birthYear=0,SEX=0,
    			currentYear=calendar.get(Calendar.YEAR),
    			cYear2Digits=currentYear-2000; // 2022
    	//int nextGen = (2000-calendar.get(Calendar.YEAR))*(-1); 
    	// => 22, for the generations born after 2000 year.
    	// 자릿수 구하기: 해당 자릿수의 1의 배수(1/10/100/1000)으로 나눠서 1.0을 넘지 않으면 그 자릿수이다.
    	// 예시: 971127 / 1000000 >> 0.97 - 6자리수
    	String name="NAME", sex="sex";
    	String socialN01="991234", socialN02="1234567"; // 991234-1234567
    	System.out.println("birth2Digits: "+cYear2Digits);
    	System.out.print("Enter your name: ");
    	name=sc.nextLine();
    	System.out.print("Please type first 6 digits of Social Security number: ");
    	socialN01=sc.nextLine();
    	System.out.print("Please type last 7 digits of Social Security number: ");
    	socialN02=sc.nextLine();
    	birth2Digits=Integer.parseInt(socialN01.substring(0,2));
    	SEX=Integer.parseInt(socialN02.substring(0,1));
    	System.out.println("\n\n\n");
    	if(Integer.parseInt(socialN01)/1000000 >= 1 || Integer.parseInt(socialN02)/10000000 >= 1)
    	{
    		LOG.log(Level.INFO, "You've typed too long digits of Social Secirity numbers."
    				+ "\nPlease try again.");
    	}
    	else if(SEX > 4 || SEX < 0)
    	{
    		LOG.log(Level.INFO, "The first digit of last 7 digits you've entered was incorrect format,"
			+"\nPlease type the numbers between 1 to 4.");
    	}
    	else
    	{
	    		if(birth2Digits > cYear2Digits)
		    	{
		    		birthYear = birth2Digits+1900;
		    		age=currentYear-birthYear;	
		    	}
// Skip persons who was born before 1922(Over 100 years old) due to the average life span.
		    	else if(birth2Digits <= cYear2Digits)
		    	{
		    		birthYear = birth2Digits+2000;
		    		age=currentYear-birthYear;
		    	}
		    	if(SEX%2==1)
		    		sex="Male";
		    	else
		    		sex="Female";
	    		
	    	System.out.println("--------------------------------------------------");
	    	System.out.println("\n[Result]\n");
	    	System.out.println("Your name: "+name);
	    	System.out.println("Your Social Security number: "+socialN01+" - "+socialN02);
	    	System.out.println("Your sex: " +sex);
	    	System.out.println("Your age: "+age+" years old\n");
	    	System.out.println("--------------------------------------------------");
	    	System.out.println("\n\nOkay, Goodbye!");
	    	sc.close();
    	}
    }
}
