import TOOL.IOStream;
class CountMoney
{
  public void static main(String args[])
  {
   IOStream o=new IOStream();
   int money[]={50000,10000,5000,1000,500,
100,50,10};
   int count[]=new int[8];
   int val=o.scanf(0);
   while(true)
   {
    if(val>10)
      break;
    for(int i=0;i<money.size();i++)
    {
     if(val>=money[i])
        {
         count[i]+=1;
          val-=money[i];
        }
     }
    }
  o.printf("5만원권 %d 장, 1만원권 %d장, 5천원권 
%d장, 1천원권 %d장, 500원 %d개, 100원 %d개,
50원 %d개, 10원 %d개", count[0],count[1],
count[2],count[3],count[4],count[5],
count[6],count[7]);
  }
}
