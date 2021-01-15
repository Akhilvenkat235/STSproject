class Student11{  
 float marks=99;  
}  
class Student12 extends Student11{  
 double percentage=97.1; }
class Test3
{ 
 public static void main(String args[]){  
   Student12 s=new Student12();  
   System.out.println("Student12 percentage is:"+s.marks);  
   System.out.println("Student12 marks  is:"+s.percentage);  
}  
}