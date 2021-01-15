import java.util.Scanner;
public class Reversenumber {

    public static void main(String[] args) {

System.out.println("Enter the number:");
        int num , reversed = 0;
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}