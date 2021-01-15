import java.io.*; 
import java.util.Scanner;
  
class Sumofdigitsinnum { 

      public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enetr a number :");
 
    {     
        int sum = 0; 
int n;
n= sc.nextInt();
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
System.out.println(+sum);
      
   }
    } 
}

