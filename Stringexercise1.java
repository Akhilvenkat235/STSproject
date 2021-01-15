public class Stringexercise1

{
public static void main(String[] args)
{
String str="Miracle software syystems";
System.out.println(charRemoveAt(str,7));
}
 
public static String charRemoveAt(String str, int p) {  
 return str.substring(0, p) + str.substring(p + 1);
 }
}
