package day13;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class File_Test 
{
	public static void main(String args[]) throws IOException
	{
		// Essential declaration
		FileReader file = new FileReader("C:/Data/1221.txt");
		/*
		 * 1221.txt
		 * 
		 *  1Jor085091077
			2Koo100077091
			3Con094067088
			4Den088076090
			5Dub100089055
			6Nub075088077
		 * 
		 * */
		BufferedReader bf = new BufferedReader(file); 
		int rank,kor,eng,math; String name;
		// Essential declaration
		System.out.println("순위\t이름\t국어\t영어\t수학");
		System.out.println("-----------------------------------");
		while(true)
		{
				String str = bf.readLine();
				if(str==null)
				{
					bf.close();
					return;
				}
				rank=Integer.parseInt(str.substring(0,1));
				name=str.substring(1,4);
				kor=Integer.parseInt(str.substring(4,7));
				eng=Integer.parseInt(str.substring(7,10));
				math=Integer.parseInt(str.substring(10,13));
				System.out.printf("%d\t%s\t%d\t%d\t%d\n",rank,name,kor,eng,math);
		}
	}
}
