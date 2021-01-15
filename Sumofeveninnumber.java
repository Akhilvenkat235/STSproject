import java.util.*;
class Sumofeveninnumber
{
Static int reverse(int n)
{
int rev=0;
rev=(rev*10)+(n%10);
n=n/10;
}
return rev;
}
Static void getSum(int n)
{
n=reverse(n);
int sumOdd=0,sumEven=0,c=1;
while(n!=0)
{
if(c%2==0)
sumEven += n % 10;
else
sumOdd += n % 10;
n=n/10;
c++;
}
System.out.println("Sum odd= " + sumOdd);
System.out.println("Sum Even= " + sumEven);
}
public static void main(String args[])
{
int n=85323;
getSum(n);
}
}