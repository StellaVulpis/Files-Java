package day19;

public class AbITFTest extends Abstract1 implements ITFTest
{
	public static void main(String args[])
	{
		SingletonTEST sg=SingletonTEST.getInstance();
		AbITFTest a = new AbITFTest();
		int num=sg.INT();
		if(num==1)
			a.run();
		else
			a.RUN();
	}
	@Override
	public void run() 
	{
		// Write codes here...
		System.out.println("추상메소드 실행");
	}
	@Override
	public void RUN() 
	{
		System.out.println("인터페이스 실행");
	}
}
interface ITFTest
{
	public void RUN();
}
