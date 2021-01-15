import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the value or number:");
i=sc.nextInt();
{
if((i%4==0 && i%100!=0 && i%400==0))
{
System.out.println("Enetred year is a Leap year");}
else 
System.out.println("Enetered year is not a leap year");
}
}
}