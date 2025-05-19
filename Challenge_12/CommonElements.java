package Challenge_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
  public static void main(String[] args) {

    int[] array1 = {1, 2, 3, 4, 5, 6, 7};
    int[] array2 = {4, 5, 6, 7, 8, 9, 10};

    int[] commonElements = findCommonElements(array1, array2);

    System.out.println("Common elements: " + Arrays.toString(commonElements));
  }

  public static int[] findCommonElements(int[] arr1, int[] arr2) {
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> commonList = new ArrayList<Integer>();

    for (int num : arr1) {
      list1.add(num);
    }

    for (int num : arr2) {
      if (list1.contains(num) && !commonList.contains(num)) {
        commonList.add(num);
      }
    }

    int[] result = new int[commonList.size()];
    for (int i = 0; i < commonList.size(); i++) {
      result[i] = commonList.get(i);
    }
    return result;
  }
}
