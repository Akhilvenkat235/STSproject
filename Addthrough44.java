import java.util.Scanner;
class Addthrough44
{
public static void main(String args[])
{
int i,n=0;
int total=0;

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number: ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
total=total+n;
}
System.out.println("Sum of numbers is: " +total);
}
}
