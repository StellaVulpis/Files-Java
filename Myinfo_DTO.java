package day12;

public class Myinfo_DTO implements Comparable<Myinfo_DTO>// DTO: Data Transfer Object; 데이터를 저장하기 위한 객체
{
	String name, contact, underLine;
	int age;
	// 생성자
	// 기본 생성자
	public Myinfo_DTO() 
	{
		underLine="\n---------------------------------------------\n";
	}
	// 객체 초기화 생성자
	public Myinfo_DTO(String name, String contact, int age) 
	{
		super();
		this.name = name;
		this.contact = contact;
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getContacts() 
	{
		return contact;
	}
	public void setContacts(String contact) 
	{
		this.contact = contact;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{	
		this.age = age;
	}
	@Override
	public int compareTo(Myinfo_DTO call) 
	{
		// TODO Auto-generated method stub
		return name.compareTo(call.name);
	}
	
}
