package day24;

public class Map0105 
{
	public static void main(String args[])
	{
		/*
		 * 상품명, 수량, 단가, 매출액
		 * DTO 생성, DAO는 임의대로
		 * 상품명, 매출액 TreeMap에 저장 후 출력
		 */
		Map0105_DAO run = new Map0105_DAO(); 
		Thread th = new Thread(run);
		th.start();
	}
}
