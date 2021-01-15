import java.util.Scanner;
public class Daysinmonth
{
public static void main(String args[])
{
int month;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a month:");
month=sc.nextInt();
if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
{
System.out.println("\n 31 Days in a month");
}
else if(month == 4 || month == 6 || month == 9 || month == 11)
{
System.out.println("\n 30 Days in a month");
}
else if(month == 2 )
{
System.out.println("Its a Leap year consisting of 28 or 29 Days");
}
else
System.out.println("Enter a valid number");
}
}

