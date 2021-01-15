import java.util.StringTokenizer;  
public class Stringtokenizer{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is Akhil"," ");  
  while(st.hasMoreTokens())   {  
         System.out.println(st.nextToken());  
     }  
   }  
}