import java.util.Scanner;
class Interest
{
public static void main(String args[])
{
int Interest;
int loan_amount;
int rate;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of loan_amount: ");
loan_amount=sc.nextInt();
System.out.println("Enter the value of rate: ");
rate=sc.nextInt();
Interest=loan_amount*rate;
System.out.println(" the obatined interest value is  " +Interest);
}
}
