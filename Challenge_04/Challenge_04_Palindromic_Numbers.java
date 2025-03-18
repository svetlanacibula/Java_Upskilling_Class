package Challenge_04;

public class Challenge_04_Palindromic_Numbers {
  public static void main(String[] args) {
    int number = 123324;

    if (isPalindromic(number)) {
      System.out.println("It is palindromic");
    }
    else {
      System.out.println("It is not palindromic");
    }
  }

  public static int reverseNumber(int number) {
    int reversedNumber = 0;
    int reminder;

    while (number > 0) {
      reminder = number % 10;
      reversedNumber = (reversedNumber * 10) + reminder;
      number = number / 10;
    }

    return reversedNumber;
  }

  public static boolean isPalindromic(int number) {

    return number == reverseNumber(number);
  }
}
