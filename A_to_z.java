package build02;
public class A_to_z
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(char ab = 'A'; ab <= 'z'; ab++)
		//반복문을 반드시 0 ==> 특정 숫자값 까지 반복시킬 필요는 없다.
		//0부터 특정숫자까지 반복시키는 경우는, 배열같이 초기값이 0이여야 하는 경우에 사용하면 된다.
		//반복문은 특정 시기에 종결시킬 수 있기때문에 초기값도 종결값도 원하는 값으로 사용해서 ++,--를 해주면 된다.
		//상황에 따라선 무한반복 (;;) / (true) 시키고, 특정 조건이 충족될 때만 종결시켜도 된다.
		{		
			if(count % 6 == 0)
				System.out.printf("\n");
				if(ab > 'z')
					return;
				if(ab == 91)
					ab = 97;
				System.out.printf("%c ", ab);
				count++;
				
		}
	
	}
   }

