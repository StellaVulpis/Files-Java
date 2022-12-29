package day19;
public class TEST1  
{
	/*
	 * 상품명 1 수량 2 단가 4 (단가*수량=매출액)
	 * 상품명 a="사과", b="바나나",m="참외"
	 * */
	public static void main(String args[])
	{
		//util io = new util();
		TEST1_DAO d = TEST1_DAO.getInstance();
		d.menu();
	}
}
