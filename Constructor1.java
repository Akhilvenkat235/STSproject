class Constructor1
{
int roll;
String name;
int marks;
Constructor1(int roll,String name, int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;

}
public static void main(String args[])
{
Constructor1 id1=new Constructor1(1,"akhil",99);
Constructor1 id2 = new Constructor1(2,"Anil",96);
Constructor1 id3 = new Constructor1(3,"Rahul",92);
System.out.println("Constructor1 : " + id1.roll +" "+ id1.name +" "+ id1.marks);
System.out.println("Constructor1 : " + id2.roll +" "+ id2.name +" "+ id2.marks);
System.out.println("Constructor1 : " + id3.roll +" "+ id3.name +" "+ id3.marks);

}
}