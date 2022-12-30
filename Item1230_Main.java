package day20;

import TOOL.IOStream;

public class Item1230_Main 
{
	/* 
	 * 상품코드 a,b,m 중에서 하나 입력
	 * 수량 단가의 필드를 갖는 클래스 존재
	 * DAO는 DTO를 상속 받고 매출액은 수량*단가, 클래스와 메소드로
	 * 값을 구함. 
	 * 자료 입력방식은 세터 방식과 파일 처리 방식중에서 임의대로 입력.
	 * 출력은 매출액 내림차순 정렬 결과로 출력
	 * A: 사과 B: 바나나 C: 참외
	 * 싱글톤 클래스 사용해도 OK
	 * */
	public static void main(String args[])
	{
		Item1230_DAO item = Item1230_DAO.getInstance();
		while(true)
		{
			item.menu();
		}
	}
}
