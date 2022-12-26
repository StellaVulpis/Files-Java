package day16_test_feedback;

public class MyInfo_DTO
{
	String name, SSN1, SSN2, sex; // Social Security Number
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN1() {
		return SSN1;
	}
	public void setSSN1(String SN1) {
		SSN1 = SN1;
	}
	public String getSSN2() {
		return SSN2;
	}
	public void setSSN2(String SN2) {
		SSN2 = SN2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
