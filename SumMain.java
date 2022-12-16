package day10.Sum;
import java.util.Scanner;
public class SumMain 
{
    // 두 수를 입력해서 합을 구하는 클래스 생성
    // 필요시 클래스와 메서드를 생성해서 값을 구할 것.
    public static void main(String args[])
    {
        getVal get = new getVal();
        setVal set = new setVal();
        Scanner sc = new Scanner(System.in);
        set.set1st(get.getVals("첫번째 ",sc));
        set.set2nd(get.getVals("두번째 ",sc));
        set.out();
    }    
}
