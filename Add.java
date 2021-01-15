import java.util.Scanner;
public class Add
{
public static void main(String args[])
{
int x;
int y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of x:");
x=sc.nextInt();
System.out.println("Enter the value of y:");
y=sc.nextInt();

System.out.println("the value of x is :" +(x+y));
System.out.println("the value of x is :" +(x-y));
System.out.println("the value of x is :" +(x*y));
System.out.println("the value of x is :" +(x/y));
}
}