class Exception1
{
public static void main(String args[])
{
int x=5;
int y=0;
int z=0;
try{
z=x/y;
}

catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{

System.out.println(e);
}
finally
{

System.out.println("nothing");}
System.out.println("rest of code");
}
}
