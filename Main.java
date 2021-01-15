public class Main {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Not Eligible to Vote");
    }
    else {
      System.out.println("Eligible to vote");
    }
  }

  public static void main(String[] args) {
    checkAge(20);
  }
}