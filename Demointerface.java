interface Demointerface
{
int add();
int sub();
}
class A implements Demointerface
{
public int add()
{

return 0;


}
public int sub()
{
return 0;
}
public static void main(String args[])
{
	A a= new A();
	a.add();
}
}

