public class AOB {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3,4,5};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Take a number with in the Array bound");
    } finally {
      System.out.println("The number not found.");
    }
  }
}
