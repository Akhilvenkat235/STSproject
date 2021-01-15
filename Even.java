import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number: ");
i=sc.nextInt();
if(i%2==0){

System.out.println("Enetred number is Even");
}
else 
System.out.println("Entered number is Odd");
}
}