package thkoeln.st.basics.exercise;

public class _06_Arrays {

  /**
   * Write a Java method to calculate the average value of array elements.
   * <p>
   * Source: https://www.w3resource.com/java-exercises/array/java-array-exercise-4.php
   */
  public static double average(int[] numbers) {
    int n = 0;

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += n;
    }
    double average = sum / n;
    return average;
  }

  /**
   * Write a Java method to test if an integer array contains a specific value.
   * <p>
   * Source: https://www.w3resource.com/java-exercises/array/java-array-exercise-5.php
   */
  public static boolean contains(int[] arr, int item) {
    for (int i : arr) {
      if (i == item) {
        return true;
      }
    }
    return false;
  }

  /**
   * Write a Java method to reverse an array of integer values.
   * <p>
   * Source: https://www.w3resource.com/java-exercises/array/java-array-exercise-11.php
   */
  public static int[] reverse(int[] arr) {
    int n = 0;
    for (int i = 0; i < n / 2; ++i) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
    return arr;
  }

  /**
   * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
   * <p>
   * has12([1, 3, 2]) → true
   * has12([3, 1, 2]) → true
   * has12([3, 1, 4, 5, 2]) → true
   * <p>
   * Source: https://codingbat.com/prob/p169260
   */
  public static boolean has12(int[] arr) {
    boolean foundOne = false;
    boolean foundOneTwo = true;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        foundOne = true;
      }
      if (arr[i] == 1 && foundOne) {
        foundOneTwo = true;
      }
    }

    return foundOneTwo;
  }

  /**
   * Write a Java method which returns the new length of an array after duplicate elements have been removed
   * Sample array: [20, 20, 30, 40, 50, 50, 50]
   * After removing the duplicate elements the method should return 4
   * <p>
   * Source: https://www.w3resource.com/java-exercises/array/java-array-exercise-33.php
   */
  public static int duplicateElements(int[] elements) {
    int index = 1;

    for (int i = 0; i < elements.length; i++) {
      for (int j = 0; j < elements.length; j++) {
        if (elements[i] == elements[j]) {
          elements[j] = elements[j] - 1;
          j--;
        } else if (elements[i] != elements[j]) {
          elements[j] = elements[j];
          j++;
        }
      }

    }
    return index;
  }


  /**
   * Write a Java method to find one missing number in an integer sequence. The sequence starts with 1 and ends with the highest number. There is only one number missing
   * Sequence [1,3,6,4,2,7] misses 5
   * <p>
   * Source: https://www.w3resource.com/java-exercises/array/java-array-exercise-24.php
   */
  public static int missingNumber(int[] sequence) {
    int j = 0;
    int k = 0;
    int missingNum = 0;
    int[] arrayInt = sequence;
    int diff = 0;
    for (int i = 0; i < arrayInt.length - 2; i++) {
      j = arrayInt[i + 1] - arrayInt[i];

      k = arrayInt[i + 2] - arrayInt[i + 1];
      if (j == k) {
        diff = k;
      }
      if (j != k) {
        if (j != diff) {
          missingNum = arrayInt[i] + diff;
        } else if (k != diff) {
          missingNum = arrayInt[i + 1] + diff;
        }


      }

    }

    return missingNum;
  }

  /**
   * Return a version of the given array where all the 10's have been removed.
   * The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
   * You may modify and return the given array or make a new array.
   * <p>
   * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
   * withoutTen([10, 2, 10]) → [2, 0, 0]
   * withoutTen([1, 99, 10]) → [1, 99, 0]
   * <p>
   * Source: https://codingbat.com/prob/p196976
   */
  public static int[] withoutTen(int[] numbers) {
    int[] result = new int[numbers.length];
    int j = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 10) {
      } else {
        result[j] = numbers[i];
      }
    }
    for (int i = j; i < numbers.length; i++) {
      result[i] = 0;
    }
    return result;
  }
}