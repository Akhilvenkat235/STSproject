import java.util.*;
import java.util.Scanner;
class Hp22
{
int fact;
int factorial(int n)
{
if(n==1)
return 1;
else
{
fact=n*factorial(n-1);
return fact;
}
}
public static void main(String args[])
{
double sum=0;
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
sum=sum+(i*i)/factorial(int n);
}
System.out.println("Sum of 1 + x/1! + x^2/2! + x^3/3! + .......... + x^n/n! "+n+" is "+sum);
}

}