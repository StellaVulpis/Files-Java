package day16_test_feedback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayTest2 
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		ARR ar = new ARR();
		try
		{
			FileReader file = new FileReader("C:/Data/1234.txt");
			BufferedReader bf = new BufferedReader(file);
			int c=0;
		while(true)
		{
			String str=bf.readLine();
			if(str==null)
			{
				bf.close();
				break;
			}
			int num=Integer.parseInt(str.substring(0,2));
			a[c]=num; // 파일에 있는 문자를 숫자로 바꾼 뒤 배열에 전부 저장한다. (null이 되면 종료되기에 자동으로 5개 저장이 된다.)
			c++;
		}
		ar.Sum(a);
		}catch(IOException e)
		{
			
		}
		finally
		{
			System.out.println("배열의 합은 "+ar.sum+" 입니다.");
		}
	}
}
class ARR
{
	int sum=0;
	public void Sum(int a[]) // 반복문이 위에서 이미 돌아가고 있으므로, 위에서 배열과 배열의 인덱스만 받아서 계산만 해주면 된다.
	{
		for(int i=0;i<a.length;i++)
			System.out.println(sum+=a[i]); // 여기서 출력하는 이유는 더해지고 있는 상황을 보기 위해서이며, 출력하지 않아도 상관없다.
	}
}
