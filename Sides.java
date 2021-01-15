abstract class Shape
{
abstract void  numberofSides();
}
class Trapezoid extends Shape
{
void numberofSides()
{
System.out.println("Number of sides are 4");
}
}
class Triangle extends Shape
{
void numberofSides()
{
System.out.println("Number of sides are 3");
}
}
class Hexagon extends Shape
{
void numberofSides()
{
System.out.println("Number of sides are 6");
}
}
public class Sides
{
public static void main(String args[])
{
Shape t=new Trapezoid();
Shape e=new Triangle();
Shape f=new Hexagon();
t.numberofSides();
e.numberofSides();
f.numberofSides();
}
}

