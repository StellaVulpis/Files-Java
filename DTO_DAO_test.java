package day11;
// import java.util.Scanner;
public class DTO_DAO_test 
{
	public static void main(String[] args) 
	{
		//DTOInput dt = new DTOInput();
	}
}
class DTOInput
{
	String name; 
	int age;
	// Default Constructor
	DTOInput() 
	{
	}
	// Object initialization constructor (Generating constructor using field)
	public DTOInput(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	// Setter / Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}