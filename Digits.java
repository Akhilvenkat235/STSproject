import java.util.Scanner;
class Digits
{
public static void main(String args[])
{
int count=0;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int temp=a;
while(temp!=0)
{
temp=temp/10;
count++;
}
System.out.print(count);
}
}