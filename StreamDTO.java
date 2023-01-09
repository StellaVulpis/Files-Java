package day26;

public class StreamDTO implements Comparable<StreamDTO>
{
	String classNames, names, clubNames;
	int kor,eng,math; int rank;
	int korSum, engSum,mathSum, korSumbyClassName; String korSumNames;
	long listCount, above70Kor, above70Eng, above70Math, up70KorDown65EngUp85Math; 
	int kSum, eSum, mSum;
	double total,avrg;
	char grade;
	public String getClassNames() {
		return classNames;
	}
	public void setClassNames(String classNames) {
		this.classNames = classNames;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getClubNames() {
		return clubNames;
	}
	public void setClubNames(String clubNames) {
		this.clubNames = clubNames;
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
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getkSum() {
		return kSum;
	}
	public void setkSum(int kSum) {
		this.kSum = kSum;
	}
	public int geteSum() {
		return eSum;
	}
	public void seteSum(int eSum) {
		this.eSum = eSum;
	}
	public int getmSum() {
		return mSum;
	}
	public void setmSum(int mSum) {
		this.mSum = mSum;
	}
	public int getKorSum() {
		return korSum;
	}
	public void setKorSum(int korSum) {
		this.korSum = korSum;
	}
	public int getEngSum() {
		return engSum;
	}
	public void setEngSum(int engSum) {
		this.engSum = engSum;
	}
	public int getMathSum() {
		return mathSum;
	}
	public void setMathSum(int mathSum) {
		this.mathSum = mathSum;
	}
	public long getListCount() {
		return listCount;
	}
	public void setListCount(long listCount) {
		this.listCount = listCount;
	}
	public long getAbove70Kor() {
		return above70Kor;
	}
	public void setAbove70Kor(long above70Kor) {
		this.above70Kor = above70Kor;
	}
	public long getAbove70Eng() {
		return above70Eng;
	}
	public void setAbove70Eng(long above70Eng) {
		this.above70Eng = above70Eng;
	}
	public long getAbove70Math() {
		return above70Math;
	}
	public void setAbove70Math(long above70Math) {
		this.above70Math = above70Math;
	}
	
	public long getUp70KorDown65EngUp85Math() {
		return up70KorDown65EngUp85Math;
	}
	public void setUp70KorDown65EngUp85Math(long up70KorDown65EngUp85Math) {
		this.up70KorDown65EngUp85Math = up70KorDown65EngUp85Math;
	}
	public int getKorSumbyClassName() {
		return korSumbyClassName;
	}
	public void setKorSumbyClassName(int korSumbyClassName) {
		this.korSumbyClassName += korSumbyClassName;
	}
	public String getKorSumNames() {
		return korSumNames;
	}
	public void setKorSumNames(String korSumNames) {
		this.korSumNames = korSumNames;
	}
	@Override
	public int compareTo(StreamDTO o) 
	{
		// TODO Auto-generated method stub
		if(avrg < o.avrg)
		{
			return 1;
		}
		else if(avrg > o.avrg)
		{
			return -1;
		}
		else
			return 0;
	}
	@Override
	public String toString() 
	{
		return "[Name: " + names +"] \n"+"Class: " + classNames  + " | Club: " + clubNames + "\nScore in Korean: " + kor
				+ " | Score in English: " + eng + " | Score in Mathematics: " + math + "\nScore total: " + String.format("%.0f",total) + " | Score Average: " + String.format("%.2f",avrg) 
				+ "\nGrade: " + grade;
	}
	
}

