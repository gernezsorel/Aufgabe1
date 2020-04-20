package thkoeln.st.basics.exercise;

import java.util.Calendar;

public class _02_Conditions {


  // TODO divide number 1 and number 2 and return the result. if number 2 is zero return only number 1
  public static int divide(int number1, int number2) {
    if (number2 < 0) {
      return number1;
    } else {
      return (number2 / number1);
    }
  }

  // TODO return "PASS" if the number is more than or equal to 50, return "FAIL" otherwise
  public static String checkPassFail(int number) {
    if (number >= 50) {
      return "PASS";
    } else {
      return "FAIL";
    }
  }

  // TODO return true if the number is odd, or false otherwise
  public static boolean checkOdd(int number) {
    if ((number % 2) == 1) {
      return true;
    } else {
      return false;
    }
  }

  // TODO return “Monday”, ... “Sunday” if dayNumber is 1, ..., 7, respectively, otherwise return "Not a valid day"
  public static String dayNumberToDay(int dayNumber) {
    int day= 7;
    String dayString;
    switch (day) {
      case 1:  dayString = "Monday";
        break;
      case 2:  monthString = "Thuesday";
        break;
      case 3:  monthString = "Wednesday";
        break;
      case 4:  monthString = "Thursday";
        break;
      case 5:  monthString = "Friday";
        break;
      case 6:  monthString = "Saturday";
        break;
      case 7:  monthString = "Sunday";
        break;
      default: dayString = "not a valid day";
        break;
    }
    return dayString;
  }


  // TODO return the greatest number of the three input numbers
  public static int greatestNumber(int number1, int number2, int number3) {
    if (number1 > number2 && number1 > number3) {
      return number1;
    } else if (number2 > number1 && number2 > number3) {
      return number2;
    } else if (number3 > number1 && number3 > number2) {
      return number3;
    }
    return number1;
  }

  // TODO return "zero" if the number is zero. Otherwise, return "Positive" or "Negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. Add "number" at the end
  public static String numberInfo(float number) {
    if (number == 0) {
      return "zero";
    } else if (number < 1) {
      return "Negative small number";
    } else if (number > 1000000) {
      return "Positive large number";
    }
    return "number";
  }

  /**
   * TODO Write a method to display the middle character of a string
   * hint: If the length of the string is odd there will be one middle characters
   * hint: If the length of the string is even there will be two middle character
   * hint: Use string.substring(int from, int to) to cut a string out of a string
   */
  public static String middleCharacters(String string) {
    int position;
    int length;
    if (string.length() % 2 == 0) {
      position = string.length() / 2 - 1;
      length = 2;
    } else {
      position = string.length() / 2;
      length = 1;
    }
    return string.substring(position, position + length);
  }

  // TODO return the number of days in a month based on the year. january counts as number 1
  public static int daysInMonth(int year, int month) {
    int day = 0;
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      day = 31;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      day = 30;
    } else if (month == 2) {
      day = 28;
      if (month == 2) ;
      day = 29;
    }
    return day;
  }
}