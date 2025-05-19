package Challenge_12;

import java.util.HashSet;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};

    int[] longestSeq = findLongestConsecutiveSequence(arr);
    System.out.println("Longest consecutive sequence: ");
    for (int num : longestSeq) {
      System.out.print(num + " ");
    }
  }

  public static int[] findLongestConsecutiveSequence(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      set.add(num);
    }

    int longestLength = 0;
    int startNum = 0;

    for (int num : arr) {
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int currentLength = 1;

        while (set.contains(currentNum + 1)) {
          currentNum++;
          currentLength++;
        }

        if (currentLength > longestLength) {
          longestLength = currentLength;
          startNum = num;
        }
      }
    }

    int[] longestSeq = new int[longestLength];
    for (int i = 0; i < longestLength; i++) {
      longestSeq[i] = startNum + i;
    }

    return longestSeq;
  }
}
