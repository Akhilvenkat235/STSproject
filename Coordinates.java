import java.util.Scanner;
class Coordinates
{
public static void main(String args[])
{
int x,y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values of x and y:");
x=sc.nextInt();
y=sc.nextInt();
if(x==0 && y==0)
{
System.out.println("Point lies on Centre");
}
else if(x==0)
{
System.out.println("Point lies on y coordinate");
}
else if(y==0)
{
System.out.println("Point lies on x coordinate ");
}
else
{
System.out.println("point neither lies on x coordinate nor y coordinate");
}
}
}
