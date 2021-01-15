import java.util.Scanner;
class Neven
{
public static void main(String args[])
{

int i;
int n;

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
 n=sc.nextInt();


for(i=1;i<=n;i++)
{
if(i%2==0)

{


System.out.println(i+" ");
}
}
}
}