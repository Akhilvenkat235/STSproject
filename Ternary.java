import java.util.Scanner;
class Ternary
{
public static void main(String args[])
{
int number1,number2;
int max;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the first number:");
number1=sc.nextInt();

System.out.println("Enter the second number: ");
number2=sc.nextInt();





max = (number1 > number2) ? number1 : number2;

System.out.println("Largest number is " +max);
}
}