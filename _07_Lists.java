package thkoeln.st.basics.exercise;

import java.util.*;

public class _07_Lists {

  /**
   * Write a Java method returning a list which contains only the positive elements of an given array of integers. Zero is considered positive
   *
   * @return
   */
  public static int filterPositive(int[] numbers) {
    int index = 0;
    int[] positives;
    positives = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      if ((numbers[i] != 0 && numbers[i] >= 0)) {
        {
          positives[i] = numbers[i];
        }
      }
    }
    return index;
  }


  /**
   * Return a list that contains exactly the same numbers as the given list, but rearranged so that every 3 is immediately followed by a 4.
   * Do not move the 3's, but every other number may move. The list contains the same number of 3's and 4's, every 3 has a number after it that is not a 3.
   * The lists size is at least 3
   * <p>
   * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
   * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
   * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
   * <p>
   * Source: https://codingbat.com/prob/p159339
   */
  public static ArrayList<Integer> fix34(List<Integer> numbers) {
    Queue<Integer> index4 = new LinkedList<>();
    Queue<Integer> index3 = new LinkedList<>();
    ArrayList<Integer> newNumbers = new ArrayList<>(numbers);
    for (int i = 0; i < numbers.size(); i++) {
      int value = numbers.get(i);
      if (value == 3) {
        if (index4.peek() != null) {
          int index = index4.poll();
          newNumbers.set(index, numbers.get(i + 1));
          newNumbers.set(i + 1, 4);
        } else {
          index3.add(i);
        }

      } else if (value == 4) {
        if (index3.peek() == null) {
          index4.add(i);
        } else {
          int index = index3.poll();
          if (i - index > 1) {
            newNumbers.set(i, numbers.get(index + 1));
            newNumbers.set(index + 1, 4);
          }
        }
      }
    }
    return newNumbers;
  }

  /**
   * Given a non-empty list, return true if there is a place to split the list so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
   * <p>
   * canBalance([1, 1, 1, 2, 1]) → true
   * canBalance([2, 1, 1, 2, 1]) → false
   * canBalance([10, 10]) → true
   * <p>
   * Source: https://codingbat.com/prob/p158767
   */
  public static boolean canBalance(List<Integer> numbers) {
    ArrayList<Integer> newNumbers = new ArrayList<>(numbers);
    int index = 0;
    int leftsum = 0;
    int rightsum = 0;
    int total = 0;
    for (int k = 0; k < numbers.size(); k++) {
      total = total + numbers.get(k);
    }
    while (index < numbers.size()) {
      for (int j = 0; j <= index; j++) {
        leftsum = leftsum + numbers.get(j);
      }
      rightsum = total - leftsum;
      if (leftsum == rightsum)
        return true;
      else if (leftsum > rightsum)
        return false;
      leftsum = 0;
      index++;
    }
    return false;

  }

  /**
   * Given n>=0, create a list with length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
   * <p>
   * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
   * squareUp(2) → [0, 1, 2, 1]
   * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
   * <p>
   * Source: https://codingbat.com/prob/p155405
   */
  public static ArrayList<Integer> squareUp(int numbers) {
    List<Integer> list = new ArrayList(Collections.nCopies(numbers*numbers,0));
    if(numbers<=0)return (ArrayList<Integer>) list;
    for (int i=numbers-1;i<numbers*numbers;i+=numbers) {
      for (int y = i; y < i - (i / numbers); y--) {
        list.set(y, i - y + 1);
      }
    }
return (ArrayList<Integer>) list;

  }

  /**
   * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
   * <p>
   * countClumps([1, 2, 2, 3, 4, 4]) → 2
   * countClumps([1, 1, 2, 1, 1]) → 2
   * countClumps([1, 1, 1, 1, 1]) → 1
   * <p>
   * Source: https://codingbat.com/prob/p193817
   */
  public static int clump(List<Integer> numbers) {
    ArrayList<Integer> Numbers = new ArrayList<>(numbers);
    boolean match = false;
    int count = 0;
    for (int i = 0; i < numbers.size() - 1; i++) {
      if (numbers.get(i) == numbers.get(i + 1) && !match) {
        match = true;
        count++;
      } else if (numbers.get(i) != numbers.get(i + 1)) {
        match = false;
      }


    }
    return count;
  }
}
