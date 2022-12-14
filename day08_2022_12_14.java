package day08;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.GregorianCalendar;
public class day08_2022_12_14 
{
	public static void main(String args[])
	{
		class01 c1 = new class01();
		//System.out.println(c1.TrueFalse("17"));
		//System.out.println(c1.StringLength(c1.quote));
		//System.out.println(c1.BoolMaleFemale("Female"));
		//System.out.println(c1.PrintingReport()+c1.underLine);
		//c1.getPrice();
		c1.getAgeSexfromID();
	}
}
class class01
{
	Scanner sc = new Scanner(System.in); // for numbers
	Scanner tc = new Scanner(System.in); // for texts
	GregorianCalendar calendar = new GregorianCalendar();
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	boolean ab;
	int num1, num2, sLength, kor, eng, math, sbCount, product1, product2, product3, product4,count;
	double tot, avrg;
	String bool, result, quote, quote2, name, grade, underLine, sel, answer;
	class01()
	{
		quote="Definition of insanity is doing the same thing\nover and over expecting different result.";
		quote2="Short text";
		num1 = 0;
		sLength=0;
		num2 = 5; // Target of comparation
		name = "김광석";
		kor=0;
		eng=0;
		math=0;
		sbCount = 3;
		tot=0.0;
		avrg=0.0;
		underLine = "\n------------------------------------------------------\n";
		product1=2000;
		product2=5500;
		product3=1500;
		product4=1000;
		answer = " ";
		count=0;
	}
	String TrueFalse(String a)
	{
		num1=Integer.parseInt(a);
		ab = num1 > num2; // 17 > 5
		if(ab == true)
		{
			bool = "True";
			System.out.println(num1+" is "+" bigger than "+num2);
			System.out.print("Result: ");
			return bool;
		}
		else
		{
			bool = "False";
			System.out.println(num1+" is "+" bigger than "+num2);
			System.out.print("Result: "+ab);
			return bool;
		}
	}
	String StringLength(String sentnce)
	{
		// 문자열을 입력받아서 길이를 구해서 길이가 10보다 작으면 true, 10자 초과면 false 리턴
		// 10 이하일시 "짧은 문자열" 출력 10 초과시 "장문" 출력
		sLength=sentnce.length();
		if(sLength > 10)
		{
			System.out.println("Target text: "+quote);
			ab = sLength <= 10;
			System.out.println("\nLength of the sentence is "+sLength+", it is long.");
			bool = Boolean.toString(ab);
			System.out.print("Value: ");
			return bool;
		}
		else
		{
			System.out.println("Target text: "+quote2);
			ab = sLength <= 10;
			System.out.println("\nLength of the sentence is "+sLength+", it is less or equal of 10.");
			bool = Boolean.toString(ab);
			System.out.print("Value: ");
			return bool;
		}
	}
	String BoolMaleFemale(String bln)
	{
		// 논리값을 전달하여 true >> 남자 false >> 여자
		if(bln.equals("Male"))
		{
			System.out.println("입력받은 값: "+bln+"\nResult: ");
			ab = true;
			bln = Boolean.toString(ab);
			return bln;
		}
		else
		{
			System.out.print("입력받은 값: "+bln+"\nResult: ");
			ab = false;
			bln = Boolean.toString(ab);
			return bln;
		}
	}
	String PrintingReport()
	{
		// 이름, 국어, 영어, 수학을 입력받아 총점, 평균, 학점 출력
		System.out.print("이름을 입력하세요: ");
		name = tc.nextLine();
		System.out.print("국어 점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = sc.nextInt();
		tot = (double)kor+eng+math;
		avrg = tot / sbCount;
		System.out.println(underLine);
		System.out.println("[Result]\n");
		System.out.println("Name: "+name);
		System.out.println("Your score for each subject: "+kor+("(Korean) | ")+
				eng+("(English) | "+math+("(Mathematics) ")));
		System.out.printf("Your total score: %.0f\n",tot);
		System.out.printf("Your average score: %.2f\n",avrg);
		System.out.print("Your grade: ");
		if(avrg >= 90 && avrg <= 100)
		{
			grade = "A";
			return grade;
		}
		else if(avrg >= 80 && avrg < 90)
		{
			grade = "B";
			return grade;
		}
		else if(avrg >= 70 && avrg < 80)
		{
			grade = "C";
			return grade;
		}
		else if(avrg >= 60 && avrg < 70)
		{
			grade = "D";
			return grade;
		}
		else if(avrg < 60)
		{
			grade = "F";
			return grade;
		}
		else
			return "You typed wrong range of grade, please try again.";
	}
	void getPrice()
	{
		int money=20000;
		int min=1000;
		// 상품명, 수량, 단가를 입력하여 금액을 구하는메소드 생성 | 금액=수량*단가
		while(true)
		{
			if(money < min)
			{
				System.out.println("\n잔고가 부족합니다. 계속하시겠습니까?");
				System.out.println("(현재 잔액: "+money+"원)");
				System.out.print("Yes / No: ");
				answer = tc.nextLine();
			}
			if(answer.equals("NO") || answer.equals("no") || answer.equals("No")
					|| answer.equals("N") || answer.equals("n"))
			{
				LOG.log(Level.INFO, "종료되었습니다.");
				tc.close();
				return;
			}
			else
			{
				for(;;)
				{
					if(count > 0)
					{
						System.out.println("\n계속해서 구입하시겠습니까?");
						System.out.println("(현재 잔액: "+money+"원)");
						System.out.print("Yes / No: ");
						answer = tc.nextLine();
						System.out.println();
					}
					if(answer.equals("NO") || answer.equals("no") || answer.equals("No")
							|| answer.equals("N") || answer.equals("n"))
					{
						LOG.log(Level.INFO, "종료되었습니다.");
						tc.close();
						return;
					}
					else
					{
						System.out.println("구입할 품목을 선택하여 주세요.");
						System.out.println("1. 감자칩 - 2,000원\n2. 도시락 - 5,500원\n3. 삼각김밥 - 1,500원\n4. 커피 - 1,000원\n");
						System.out.print("당신의 선택: ");
						sel = tc.nextLine();
							if(sel.equals("1")||sel.equals("감자칩"))
							{
								if(money >= product1)
								{
									System.out.println("\n메세지: 감자칩, 결제 완료되었습니다. 감사합니다.\n");
									money-=2000;
									System.out.println("현재 잔액: "+money+"원");
								}
								else
								{
									System.out.println("\n잔액이 부족하여 해당 품목은 구입하실 수 없습니다.");
									break;
								}
							}
							else if(sel.equals("2")||sel.equals("도시락"))
							{
								if(money >= product2)
								{
									System.out.println("\n메세지: 도시락, 결제 완료되었습니다. 감사합니다.\n");
									money-=5500;
									System.out.println("현재 잔액: "+money+"원");
								}
								else
								{
									System.out.println("\n잔액이 부족하여 해당 품목은 구입하실 수 없습니다.");
									break;
								}
							}
							else if(sel.equals("3")||sel.equals("삼각김밥"))
							{
								if(money >= product3)
								{
									System.out.println("\n메세지: 삼각김밥, 결제 완료되었습니다. 감사합니다.\n");
									money-=1500;
									System.out.println("현재 잔액: "+money+"원");
								}
								else
								{
									System.out.println("\n잔액이 부족하여 해당 품목은 구입하실 수 없습니다.");
									break;
								}
							}
							else if(sel.equals("4")||sel.equals("커피") || sel.equals("Coffee") || sel.equals("coffee"))
							{
								if(money >= product4)
								{
									System.out.println("\n메세지: 커피, 결제 완료되었습니다. 감사합니다.\n");
									money-=1000;
									System.out.println("현재 잔액: "+money+"원");
								}
								else
								{
									System.out.println("\n잔액이 부족하여 해당 품목은 구입하실 수 없습니다.");
									break;
								}
							}
							else
								LOG.log(Level.INFO, "품목을 잘못 입력하셨습니다. 다시 입력해주세요.");		
					} // end of else
					count++;
				} // end of for(;;)
			}// end of else
		}// end of while(true)
	}// end of class
	void getAgeSexfromID()
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
    	System.out.println("cYear2Digits: "+cYear2Digits);
    	System.out.print("이름을 입력해주세요: ");
    	name=sc.nextLine();
    	System.out.print("주민번호 앞자리를 입력해주세요: ");
    	socialN01=sc.nextLine();
    	System.out.print("주민번호 뒷자리를 입력해주세요: ");
    	socialN02=sc.nextLine();
    	birth2Digits=Integer.parseInt(socialN01.substring(0,2));
    	SEX=Integer.parseInt(socialN02.substring(0,1));
    	System.out.println("\n\n\n");
    	if(Integer.parseInt(socialN01)/1000000 > 1 || Integer.parseInt(socialN02)/1000000 > 1)
    	{
    		LOG.log(Level.INFO, "You've typed wrong digits of registration numbers."
    				+ "\nPlease try again.");
    	}
    	else
    	{
	    		if(birth2Digits < 100 && birth2Digits > cYear2Digits) // 1923~1999년생
		    	{
		    		birthYear = birth2Digits+1900;
		    		age=currentYear-birthYear;	
		    	}
	    		else if(birth2Digits >= 0 && birth2Digits <= cYear2Digits) // 2000~2022년생
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
