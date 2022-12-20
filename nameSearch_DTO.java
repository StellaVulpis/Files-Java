package day12;

public class nameSearch_DTO // DTO: Data Transfer Object; 데이터를 저장하기 위한 객체
{
	String name,underLine;
	nameSearch_DTO()
	{
		underLine="\n----------------------------------------\n";
	}
	public nameSearch_DTO(String name, String underLine) {
		super();
		this.name = name;
		this.underLine = underLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
