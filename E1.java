class E1
{
public static void main(String args[])
{
int d=0;
int n=20;
try
{
int fraction = n/d;
System.out.println("End of main");
} 
catch(ArithmeticException e)
{
System.out.println("In the catch Block due  to Exception = " + e);

}
finally
{

System.out.println("Arithmetic error cant process request");
}

System.out.println("End of main");
}

}