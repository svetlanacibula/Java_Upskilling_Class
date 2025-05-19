package Challenge_12;

import java.util.Arrays;
import java.util.Random;

public class Descending {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers1 = new int[20];

    for (int i = 0; i < numbers1.length; i++) {
      numbers1[i] = random.nextInt(20);
    }

    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers1));

    numbers1 = sortDescending(numbers1);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(numbers1));
  }

  public static int[] sortDescending(int[] numbers1) {
    Arrays.sort(numbers1);
    int[] descNumbers1 = new int[numbers1.length];

    for (int i = 0; i < numbers1.length; i++) {
      descNumbers1[i] = numbers1[numbers1.length - 1 - i];
    }
    return descNumbers1;
  }
}
