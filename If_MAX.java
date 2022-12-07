package day03;

public class If_MAX 
{
	int INT_MAX = 2147483647; // Max value of Integer(4 Bytes).
	public static void main(String args[])
	{
		// 선언부
		int a;
		If_MAX fld = new If_MAX();
		int eng = 89, max = 0, least = fld.INT_MAX;
		int nums[] = {478, 528, 1, 555472};
		// 입력부
		a = 24;
		// 처리부...조건비교문 if...반복문..
		if(a < 0)
			System.out.println("a는 음수입니다. 값: "+a);
		else
			System.out.println("a는 0또는 양수입니다. 값: "+a);
		// 출력부
		if(eng > 90)
			System.out.printf("점수: %d, 우수\n", eng);
		else
			System.out.printf("점수: %d, 보통\n", eng);
		System.out.printf("\n-----------------------------------\n");
		//-----------------------------------------------------------
		/*
		 * 
		 * When getting the values from users.
		 * Scanner sc = new Scanner();
		 * for(int t=0;t<4;t++)
		 * {
		 * 	System.out.println(t+"번째 값을 입력해주세요.");
		 * 	nums[t] = sc.nextInt();
		 * }
		 * 
		 * */
		// max = nums[0];
		//------------------------------------------------------------
		for(int i =0;i<4;i++)
		{
			if(max < nums[i])
				max = nums[i];
			if(least > nums[i]) // Only use 'else if' it is related to above 'if' selector.
				least = nums[i];
			try
			{
				Thread.sleep(700);
				System.out.println("값을 산출하는 중...");
			}catch(InterruptedException e)
			{
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------------");
		System.out.println("[산출 결과]");
		System.out.println("4개의 값중 가장 큰 값은 "+max+" 입니다.");
		System.out.println("4개의 값중 가장 작은 값은 "+least+" 입니다.");
	}
}
