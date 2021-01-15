import java.util.Scanner;
class Biggest
{
public static void main(String args[])
{
int number1;
int number2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of number1:");
number1=sc.nextInt();
System.out.println("Enter the value of number2:");
number2=sc.nextInt();
if(number1>number2)
{
System.out.println("number1 is the biggest");
}
else if(number1<number2)
{
System.out.println("number2 is the biggest");
}
else 
{
System.out.println("Both the numbers are equal");
}
}
}

