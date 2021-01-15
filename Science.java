abstract class SubjectAbstract
{
abstract void marks();
}
class Maths extends SubjectAbstract
{
void marks()
{
System.out.println("Marks obtained are 95");
}
}

class Science extends SubjectAbstract
{

void marks()
{
System.out.println("Marks obtained are 96");
}


public static void main(String args[])
{
SubjectAbstract s= new Maths();
s.marks();

}
}


