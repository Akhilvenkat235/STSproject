interface T1interface
{
void show();
}
class Test implements T1interface

{
public void show()
{
System.out.println("1");
}
public static void main(String args[])
{
Test t=new Test();
t.show();
}
}