package day14;

import java.util.Scanner;

public class TEST_Prepare 
{
	public static void main(String args[])
	{
		TEST1DAO t1 = new TEST1DAO();
		TEST2DAO t2 = new TEST2DAO();
		TEST3DAO t3 = new TEST3DAO();
		TEST4DAO t4 = new TEST4DAO();
		TEST5DAO t5 = new TEST5DAO();
		//t1.Out();
		t2.In();
		t2.Out();
	}
}
class TEST1DAO extends TEST1DT implements InputOutput
{

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		sum=0;
	}
	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		In();
		for(int i=1;i<=100;i++)
		{
			setSum(sum+i);
			System.out.println("Sum+"+i);
		}
		System.out.println("Result: "+sum);
	}

}
class TEST2DAO extends TEST2DT implements InputOutput, Scanf
{

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		setNum(scInt("짝수 홀수를 판별할 수를 입력"));
		if(getNum()%2==0)
			setIsEven(true);
		else
			setIsEven(false);
	}
	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		System.out.print("입력된 수: "+getNum()+ln);
		System.out.print("입력된 수는 짝수입니까?"+ln);
		if(getIsEven() == true)
		{
			System.out.println("결과: "+getIsEven());
			System.out.println(getNum()+"는(은) 짝수입니다.");
		}
		else
		{
			System.out.println("결과: "+getIsEven());
			System.out.println(getNum()+"는(은) 홀수입니다.");
		}
	}

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextInt();
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextLine();
	}
	
}
class TEST3DAO extends TEST3DT implements InputOutput, Scanf
{

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
class TEST4DAO extends TEST4DT implements InputOutput
{

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		
	}
	
}
class TEST5DAO extends TEST5DT implements InputOutput, Scanf
{

	@Override
	public void In() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Out() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int scInt(String text) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String scStr(String text) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
class TEST1DT 
{
	int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
class TEST2DT
{
	Boolean isEven;
	int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public Boolean getIsEven() {
		return isEven;
	}

	public void setIsEven(Boolean isEven) {
		this.isEven = isEven;
	}
}
class TEST3DT
{
	String name;
	int loopCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoopCount() {
		return loopCount;
	}
	public void setLoopCount(int loopCount) {
		this.loopCount = loopCount;
	}
}
class TEST4DT
{
	String name,grd;
	int kor,eng,math;
	double tot,avrg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrd() {
		return grd;
	}
	public void setGrd(String grd) {
		this.grd = grd;
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
}
class TEST5DT
{
	String ID,PW,phone,address;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
interface InputOutput
{
	final String ln="\n--------------------------------------------------\n";
	public void In();
	public void Out();
}
interface Scanf
{
	public int scInt(String text);
	public String scStr(String text);
}










