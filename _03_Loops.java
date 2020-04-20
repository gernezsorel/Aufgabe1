package thkoeln.st.basics.exercise;

public class _03_Loops {

  // TODO calculate the sum of the first ten natural numbers, beginning at 1, using a loop
  public static int sumOfFirstTenNaturalNumbers() {
    int n;
    for (n = 1; n <= 10; n++) {
      return n;
    }
    return n;
  }

  // TODO calculate the number of digits the number consists of
  public static int numberOfDigits(int number) {
    int count=0;
    while (number!=0){
      number=number/10;
      ++count;
    }
    return count;
  }

  // TODO calculate the cross sum of the number (sum of digits)
  public static int crossSum(int number) {
    int summe = 0;
    while (number < 0) {
      summe = summe + number % 10;
      number = number / 10;
    }
    return summe;
  }

  // TODO reverse a string
  public static String reverseString(String str) {
int i,len=str.length();
StringBuilder dest=new StringBuilder(len);
for (i=(len-1) ;i>=0;i--){
  dest.append(str.charAt(i));
}
return dest.toString();
  }

  // TODO calculate the sum of all positive odd numbers up to a given number
  public static int sumOfOddNumbers(int number) {
int sum=0;
for (int i=0;i<=number;i++) {
  if (i % 2 != 0) ;
  {
    sum += i;
  }
}
  return sum;
  }

  /**
   * TODO count the number of occurrences of a given letter in a string
   * hint: use string.length() to get the length of a string
   * hint: use method string.charAt(index) to get a certain letter
   *       note that string.charAt(0) returns the first letter and
   *       string.charAt(string.length()-1) returns the last letter
   */
  public static int numberOfOccurrences(String string, char letter) {
    int count = 0;
    for (int i = 0; i < string.length(); i++)
    {
      if (string.charAt(i) == letter)
      {
        count++;
      }
    }
    return count;
  }




    /**
     * Write a (non recursive) method that returns the nth element of the Fibonacci Sequence
     * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
     * The next number is found by adding up the two numbers before it.
     * Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
     *
     * Source: https://code-exercises.com/programming/medium/9/fibonacci-number
     */
    public static int fibonacci(int n) {
      if(n==0){
        return 0;
      }
      else if(n==1){
        return 1;
      }else return fibonacci(n-1)+fibonacci(n-2);

    }
  }




