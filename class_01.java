package day10.Files;
import java.util.Scanner;
public class class_01 
{
    public Scanner sc = new Scanner(System.in);
    public Scanner tc = new Scanner(System.in);
    String name,underLine, grade;
    int kor,math,eng,sbjC;
    double avrg,tot;
    public class_01()
    {
        kor=0;eng=0;math=0;sbjC=3;
        avrg=0.0;tot=0.0;
        underLine="====================================================";
    }
    void in()
    {
        System.out.print("Your name: ");
        name=sc.nextLine();
        System.out.print("Korean: ");
        kor=sc.nextInt();
        System.out.print("English: ");
        eng=sc.nextInt();
        System.out.print("Math: ");
        math=sc.nextInt();
        tot=(double)(kor+eng+math);
        avrg=tot/sbjC;
    }
    void out()
    {
        System.out.println(underLine);
        System.out.println("[Result]");
        System.out.println("Name: "+name);
        System.out.println("Korean: "+kor);
        System.out.println("English: "+eng);
        System.out.println("Math: "+math);
        System.out.println(underLine);
        System.out.printf("Average: %.2f\n",avrg);
        System.out.printf("Total: %.0f\n",tot);
        System.out.println(underLine);
    }
    String setGrade()
    {
        String grade=null;
        if(avrg>=90&&avrg<=100)
            grade="A";
        else if(avrg>=80&&avrg<90)
            grade="B";
        else if(avrg>=70&&avrg<80)
            grade="C";
        else if(avrg>=60&&avrg<70)
            grade="D";
        else if(avrg<60)
            grade="F";
        else
            System.out.println("Try again.");
        return grade;
    }
    String reScanf(Scanner tc)
    {
        System.out.print("Type anything: ");
        return tc.nextLine();
    }   
}
