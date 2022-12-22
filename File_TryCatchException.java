package day14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class File_TryCatchException implements A_Interface
{
	/*
	 * 전부 main에서 하기
	 * 파일에서 이름 국어 영어 수학 >> 총점, 평균 >> 예외처리
	 * */
	String name;
	int kor,eng,math;
	double tot,avrg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public static void main(String args[])
	{
		ArrayList<File_TryCatchException> list = new ArrayList<File_TryCatchException>();
		try
		{
			FileReader file=new FileReader("C:/Data/File_TryCatchException.txt");
			BufferedReader bf=new BufferedReader(file); 
			for(;;)
			{
				File_TryCatchException c = new File_TryCatchException();
				String str=bf.readLine();
				/*
				NAME1|098057100
				NAME2|077099100
				NAME3|065088057
				NAME4|100077085
				 * */
				if(str==null)
				{
					bf.close();
					break;
				}
				c.setName(str.substring(0,5));
				c.setKor(Integer.parseInt(str.substring(6,9)));
				c.setEng(Integer.parseInt(str.substring(9,12)));
				c.setMath(Integer.parseInt(str.substring(12,15)));
				c.setTot((double)c.kor+(double)c.eng+(double)c.math);
				c.setAvrg(c.tot/3);
				list.add(c);
			}			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("[출력결과]");
			System.out.println(" 이름\t국어/t영어/t수학/t총점/t평균"+ln);
			for(File_TryCatchException a:list)
				System.out.printf("%s\t%d\t%d\t%d\t%.0f\t%.2f\n",a.getName(),a.getKor(),a.getEng(),a.getMath(),a.getTot(),a.getAvrg());
		}
	}
	
}
