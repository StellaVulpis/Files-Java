package build02;
import java.util.Scanner;
public class do_while
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input;
        int testnum = 0;
        //do while�� while�쓽 議곌굔�떇�씠 true�씪 �븣 諛섎났 �떎�뻾�븯�뒗 諛섎났臾몄씠�떎.
        // �떎�뻾 ==> 議곌굔 寃��궗 ==> 李� ==> �떎�뻾 / 嫄곗쭞 ==> 醫낅즺
        // �븳踰덉뿉 諛섎났�슏�닔留뚰겮 諛섎났�떎�뻾�븯怨� 醫낅즺�븯�뒗 while, for���뒗 �떖由�(1 2 3 4 5 �쟾遺� 異쒕젰)
        // do while�� �븳踰� �떎�뻾�븯怨� 李� / 嫄곗쭞 泥댄겕 �썑 �떎�떆 �삉 �떎�뻾�븯湲곗뿉(1 異쒕젰 => 李몄씪�븣 2異쒕젰�꺕�꺕�꺕) 
        // 諛섎났 �슏�닔瑜� �꽕�젙�븯吏� �븡怨� 醫낃껐議곌굔留� �꽕�젙�븯怨� �떢�떎硫� do while�씠 �쟻�빀�븯�떎.
         do
         {
             System.out.println("怨꾩냽�븯�젮硫� 1, 醫낅즺�븯�젮硫� 0�쓣 �엯�젰�븯�떆�삤");
             input = sc.nextInt();
             if(input != 0)
             System.out.println(testnum += 1);
         }while(input != 0);
         //==============================================================================================================
        sc.close();
        return;
    }
}