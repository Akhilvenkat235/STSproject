class Student
{
void Student_Details()
{
System.out.println("Enter the detais of student");
}
}
class Teacher extends Student
{
void Teacher_Details()
{
System.out.println("Enter details of the Teacher");
}
}
public class College
{

public static void main(String args[])
{
Teacher c=new Teacher();
c.Student_Details();
c.Teacher_Details();
}
}
