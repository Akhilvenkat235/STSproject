import java.util.*;
import java.util.Scanner;
class Hp22
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();
double  sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+(float)1/Math.pow(2,i);
}
System.out.println("Sum of 1/1+1/2+1/2^2+1/2^3+.....+1/2^n"+n+" is "+sum);
}

}