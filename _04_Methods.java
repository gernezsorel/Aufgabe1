package thkoeln.st.basics.exercise;

public class _04_Methods {

  private static final int MINIMUM_PASSWORD_LENGTH = 10;
  private static final int MINIMUM_PASSWORD_DIGIT_COUNT = 2;
  private static final int MINIMUM_PASSWORD_LETTER_COUNT = 2;


  // TODO Write a method called "countVowels" to count all vowels in a string
  // The method takes one string as a parameter
  public static int countVowels(String string) {
    int count=0;
    for (int i=0;i<string.length();i++){
      if (string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'
              ||string.charAt(i)=='o'||string.charAt(i)=='u'){
        count++;
      }else {
        return count--;
      }
    }
return count++;
  }


  // TODO Write a method called "wordCount" to count all words in a string
  // The method takes one string as a parameter
  public static int wordCount(String string) {
    int wordCount = 0;
    boolean word = false;
    int endOfLine = string.length() - 1;
    for (int i = 0; i < string.length(); i++) {
      if (Character.isLetter(string.charAt(i)) && i != endOfLine) {
        word = true;
      } else if (Character.isLetter(string.charAt(i)) && word) {
        wordCount++;
        word = false;
      }
    }
    return wordCount;
  }



  /**
   * TODO Write a method called "isValidPassword" to check whether a string is a valid password
   * The method takes one string as a parameter
   * Password rules:
   * A password must have at least ten characters.
   * A password consists of only letters and digits.
   * A password must contain at least two digits and two letters.
   */
  public static boolean isValidPassword(String password) {
    int counter = 0;
    if (password.length() >= 10) {
      for (int index = 0; index < password.length(); index++) {
        char passChar = password.charAt(index);
        if (!Character.isLetterOrDigit(passChar)) {
          return false;
        } else {
          if (!Character.isDigit(passChar) && !Character.isLetter(passChar)) ;
          counter++;
        }
      }
    }
    if    (counter<2){
      return false;
    }
return true;
  }
  

  // TODO Write a method called "exponent" that returns an int value of base raised to the power of exp
  // The method takes two integers as parameters
  public static int exponent (int base,int n) {

    return n==0?1:(n==1?base:base*(exponent(base,n-1)));
  }
  
}
