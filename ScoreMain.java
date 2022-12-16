package day10.Score_OOP;
import java.util.Scanner;
public class ScoreMain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Input in = new Input();
        SetInfo si = new SetInfo();
        si.setName(in.strScanf("이름", sc));
        si.setKor(in.intScanf("국어 ", sc));
        si.setEng(in.intScanf("영어 ",sc));
        si.setMath(in.intScanf("수학 ", sc));
        si.setAverage();
        si.setGrd();
        //총점
        //평점
        //학점
        //-----------------------------------------
        si.out();
    }
}
