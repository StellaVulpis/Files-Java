package day08;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Utility_2nd extends Utility {
	Utility utl = new Utility();
	

	Scanner sc = new Scanner(System.in);
	Scanner tc = new Scanner(System.in);
	DecimalFormat dc = new DecimalFormat("#,###,###");
	private int deposMoney;
	private int accountNum[] = new int[4];
	private String accountName, bankName;
	String  productName;
	int prdPrice, prdQuantity;

	Utility_2nd() {
		super.mthd1 = "Out_2nd()";
		super.name = "Kim Kwang Seok";
		super.age = 35;
		underLine = super.underLine;	
	}
	void out_2nd() {
		System.out.println("[클래스 이름: " + super.mthd1 + "]\n");
		System.out.println("이름: " + super.name + "\n나이: " + super.age + "세");
		System.out.println("(This texts are from inherited class(Utility_2nd) and printed out.");
		System.out.println(underLine);
	}
	void deposit() {
		// 이름, 계좌번호, 입금액 입력해서 결과 출력하고 main에서 출력
		System.out.println("예금주명을 입력해주세요.");
		System.out.print("입력: ");
		accountName = tc.nextLine();
		System.out.println("은행명을 입력해주세요.");
		System.out.print("입력: ");
		bankName = tc.nextLine();
		System.out.println("계좌번호를 입력해주세요.");
		System.out.print("입력: ");
		accountNum[0] = Integer.parseInt(sc.nextLine());
		System.out.print(" - ");
		accountNum[1] = Integer.parseInt(sc.nextLine());
		System.out.print(" - ");
		accountNum[2] = Integer.parseInt(sc.nextLine());
		System.out.println("[입력하신 계좌번호]");
		System.out.printf("%d-%d-%d\n%s은행\n",accountNum[0],accountNum[1],accountNum[2],bankName);
		System.out.println("입금할 금액을 입력해주세요.");
		System.out.print("입력: ");
		deposMoney = sc.nextInt();
		System.out.println(underLine);
		System.out.println("[송금 결과]\n");
		System.out.println(accountName+"님께 "+bankName+"은행으로 "+dc.format(deposMoney)+"원 입금이 완료되었습니다.");
		System.out.print("은행 계좌번호: ");
		System.out.printf("%d-%d-%d\n%s은행\n",accountNum[0],accountNum[1],accountNum[2],bankName);
		System.out.println("\n\n이용해주셔서 감사합니다.");
		sc.close();
		tc.close();
		return;
	}
	void setName() // >> products
	{
		productName = "Galaxy S22 Ultra";
	}
	void setPrice() // >> products
	{
		prdPrice = 1452000;
	}
	void setQuantity() // >> products
	{
		prdQuantity = 152;
	}
	void getPrdInfo() // >> main
	{
		// 상품명 / 수량 / 금액
		System.out.println(underLine);
		System.out.println("[상품 정보]\n"+underLine);
		System.out.println("상품명: "+productName);
		System.out.println("단가: "+dc.format(prdPrice)+"원");
		System.out.println("재고: "+prdQuantity+"개 이용가능");
		System.out.println(underLine);
	}
	//====================================================================================================================
	// Setter & Getter: use when class/method/variable is private to use from outside. 
	// Eclipse IDE creates them automatically. 
	// How to create setter and getter: Right mouse click -> Source -> Generate getters and setters -> Click private elements. 
	public int getDeposMoney() {
		return deposMoney;
	}

	public void setDeposMoney(int deposMoney) {
		this.deposMoney = deposMoney;
	}

	public int[] getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int[] accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	//======================================================================================================================
} // end of class
