package day10.Score_OOP;
import java.util.Scanner;
public class Input 
{
    String strScanf(String sbj, Scanner sc)
    {
        System.out.print(sbj+"을 입력: ");
        return sc.nextLine();
    }
    int intScanf(String sbj, Scanner sc)
    {
        System.out.print(sbj+"점수를 입력: ");
        return sc.nextInt();
    }

}
