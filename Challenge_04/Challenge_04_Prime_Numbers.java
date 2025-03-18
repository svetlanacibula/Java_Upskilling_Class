package Challenge_04;

public class Challenge_04_Prime_Numbers {
  public static void main(String[] args) {
    int startNumber = 10;
    int endNumber = 230;

    System.out.println("Prime numbers between " + startNumber + " and " + endNumber + " are: ");

    for (int i = startNumber; i < endNumber; i++) {
      if (isPrime(i)) {
        System.out.println(i + " ");
      }
    }
  }

  public static boolean isPrime(int n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
