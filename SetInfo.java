package day10.Score_OOP;

public class SetInfo 
{
    private int kor,eng,math;
    private String name,grade;
    double total,avrg;
    SetInfo()
    {
    	kor=0;
    	eng=0;
    	math=0;
    	total=0.0;
    	avrg=0.0;
    }
   // Getter, Setter: private 요소에 접근하기 위해 사용함
    String setName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int setKor()
    {
        return kor;
    }
    void setKor(int kor)
    {
        this.kor=kor;
        total+=kor;
    }
    int setEng()
    {
       return eng;
    }
    void setEng(int eng)
    {
        this.eng=eng;
        total+=eng;
    }
    int setMath()
    {
       return math;
    }
    void setMath(int math)
    {
        this.math=math;
        total+=math;
    }
    void setAverage()
    {
    	avrg=total/3;
    }
    void setGrd()
    {
    	if(avrg>=90 && avrg<=100)          //90 100
            grade="A";
        else if(avrg>=80 && avrg<90)       //80 89
            grade="B";
        else if(avrg>=70 && avrg<80)       //70 79
            grade="C";
        else if(avrg>=60 && avrg<70)       //60 69
            grade="D";
        else if(avrg<60)                      //0~59
            grade="F";
        else                                     // else
            grade="점수를 잘못 입력하셨습니다.";
    }
    void out()
    {
        System.out.println("이름: "+name);
        System.out.println("국어: "+kor);
        System.out.println("영어: "+eng);
        System.out.println("수학: "+math);
        System.out.printf("총점: %.0f\n",total);
        System.out.printf("평균: %.2f\n",avrg);
        System.out.println("학점: "+grade);
    }
}
