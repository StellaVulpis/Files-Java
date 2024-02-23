abstract class Furry
{
  public String play;
  public String name;
  abstract void setSound();
}

class CatFurry extends Furry
{
  public void setSound()
  {
    this.name = "CatFurry";
    System.out.println("Saving 'Meow' to 'play' variable in Furry superclass...");
    this.play="Meow";
  }
}

class DogFurry extends Furry
{
  
  public void setSound()
  {
    this.name="DogFurry";
    System.out.println("Saving 'Rawr' to 'play' variable in Furry superclass...");  
    this.play="Rawr";
  }
}

public class MAIN
{
  static void println(Furry obj)
  {
    System.out.println("Received "+obj.name+" class into Furry Superclass.");
    System.out.println(obj.name+" class was applied to the value of method and variables in Furry abstract superclass");
    System.out.println("========================================");
    System.out.println("Printing "+obj.play);
    
  }
  public static void main(String args[])
  {
    CatFurry ct = new CatFurry();
    ct.setSound();
    println(ct);
      System.out.println("========================================");
    DogFurry dg = new DogFurry();
    dg.setSound();
    println(dg);
      System.out.println("========================================");
  }
}
