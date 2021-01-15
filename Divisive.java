import java.util.Scanner;
 class Divisive
{

public static void main(String[] args)
{
int number;
 sc=new Scanner(System.in);
System.out.print("Please Enter any Number to Check whether it is Divisible by 3 and 5 :  ");
number=sc.nextInt();

if((number % 3 == 0) && (number % 5 == 0))
{
System.out.println("Given number  is Divisible by 3 and 5"); 
}

else
{
System.out.println(" Given number is  Not Divisible by 3 and 5"); 
}
}
}
