import java.util.Scanner;
public class Circle
{
public static void main(String args[])
{
double area;

double pi = 3.14;
int r;
Scanner s=new Scanner(System.in);
System.out.print("Enter the radius of the circle:");
r=s.nextInt();
area=pi*r*r;
System.out.println("area of circle is: "+ area);
}
}