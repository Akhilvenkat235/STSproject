import java.util.Scanner;
class Validateuserinput
{
public static void main(String args[])
{
int i;

 Scanner sc= new Scanner(System.in);

System.out.println("Enter a number to valdate: ");
i=sc.nextInt();{

if(i>0 && i<10)
{

System.out.println("Enetred number is a valid input" +i );
}
else

System.out.println("Enetred number is not a valid input" +i);
}
}


}
