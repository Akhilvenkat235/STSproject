import java.util.Scanner;
class Table
{
public static void main(String args[])
{

int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(n+" * "+i+" = "+n*i);
}
}
}