import java.util.*;
 public class Converttime37 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input hours: ");
		int seconds = in.nextInt();
int hours=in.nextInt(); 
        seconds=3600*hours;
       
        System.out.print( +seconds);
		System.out.print("\n");
    }    
 }