package Challenge_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NoDuplicate {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[20];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(20);
    }
    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));

    numbers = removeDuplicates(numbers);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(numbers));

  }
  public static int[] removeDuplicates(int[] numbers){
    Set<Integer> set = new HashSet<>();
    for (int num : numbers) {
      set.add(num);
    }
    int[] result = set.stream().mapToInt(Integer::intValue).toArray();
    return result;
  }
}
