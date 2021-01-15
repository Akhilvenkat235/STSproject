import java.util.*;
import java.util.Scanner;
class Hp21
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();
double  sum=0;
for(i=1;i<=n;i++)
{
sum=sum+(float)1/i;
}
System.out.println(+sum);
}

}