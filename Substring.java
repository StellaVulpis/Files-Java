package day02;

public class Substring 
{
	public static void main(String args[])
	{
		String str, str2 = "ABCDEFG";
		str = str2.substring(2, 4); // Param 1: Start string 
									// Param 2: Range to cut, It cuts to before the second parameter. (Starting index: 0) 
									// (Index: 0, 5 >> 0,1,2,3,4) (Index: 2, 4 >>  CD)
									// Ex) ABCDEFG || .substring(1, 5); >> BCDE / .substring(0, 5) >> ABCDE 
									// It is similar to <for(int i =0; i<5; i++)>.
		System.out.println("Original string: "+str2);
		System.out.println("Cut string: "+str);
	}
}
