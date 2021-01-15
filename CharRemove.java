public class CharRemove
{
public static void main(String args[])
{
String str="Miraclesoftwaresystems";
System.out.println(charRemoveAt(str,9));
}
public static String charRemoveAt(String str,int p)
{
return str.substring(0,p)+str.substring(p+1);
}
}