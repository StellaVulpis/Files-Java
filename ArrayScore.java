package day17;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayScore 
{
 public static void main(String[] args) 
 {
  int po=0; 
  int score[][] = new int[1000][7];
  String name[] = new String[1000];
  int sc=0, kor=0, eng=0, math=0, 
  tot=0,avrg=0;
  ArrayScore as = new ArrayScore();
  try
  {
   FileReader file = new FileReader("C:/Data/1234.txt");
   BufferedReader bf = new BufferedReader(file);
   /*
   Aaa098077086
   Bbb100067058
   Ccc078089077
   Ddd069100096
   */
   while(true)
   {
    //=================
    String txt = bf.readLine();
    if(txt == null)
    {
     bf.close();
     break;
    }
    kor=Integer.parseInt(txt.substring(3,6));
    eng=Integer.parseInt(txt.substring(6,9));
    math=Integer.parseInt(txt.substring(9,12));
    tot=kor+eng+math;
    avrg=tot/3;
    name[po]=txt.substring(0,3);
    score[po][0]=kor;
    score[po][1]=eng;
    score[po][2]=math;
    score[po][3]=tot;
    score[po][4]=avrg;
    if(score[po][4]>=90 && score[po][4]<=100)
     score[po][5]=65; // A
    else if(score[po][4]>=80 &&score[po][4]<90)
    score[po][5]=66; // B
    else if(score[po][4]>=70 &&score[po][4]<80)
    score[po][5]=67; // C
    else if(score[po][4]>=60 &&score[po][4]<70)
    score[po][5]=68; // D
    else
     score[po][5]=70; // F
    po++; // Reading 4 lines.
   }
   ArrayScore.rank(name,score,po);
  }catch(FileNotFoundException e)
  {
   e.printStackTrace();
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
 }
 public static void rank(String Name[], int Score[][], int Po)
 {
  for(int i=0;i<Po;i++)
  {
   Score[i][6]=1;
   for(int t=0;t<Po;t++)
   {
    if(Score[i][3]<Score[t][3])
     Score[i][6]+=1;
   }
  }
  System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점\t석차");
  System.out.println("-----------------------------------------------------------");
  for(int i=0;i<Po;i++)
  {
	  System.out.print(Name[i]+"\t");
	  for(int t=0;t<7;t++)
	  {
		  if(t==5)
			  System.out.print((char)Score[i][t]+"\t");
		  else
			  System.out.print(Score[i][t]+"\t");
	  }
	  System.out.println();
  }
 }
}