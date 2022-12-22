package day14;
public class A_MyDTO implements Comparable<A_MyDTO>
{
	String name, Do,si,gu,dong;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDo() {
		return Do;
	}
	public void setDo(String do1) {
		Do = do1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(A_MyDTO n) 
	{
		return name.compareTo(n.name);
	}
	public String getSi() {
		return si;
	}
	public void setSi(String si) {
		this.si = si;
	}
	public String getGu() {
		return gu;
	}
	public void setGu(String gu) {
		this.gu = gu;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	
}
