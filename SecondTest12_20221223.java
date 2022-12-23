package day15;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TEST2_20221223 implements line, Scanf
{
	public static void main(String args[])
	{
		TEST2_20221223 test = new TEST2_20221223();
		test.RUN_MENU_TEST01();
                //test.RUN_MENU_TEST02();
	}
	public void RUN_MENU_TEST01()
	{
		TDAO1 t1 = new TDAO1();
		String sel=" ";
		while(true)
		{
			System.out.print(ln+"선택해주세요.");
			System.out.println("1. 자료 입력\t2. 자료 출력\t3. 작업 종료"+ln);
			sel=scStr("당신의 선택");
			try
			{
				switch(sel)
				{
				case "1":
					t1.In();
					System.out.print(ln+"메세지: 자료 입력이 완료되었습니다."+ln);
					break;
				case "2":
					t1.Out();
					break;
				case "3":
					t1.Exit();
					break;
				}
			}catch(InputMismatchException e)
			{
				System.out.print(ln+"예외: 메뉴는 반드시 숫자로 선택해주세요."+ln);
				e.printStackTrace();
			}
		}
	}
	public void RUN_MENU_TEST02()
	{
		TDAO2 t2 = new TDAO2();
		String sel=" ";
		while(true)
		{
			System.out.print(ln+"선택해주세요.");
			System.out.print("1. 자료 입력\t2. 자료 출력\t3. 작업 종료"+ln);
			sel=scStr("당신의 선택");
			try
			{
				switch(sel)
				{
				case "1":
					t2.In();
					System.out.print(ln+"메세지: 자료 입력이 완료되었습니다."+ln);
					break;
				case "2":
					t2.Out();
					break;
				case "3":
					t2.Exit();
					break;
				}
			}catch(InputMismatchException e)
			{
				System.out.print(ln+"예외: 입력된 값이 잘못되었습니다. 다시 시도해주세요."+ln);
				e.printStackTrace();
			}
		}
	}
	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		System.out.print(text+": ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}

class TDAO1 extends TDTO1 implements IOStream, Scanf, line
{
	ArrayList<TDTO1> list = new ArrayList<TDTO1>();
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
			FileReader file = new FileReader("C:/Data/test01_20221223.txt");
			BufferedReader bf = new BufferedReader(file);
			while(true)
			{
				TDTO1 dat = new TDTO1();
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
		for(TDTO1 a:list)
		{
			System.out.printf("%s\t%d\t%d\t%d\t%.0f\t%.2f\t%s\n",a.getName(),a.getKor(),a.getEng(),a.getMath(),a.getTot(),a.getAvrg(),a.getGrade());
		}
	}
	@Override
	public int scInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String scStr(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Exit() 
	{
		// TODO Auto-generated method stub
		System.out.print(ln+"메세지: 프로그램을 종료합니다."+ln);
		System.exit(0);
	}	
}
class TDAO2 extends TDTO2 implements IOStream, Scanf, line
{
	ArrayList<TDTO2> list = new ArrayList<TDTO2>();

	
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
		try
		{
			/*
			 * 	ID: 0,7
				PW: 8,14
				Phone-1: 15,18
				Phone-2: 18,22
				Phone-3: 22,26
				SCNum-1: 27, 33
				SCNum-2: 34, 41
			 * */
			FileReader file = new FileReader("C:/Data/test02_20221223.txt");
			BufferedReader bf = new BufferedReader(file);
			LocalDate date = LocalDate.now();
			int currentYear=date.getYear();
			int firstTwoCurrent=currentYear-2000;
			int birthYear=0;
			while(true)
			{
				TDTO2 dat = new TDTO2();
				String str = bf.readLine();
				int sex;
				int FirstTwo=0;
				if(str == null)
				{
					bf.close();
					break;
				}
				dat.setId(str.substring(0,7));
				dat.setPw(str.substring(8,14));
				dat.phone[0]=str.substring(15,18);
				dat.phone[1]=str.substring(18,22);
				dat.phone[2]=str.substring(22,26);
				dat.setScNum01(str.substring(27,33));
				dat.setScNum02(str.substring(34,41));
				sex=Integer.parseInt(str.substring(34,35));
				if(sex%2==0)
					dat.setSex("여자");
				else
					dat.setSex("남자");
				FirstTwo=Integer.parseInt(str.substring(27,29));
				if(FirstTwo<=firstTwoCurrent)
					birthYear=FirstTwo+2000;
				else if(FirstTwo>firstTwoCurrent)
					birthYear=FirstTwo+1900;
				dat.setAge((birthYear-currentYear)*(-1));
				list.add(dat);
			}
		}
		catch(FileNotFoundException f)
		{
			System.out.println("예외: 지정된 파일을 찾을 수 없습니다.");
			f.printStackTrace();
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("예외: 파일이 없거나 더이상 사용할 수 없는 것 같습니다.");
			e.printStackTrace();
			System.exit(0);
		}
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
			for(TDTO2 A:list)
			{
				System.out.print(ln);
				System.out.print("[결과]"+ln);
				System.out.println("ID: "+A.getId());
				System.out.println("성별: "+A.getSex());
				System.out.printf("전화번호: %s-%s-%s\n",A.phone[0],A.phone[1],A.phone[2]);
				System.out.printf("주민번호: %s-%s\n\n",A.getScNum01(),A.getScNum02());
				System.out.println("나이: "+A.getAge()+"세");
				System.out.print(ln);
			}
	}

	@Override
	public void Exit() 
	{
		// TODO Auto-generated method stub
		System.out.print(ln+"메세지: 프로그램을 종료합니다."+ln);
		System.exit(0);
	}
}
class TDTO1
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
class TDTO2
{
	public String id,pw,sex;
	public String scNum01;
	public int age;
	public String scNum02;
	public String phone[] = {" "," "," "};
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
	public String getScNum01() {
		return scNum01;
	}
	public void setScNum01(String scNum01) {
		this.scNum01 = scNum01;
	}
	public String getScNum02() {
		return scNum02;
	}
	public void setScNum02(String scNum02) {
		this.scNum02 = scNum02;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
}
interface IOStream
{
	public void In();
	public void Out();
	public void Exit();
}
interface Scanf
{
	public int scInt(String text);
	public String scStr(String text);
}
interface line
{
	final String ln = "\n-----------------------------------------------------------------------------------\n";
}

