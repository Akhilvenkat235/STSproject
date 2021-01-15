class Countwords
{
public static void main(String args[])
{
String str= "Miracle software systems bhoghapuram";
System.out.println(countWord(str));
}
static int countWord(String str)
{
int count=1;

for(int i=0;i<str.length();i++)
{

if(str.charAt(i)==' ' && i< str.length()-1 && str.charAt(i+1)!=' ')
{
count++;
}
}
return count;
}
}


