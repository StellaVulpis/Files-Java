package day11;
import java.util.ArrayList;

public class InDAO_SetInfo 
{
	ArrayList<String> number = new ArrayList<String>();
	String name,address, si,gu,dong;
	int age;
	InDAO_SetInfo()
	{
		age=0;
	}
	
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public String getAdd_Si()
		{
			return si;
		}
		public void setAdd_Si(String si)
		{
			this.si=si;
		}
		public String getAdd_Gu()
		{
			return gu;
		}
		public void setAdd_Gu(String gu)
		{
			this.gu=gu;
		}
		public String getAdd_Dong()
		{
			return dong;
		}
		public void setAdd_Dong(String dong)
		{
			this.dong=dong;
		}
		public String getNum1()
		{
			return number.get(0);
		}
		public void setNum1(String number)
		{
			this.number.add(0, number);
		}
		public String getNum2()
		{
			return number.get(1);
		}
		public void setNum2(String number)
		{
			this.number.add(1, number);
		}
		public String getNum3()
		{
			return number.get(2);
		}
		public void setNum3(String number)
		{
			this.number.add(2, number);
		}
}