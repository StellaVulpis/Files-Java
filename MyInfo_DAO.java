package day16_test_feedback;
import java.time.LocalDate;
import java.util.ArrayList;

public class MyInfo_DAO extends MyInfo_Main
{
	ArrayList<MyInfo_DTO> li = new ArrayList<MyInfo_DTO>();
	MyInfo_DTO my = new MyInfo_DTO();
	public void input()
	{
		my.setName(scStr("Your name"));
		my.setSSN1(scStr("First 6 digits of your Social Security Number"));
		my.setSSN2(scStr("Last 7 digits of your Social Security Number"));
		SETGen();
		SETAge();
		li.add(my);
		System.out.println(ln);
	}
	public void SETGen()
	{
		// 951245-1234567
		int gen=Integer.parseInt(my.getSSN2().substring(0,1));
		String gender;
		if(gen % 2 == 1)
		{
			
			gender="Male";
			my.setSex(gender);
		}
		else
		{
			gender="Female";
			my.setSex(gender);
		}
	}
	public void SETAge()
	{
		LocalDate date = LocalDate.now();
		int cY = date.getYear(); // 2022 
		int cYD=cY-2000; // 2022 ->> 22 || 2023 ->> 23
		int bDate=Integer.parseInt(my.getSSN1().substring(0,2)); // 851045 >> 85 
		int age=0;
		if(bDate>cYD) // 97 > 22 || 21 < 22
		{
			age=((bDate+1900)-cY)*(-1); // 97 >> 1997 >> -25 >> 25
			my.setAge(age);
		}
		else
		{
			age=((bDate+2000)-cY)*(-1); // 15 >> 2015 >> -7 >> 7
			my.setAge(age);
		}		
	}
	
	public void output()
	{
		System.out.println(ln+"[Result]"+ln);
		System.out.println("Name\t|\tage\t|\tSocial Security Number\t|\tGender");
		for(MyInfo_DTO a:li)
		{
			System.out.printf("%s\t|\t%d\t|\t%s-%s\t\t|\t%s\n",a.name,a.age,a.SSN1,a.SSN2,a.sex);
			System.out.println(ln);
		}
	}
	public void fin()
	{
		System.out.println("Terminated.");
		System.exit(0);
	}
}
