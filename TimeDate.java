package day09;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
public class TimeDate 
{
	Scanner sc = new Scanner(System.in);
	Scanner tc = new Scanner(System.in);
	 Date time = new Date();
	 LocalDate now = LocalDate.now();
	 SimpleDateFormat timeFormat = new SimpleDateFormat("MMMM, dd, yyyy : HH:mm:ss");
	 DecimalFormat df = new DecimalFormat("##,###,###");
	 Test t0 = new Test();
	 String nowDateEN, formattedDate, TIME, time01, purchasedAt, item, ans;
	 
	 int itemPrice, shipCost, offRate, valueToPurchase, wholeSaleOff, originalPrice, finalPrice, itemMaxVal;
	 Locale locale = new Locale("en", "EN"); // 로케일(국가) 설정
	 //LocalDate yesterday = now.minusDays(1); 
	 //LocalDate tomorrow = now.plusDays(1);
	 //LocalDate nextToday = now.plusDays(7);
	 DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
    TimeDate() 
    {
    	nowDateEN = dateFormat.format(new Date());
    	formattedDate = now.format(DateTimeFormatter.ofPattern("MMMM-dd일, yyyy년"));
    	TIME = timeFormat.format(time);
    	item = "로지텍 g80 마우스";
    	valueToPurchase=0;
    	itemMaxVal=999;
    }
    void time()
    {
    	// 구입날짜 상품명 수량 가격 판매금액 
    	// 판매금액: 수량*가격
    	// 예: 날짜: 12월 15일
    	 time.getTime();
    	 System.out.println(now);
    	 System.out.println(nowDateEN);
    	 System.out.println(TIME);
    }
    void buyItem()
    {
    	System.out.println("상품명: "+item);
    	System.out.print("구매할 수량을 입력해주세요: ");
    	valueToPurchase=sc.nextInt();
    	if(valueToPurchase > itemMaxVal)
    	{
    		System.out.println("구매 수량을 초과하여 구매하실 수 없습니다. 다시 시도해주세요.");
    		return;
    	}
    	System.out.println("결제하시겠습니까?");
    	System.out.print("(예/아니요): ");
    	ans=tc.nextLine();
    	if(ans.equals("Yes") || ans.equals("Y") || ans.equals("YES") ||
    			ans.equals("yes") || ans.equals("네"))
    	{
    		itemPrice=27000;
        	shipCost=2500+(50*valueToPurchase);
        	offRate=(itemPrice/10)*2;
        	wholeSaleOff=offRate*valueToPurchase;
        	originalPrice=itemPrice*valueToPurchase;
        	finalPrice=(originalPrice-wholeSaleOff)+shipCost;
    		printTransactionHistory();
    	}
    	else
    	{
    		System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
    		return;
    	}
    }
    void printTransactionHistory()
    {
    	System.out.println(t0.underLine);
    	System.out.println("메세지: 구매해주셔서 감사합니다.");
    	System.out.println(t0.underLine);
    	System.out.println("[구매 결과]");
    	System.out.println(t0.underLine);
    	System.out.println("상품명: 로지텍 g80 마우스");
    	System.out.println("Purchased Date: "+TIME);
    	System.out.println("구입수량: "+valueToPurchase+"개");
    	System.out.println("개당 가격: "+df.format(itemPrice)+"원");
    	System.out.println("원가: "+df.format(originalPrice)+"원");
    	System.out.println("할인 총 금액: "+df.format(wholeSaleOff)+"원");
    	System.out.println("최종 결제 금액: "+df.format(finalPrice)+"원");
    	System.out.println(t0.underLine);
    }
    void bin()
    {
    	// 진법 변환 (이진수 변환도 시간나면 해보기)
    	// << >> 비트 이동
    	// a&b: 두 값의 비트가 전부 1이면 1(true), 서로 다르거나 하나 이상이 0일 때 0(false)으로 계산. (11 >> 1, 00 > 0, 01 >> 0, 10 >> 0)
    	/*
    	 * a: 	 	10001001
    	 * b:	 	11110111
    	 * result:  10000001
    	 * */
    	// a|b: 두 값의 비트 중 하나 이상(01, 10, 11)이 1이면 1(true), 전부 0이면 0(false)으로 계산. (01 >> 1, 10 >> 1, 11 >> 1, 00 > 0)
    	/*
    	 * a: 	 	10001001
    	 * b:	 	11110111
    	 * result:  11111111
    	 * */
    	// a^b: 두 값의 비트가 서로 다르면 1(true), 같으면 0(true)으로 계산. (10 >> 1, 01 >> 1, 00 >> 0, 11 >> 0)
    	/*
    	 * a: 	 	10001001
    	 * b:	 	11110111
    	 * result:  01111110
    	 */
    	// ~: 비트 반전 연산자 (해당 비트를 반전) (11 >> 00, 00 >> 11, 10 >> 01, 01 >> 10)
    	/*
    	 * a: 		10010100
    	 * result:  01101011
    	 * */
    	int a=30, b=60; /*
    					 * 011110 (30)
    					 * 111100 (60)
    					 * -----------
    					 * 111110 (62)
    	 				*/ 
    	int result= a | b;
    	System.out.println(result);
    	int num=37, shift=0; 		  // 37(000000100101) (왼쪽으로 3자리 이동)
    	shift=num<<3; 		// shift == 296(000100101000) <<
    	System.out.println(shift);
    }
}
