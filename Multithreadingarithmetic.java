public class Multithreadingarithmetic
{
int add(int n1,int n2){
return n1+n2;}
int sub(int n1,int n2,int n3)
{
return n1-n2-n3;
}
int mul(int n1,int n2,int n3,int n4)
{
return n1*n2*n3*n4;
}
double div(int n1,int n2,int n3,int n4,int n5)
{
return n1/n2/n3/n4/n5;
}
public static void main(String args[])
{
Multithreadingarithmetic m=new Multithreadingarithmetic();
System.out.println("Addition operator:" +m.add(2,3));
System.out.println("Subtraction operator:" +m.sub(2,3,4));
System.out.println("Multiplication operator:" +m.mul(2,3,4,5));
System.out.println("Divisionion operator:" +m.div(2,3,4,5,6));
}
}