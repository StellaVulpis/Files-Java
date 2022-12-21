package day13;

public class ScoreDTO implements Comparable<ScoreDTO>
{
	int rank,kor,eng,math; String name, grade;
	String underLine="\n--------------------------------------------------------------\n";
	@Override
	public int compareTo(ScoreDTO o) 
	{
		// return o.name.compareTo(name);
		// return name.compareTo(o.name); // Ascending (Descending: o.avrg > avrg)
		if(avrg > o.avrg) // Ascending
		{
			return -1;
		}
		else if(avrg < o.avrg) // Ascending (Descending: o.avrg < avrg)
		{
			return 1;
		}
		else
			return 0;
	}
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	double tot,avrg;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
