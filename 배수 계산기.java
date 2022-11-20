package package1;
import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{
  public static void main(String args[])
  {
    Scanner sc = new  Scanner(System.in);
BigInteger n1, n2, t;
//==DO NOT CHANGE THE BELOW VALUE==//
BigInteger from = BigInteger.valueOf(0);
BigInteger One = BigInteger.valueOf(1);
BigInteger plus = BigInteger.valueOf(1);
//==================================//
System.out.println("계산할 수를 입력하세요.");
n2 = sc.nextBigInteger();
System.out.println("계산할 배수(승)을 입력하세요.");
t = sc.nextBigInteger(); 
// BigInteger + Variable
for(BigInteger i = from;
i.compareTo(t) < 0; i=i.add(plus))
{
One = One.multiply(n2);
}
System.out.println("===========");
System.out.println("결과값 = " + One);
  }
}
/*
배수 계산 기본 공식
n(x)^n(y)
n(x) × times(n(y))

int num = 2(custom), result = 1;
int =  times;
sc.times = nextInt();
for(int i = 0; i < times; i++)
result *= num;
System.out.println(result);
*/


