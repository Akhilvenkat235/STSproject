import java.util.Scanner;
class Numberofdigits
{
public static void main(String args[])
{
int i,n;
int count = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter any number: ");
n=sc.nextInt();
while(n>0)
{
n=n/10;
count++;}
System.out.format("Number of digits in a given number=%d",count);
}
}
