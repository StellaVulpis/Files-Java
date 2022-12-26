package day16_test_feedback;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileArrayTest 
{
	public static void main(String args[])
	{
		FileArrayTest f = new FileArrayTest();
		int a[] = new int[5];
		int err=0;
		try
		{
		FileReader file = new FileReader("C:/Data/1234.txt");
		BufferedReader bf = new BufferedReader(file);
		int count=0, num=0;
		while(true)
		{
			String str=bf.readLine();
			if(str==null)
			{
				bf.close();
				break;
			}
			num=Integer.parseInt(str.substring(0,2));
			System.out.println("---------------------------------------------");
			a[count]=num;
			count++;
		}
		}catch(FileNotFoundException e)
		{
			System.err.println("파일을 찾을 수 없었습니다. 경로에서 파일을 다시 한번 확인해주세요.");
			e.printStackTrace();
			err++;
		}catch(IOException e)
		{
			e.printStackTrace();
			err++;
		}catch(NullPointerException e)
		{
			System.err.println("Null 값을 참조할 수 없습니다.");
			e.printStackTrace();
			err++;
		}
		finally
		{
			if(err==0)
			{
			for(int i=0;i<a.length;i++)
				System.out.println("파일에서 불러읽은 배열의 값: "+a[i]+" | 인덱스: "+i);
			}
			else
			{
				System.err.println("예외 발생, 예외의 종류를 확인해주세요.");
				return;
			}
		}
	}
}
