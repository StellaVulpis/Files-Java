package day11;
public class ArrayList_Data 
{
	String name, grade, ans, sel;
	int kor,eng,math;
	double total, avrg;
	
	public ArrayList_Data() 
	{
	    ans=" ";
	}
	public ArrayList_Data(String name, int kor, int eng, int math) 
	{
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getAns() 
	{
		return ans;
	}
	public void setAns(String ans) 
	{
		this.ans = ans;
	}
	public String getSel()
	{
	    return sel;
	}
	public void setSel(String sel)
	{
	    this.sel=sel;
	}
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAvrg() {
		return avrg;
	}
	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}
}