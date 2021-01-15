import java.util.Scanner;
class Print
{
public static void main(String args[])
{
int n1;
char X;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number to be displayed : ");
n1=sc.nextInt();
System.out.println("Enter the character to be displayed: ");
X=sc.next().charAt(0);
System.out.println("eneterd number is " + n1);
System.out.println("Entered character is " + X);
}
}
