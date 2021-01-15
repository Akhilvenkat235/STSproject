abstract class Vehicle
{
abstract void start();
}
class Car extends Vehicle
{
void start()
{
System.out.println("car Starts with a key");
}
}
class Scooter extends Vehicle
{
void start()
{
System.out.println("scooter Starts with a kick");
}

public static void main(String args[])
{
Car c= new Car();
c.start();

Scooter s= new Scooter();
s.start();
}
}



