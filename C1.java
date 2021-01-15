import java.util.*;  
class C1{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
     // System.out.println("Number of elements +"alist.size());
      
      System.out.println(alist);
      alist.add(3, "Steve");
      System.out.println(alist);
      alist.set(0,"Lucky");
      System.out.println(alist);
  System.out.println("------------------------");
      alist.remove("Tom");
      System.out.println(alist);
      alist.remove(3);
      System.out.println(alist);
System.out.println("------------------------");
    for(String str:alist)
      System.out.println(str);
      System.out.println("Number of elements " +alist.size());
      System.out.println("------------------------");
      Collections.sort(alist);
     for(String str:alist)
      System.out.println(str);
      //String str=alist.indexOf("Angela");
   }  
}