package Challenge_04;

public class Challenge_04_Fibonacci_numbers {
  public static void main(String[] args) {

    int n = 14;
    System.out.println(findFibonacci(n));
  }

  public static boolean findFibonacci(int number) {
    int a = 0;
    int b = 1;
    do {
      int c = a;
      a = b;
      b = c + b;
    }
    while (b < number);

    if (b == number) {
      return true;
    }
    else {
      return false;
    }
  }
}
