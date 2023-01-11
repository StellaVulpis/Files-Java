package day28;

import TOOL.IOStream;
public class DAT extends IOStream implements Comparable<DAT>
{
	String name, className, id, adsDate, grade, isPass;
	int kor,eng,math; 
	int korSum, engSum, mathSum;
	double total, avrg; 
	@Override
	public String toString()
	{
		return ln+ln+"Name: "+name+"\nAdmission date: 20"+adsDate+"\nStudent ID: "+id+
					"\nScore in Business Korean 408: "+kor+" | Score in Basic English 207: "+eng+" | Score in Mathematics 101: "+math+
					"\nScore total: "+String.format("%.0f", total)+"\nScore average: "+String.format("%.2f", avrg)+"\nGrade: "+grade+
					"Pass/Fail: "+isPass+ln+ln;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	public int getMath()
	{
		return math;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public double getTotal()
	{
		return total;
	}
	public void setTotal(double total)
	{
		this.total = total;
	}
	public double getAvrg()
	{
		return avrg;
	}
	public void setAvrg(double avrg)
	{
		this.avrg = avrg;
	}
	public String getClassName()
	{
		return className;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
	public String getAdsDate()
	{
		return adsDate;
	}
	public void setAdsDate(String adsDate)
	{
		this.adsDate = adsDate;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	public String getIsPass()
	{
		return isPass;
	}
	public void setIsPass(Boolean isPass)
	{
		if(isPass==true)
			this.isPass="Pass";
		else
			this.isPass="Fail";
	}
	public int getKorSum()
	{
		return korSum;
	}
	public void setKorSum(int korSum)
	{
		this.korSum = korSum;
	}
	public int getEngSum()
	{
		return engSum;
	}
	public void setEngSum(int engSum)
	{
		this.engSum = engSum;
	}
	public int getMathSum()
	{
		return mathSum;
	}
	public void setMathSum(int mathSum)
	{
		this.mathSum = mathSum;
	}
	public void setIsPass(String isPass)
	{
		this.isPass = isPass;
	}
	@Override
	public int compareTo(DAT o)
	{
		// TODO Auto-generated method stub
		if(avrg>o.avrg)
			return -1;
		else if(avrg<o.avrg)
			return 1;
		else
			return 0;
	}
}