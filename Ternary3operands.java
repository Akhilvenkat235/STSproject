import java.util.Scanner;
class Ternary3operands
{
public static void main(String args[])
{
int number1,number2,number3,temp,smallest;
int max;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the first number:");
number1=sc.nextInt();

System.out.println("Enter the second number: ");
number2=sc.nextInt();
System.out.println("Enter the third number: ");
number3=sc.nextInt();




temp = (number1 < number2) ? number1 : number2;
smallest=number3<temp?number3:temp;

System.out.println("smallest number is " +smallest);
}
}