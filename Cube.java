import java.util.Scanner;
class Cube
{
public static void main(String args[])
{
int x;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of x:");
x = sc.nextInt();

System.out.println("Cube value of of x is " +(x*x*x));
}
}