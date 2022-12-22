// 아래 모든 코드는 직접 작성했으며, 2022-12-22 일자에 Izen Academy 시험에 참고하기 위해 직접 데스크탑과 Eclipse를 이용하여 작성한 코드입니다.
package day14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class TEST_20221223
{
	public static void main(String args[])
	{
		TDAO1 t1 = new TDAO1();
		TDAO2 t2 = new TDAO2();
		TDAO3 t3 = new TDAO3();
		TDAO4 t4 = new TDAO4();
		TDAO5 t5 = new TDAO5();
		//t1.Out();
		//t2.Out();
		//t3.Out();
		//t4.Out();
		//t5.Out();
	}
}
class TDAO1 extends TDTO1 implements IOStream
{
	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		sum=0;
			for(int i=1;i<=100;i++)
			{
				if(i%6==0)
					System.out.println();
				setSum(i+sum);
				System.out.printf("%d ",getSum());
				}
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		System.out.println(ln+"1부터 100까지의 총 합: "+getSum()+ln);
	}
	
}
class TDAO2 extends TDTO2 implements IOStream, Scanf
{

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		setNum(scInt("수를 입력하세요"));
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		if(getNum()%2==0)
		{
			setIsEven(true);
			System.out.println(ln+"짝수? "+getIsEven()+ln);
			System.out.println("입력하신 수는 "+getNum()+" 이며, 짝수입니다.");
		}
		else
		{
			setIsEven(false);
			System.out.println("짝수? "+getIsEven());
			System.out.println("입력하신 수는 "+getNum()+" 이며, 홀수입니다.");
		}
	}
	
}
class TDAO3 extends TDTO3 implements IOStream, Scanf
{

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		setName(scStr("이름을 입력하세요"));
		setLoopCount(scInt("반복할 횟수를 입력하세요"));
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		for(int i=0;i<getLoopCount();i++)
		{
			if(i%6==0)
				System.out.println();
			System.out.print(getName()+" "+(i+1)+"  ");
		}
		System.out.println(ln+"반복이 완료되었습니다. 종료합니다."+ln);
		System.exit(0);
	}
	
}
class TDAO4 extends TDTO4 implements IOStream
{
	ArrayList<TDTO4> list = new ArrayList<TDTO4>();
	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		/*
		NAME1095100077
		NAME2088065096
		NAME3075097100
		 * */
		try
		{
			FileReader file = new FileReader("C:/Data/20221223.txt");
			BufferedReader bf = new BufferedReader(file);
			while(true)
			{
				TDTO4 dat = new TDTO4();
				String str=bf.readLine();
				if(str==null)
				{
					bf.close();
					break;
				}
				dat.setName(str.substring(0,5));
				dat.setKor(Integer.parseInt(str.substring(6,8)));
				dat.setEng(Integer.parseInt(str.substring(8,11)));
				dat.setMath(Integer.parseInt(str.substring(11,14)));
				dat.setTot((double)dat.kor+(double)dat.eng+(double)dat.math);
				dat.setAvrg(dat.tot/3);
				if(dat.avrg >= 90 && dat.avrg<= 100)
				{
					dat.setGrade("A");
				}
				else if(dat.avrg >= 80 && dat.avrg< 90)
				{
					dat.setGrade("B");
				}
				else if(dat.avrg >= 70 && dat.avrg< 80)
				{
					dat.setGrade("C");
				}
				else if(dat.avrg>= 60 && dat.avrg< 70)
				{
					dat.setGrade("D");
				}
				else if(dat.avrg< 60)
				{
					dat.setGrade("F");
				}
				else
					dat.setGrade(null);
				list.add(dat);
			}
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		System.out.print(ln);
		System.out.printf("  이름\t국어  영어  수학  총점  평균\t학점");
		System.out.print(ln);
		for(TDTO4 a:list)
		{
			System.out.printf("%s\t%d\t%d\t%d\t%.0f\t%.2f\t%s\n",a.getName(),a.getKor(),a.getEng(),a.getMath(),a.getTot(),a.getAvrg(),a.getGrade());
		}
	}	
}
class TDAO5 extends TDTO5 implements IOStream, Scanf
{

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		setId(scStr("ID를 입력"));
		setPw(scStr("PW를 입력"));
		setAddress(scStr("주소를 입력"));
		phone[0] = scStr("전화번호 첫번째 자리 입력");
		phone[1] = scStr("전화번호 두번째 자리 입력");
		phone[2] = scStr("전화번호 세번째 자리 입력");
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		try
		{
			System.out.print(ln);
			System.out.print("[결과]"+ln);
			System.out.println("ID: "+getId());
			System.out.println("PW: "+getPw());
			System.out.println("주소: "+getAddress());
			System.out.printf("전화번호: %s-%s-%s\n",phone[0],phone[1],phone[2]);
			System.out.print(ln);
		}catch(NullPointerException e)
		{
			System.out.println("예외: 값이 Null인 주소의 데이터를 참조할 수 없습니다.");
			e.printStackTrace();
		}
	}
	
}
class TDTO1
{
	public int num, sum;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
class TDTO2
{
	public int num; public Boolean isEven;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Boolean getIsEven() {
		return isEven;
	}
	public void setIsEven(Boolean isEven) {
		this.isEven = isEven;
	}
}
class TDTO3
{
	public String name; public int loopCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoopCount() {
		return loopCount;
	}
	public void setLoopCount(int loopCount) {
		this.loopCount = loopCount;
	}
}
class TDTO4
{
	public String name,grade; 
	public int kor,eng,math;
	public double tot,avrg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public double getAvrg() {
		return avrg;
	}
	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}
}
class TDTO5
{
	public String id,pw,address;
	public String phone[]  = {" "," "," "};
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
interface IOStream
{
	final String ln = "\n-----------------------------------------------------------------------------------\n";
	public void In();
	public void Out();
}
interface Scanf
{
	public int scInt(String text);
	public String scStr(String text);
}
