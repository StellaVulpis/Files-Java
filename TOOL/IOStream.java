// import TOOL.*;
// IOStream io = new IOStream();
import java.util.Scanner;
package TOOL;
public class IOStrem
{
String ln="\n---------------------------------\n";
public IOStream() {}
public String scLine(String text)
{
Scanner sc = new Scanner(System.in);
System.out.print(text+": ");
return sc.nextLine();
}
public int scInt(String text)
{
Scanner sc = new Scanner(System.in);
System.out.print(text+": ");
return sc.nextInt();
}
public printf(String text)
{
System.out.printf(text);
}
public println(String text)
{
System.out.println(text);
}
public print(String text)
{
System.out.print(text);
}
}
