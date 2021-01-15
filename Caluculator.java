import java.util.Scanner;

public class Caluculator
{
public static void main(String args[])
{
Scanner reader =new Scanner(System.in);
System.out.println("Enter the numbers: ");
double n1=reader.nextDouble();
double n2=reader.nextDouble();
System.out.println("Enter an operator (+, -, *, /):");
char operator = reader.next().charAt(0);
double result;
switch (operator)
{
case '+':
result=n1 + n2;
break;

case '-':
result = n1 - n2;
break;

case '*':
result = n1 * n2;
break;
 
case '/':
result = n1 / n2;
break;
default:
System.out.println("Error! Operator is not correct");
}
}
System.out.println( "result is " +result);

}
