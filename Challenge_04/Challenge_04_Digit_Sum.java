package Challenge_04;

public class Challenge_04_Digit_Sum {
  public static void main(String[] args) {
    int number = 12345;
    int sum = 0;

    if (number < 0) {
      System.out.println("Number must be positive");
    }
    else {
      while (number != 0) {
        sum += number % 10;
        number /= 10;
      }
      System.out.println("Sum of digits: " + sum);
    }
  }
}
