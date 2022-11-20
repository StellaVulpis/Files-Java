package chap06;
import java.util.Scanner;
public class pokemon
{
    public static void main(String[] args)
    {
    int input = 0;
    int raidcount = 0;
    int candy = 0, xs = 0, s = 0, M = 0, L = 0, dmax = 0;
    Scanner sc = new Scanner(System.in); 
    for(;;)
    {
    System.out.println("선택하세요.\n\n");
    System.out.println("1. 이상한사탕\n2. XS\n3. S\n4. M\n5. L\n6. 다이맥스사탕\n\n");
    System.out.printf("프로그램종료시 9입력, 레이드 종료시 8입력\n\n\n");
    input = sc.nextInt();
    switch(input)
    {
        case 1:
        System.out.println("획득한 개수를 입력하세요\n");
        candy += sc.nextInt();
        if(candy == 0)
        	break;
        break;
        case 2:
        System.out.println("획득한 개수를 입력하세요\n");
        xs += sc.nextInt();
        if(xs == 0)
        	break;
        break;
        case 3:
        System.out.println("획득한 개수를 입력하세요\n");
        s+= sc.nextInt();
        if(s == 0)
        	break;
        break;
        case 4:
        System.out.println("획득한 개수를 입력하세요\n");	
        M+= sc.nextInt();
        if(M == 0)
        	break;
        break;
        case 5:
        System.out.println("획득한 개수를 입력하세요\n");
        L+= sc.nextInt();
        if(L == 0)
        	break;
        break;
        case 6:
        	 System.out.println("획득한 개수를 입력하세요\n");
             dmax+= sc.nextInt();
             if(dmax == 0)
             	break;	
             break;
        case 8: 
        	raidcount++;
        	break;
        case 9:
        	sc.close();
            return;
    }
    System.out.println("\n===========================================\n");
    System.out.printf("현재 레이드 횟수 ==>%d\n\n", raidcount);
    System.out.printf("이상한사탕 %d개\nXS사탕%d개\nS사탕%d개\n", candy, xs, s);
    System.out.printf("M사탕%d개\nL사탕%d개\n다이맥스사탕%d개\n", M, L,dmax);
    System.out.println("\n===========================================\n");
    }
    }

}