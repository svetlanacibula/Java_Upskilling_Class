package Challenge_12;

import java.util.Arrays;

public class ClosestToZero {
  public static void main(String[] args) {
    int[] arr = {1, 60, -10, 70, -80, 85};

    int[] result = findClosestToZeroPair(arr);
    System.out.println("Pair closest to zero: " + result[0] + ", " + result[1]);
  }

  public static int[] findClosestToZeroPair(int[] arr) {

    Arrays.sort(arr);
    int left = 0, right = arr.length - 1;
    int minSum = Integer.MAX_VALUE;
    int[] closestPair = new int[2];

    while (left < right) {
      int sum = arr[left] + arr[right];

      if (Math.abs(sum) < Math.abs(minSum)) {
        minSum = sum;
        closestPair[0] = arr[left];
        closestPair[1] = arr[right];
      }

      if (sum < 0) {
        left++;
      }
      else {
        right--;
      }
    }
    return closestPair;
  }
}
