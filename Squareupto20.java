import java.util.Scanner;
class Squareupto20
{
public static void main(String args[])
{

int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
 i=sc.nextInt();
for(i=1;i<=20;i++)
{
System.out.println(i+" * "+i+" = "+i*i);
}
}
}