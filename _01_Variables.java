package thkoeln.st.basics.exercise;

public class _01_Variables {


    // TODO calculate the sum of number 1 and number 2 and return the result
    public static int sumInt(int number1, int number2) {
        return number1 + number2;
    }

    // TODO calculate the product of number 1 and number 2 and return the result
    public static int multiplyInt(int number1, int number2) {
        return number1 * number2;
    }

    // TODO multiply number 1 with the sum of number 2 and number 3 and return the result
    public static int calculationInt(int number1, int number2, int number3) {
        return number1 * (number2 + number3);
    }

    // TODO if input is false return true, if input is true return false
    public static boolean oppositeBoolean(boolean input) {
        if (input) {
            return false;
        } else {
            return true;
        }
    }

    // TODO compute the average of three int numbers
    public static float average(int number1, int number2, int number3) {
        return (float) (number1 + number2 + number3) / 3;

    }

    // TODO concat string 1, string 2 and string 3
    public static String concatString(String string1, String string2, String string3) {
        return string1.concat(string2).concat(string3);

    }

    // TODO return a string which contains 'Hello'
    public static String helloString() {
        return "Hello";
    }

    // TODO multiply two float numbers and return the result
    public static float multiplyFloat(float number1, float number2) {

        return (float) (number1 * number2);
    }

    // TODO replace all occurrences of "a" in the string by "b", and then all "b" by "c". The method
    // should  be case-sensitive!
    // Hint: Use the method string.replace
    public static String replaceABString(String string1) {

        String str1 = string1.replaceAll("a", "b");
        String str2 = string1.replaceAll("b", "c");
        return str1;
    }

    // TODO divide number 1 and number 2 and return the part before the comma of the result e.g. 5 / 2 = 2.5 -> return 2
    public static float divideFloatAndReturnInt(float number1, float number2) {
       float number=(number1 / number2);
        return  (int)number;

    }



      // TODO divide number 1 and number 2 (each as int) and return the part after the comma of the result e.g. 5 / 2 = 2.5 -> return 0.5
      public static float divideIntsAndReturnFloatRest(int number1, int number2) {
      float number=(number1/number2);
    return (float)number-(int)number;
      }
}

