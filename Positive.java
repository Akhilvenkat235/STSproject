import java.util.Scanner;
class Positive
{
public static void main(String args[])
{
int i,n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n:");
i=sc.nextInt();

if(i>=0)
{
System.out.println("Enered number is positive");
}
else 
System.out.println("Eneterd number is negative");
}
}