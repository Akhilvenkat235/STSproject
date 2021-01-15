import java.util.Scanner;
class Digittrial
{
public static void main(String args[])
{
int count=0;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

while(a!=0)
{
a=a/10;
count++;
}
System.out.print(count);
}
}