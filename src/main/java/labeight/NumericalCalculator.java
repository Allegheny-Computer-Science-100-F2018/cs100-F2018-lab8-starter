package labeight;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class calculates different numerical values for a list of numbers.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */
public class NumericalCalculator {

  /**
   * Count the number of items in a list of numbers.
   *
   * @author Gregory M. Kapfhammer
   */
  public static int countNumbersInList(ArrayList<Integer> numberList) {
    // TODO: Add in a complete implementation of this method
    // Note that you need to determine the number of numerical values
    // that are provided to the method through the numberList parameter
    return 0;
  }

  /**
   * Display an entire list provided as an argument.
   *
   * @author Gregory M. Kapfhammer
   */
  public static void displayNumberList(ArrayList<Integer> numberList) {
    // TODO: Add a complete implementation of this method
    // Note that you will need to use a println statement inside of
    // a while loop in order to display all of the files in the list
  }

  /**
   * Finds the minimum value in a list of values.
   *
   * @author Gregory M. Kapfhammer
   */
  public static int findMinimumValue(ArrayList<Integer> numberList) {
    int minimum = 0;
    // TODO: Add a complete implementation of this method
    // Note that you will need to find and return the minimum value
    // in an arbitrary list using an Iterator extracted from the ArrayList
    return minimum;
  }

  /**
   * Finds the maximum value in a list of values.
   *
   * @author Gregory M. Kapfhammer
   */
  public static int findMaximumValue(ArrayList<Integer> numberList) {
    int maximum = 0;
    // TODO: Add a complete implementation of this method
    // Note that you will need to find and return the maximum value
    // in an arbitrary list using an Iterator extracted from the ArrayList
    return maximum;
  }

  /**
   * Calculate the arithmetic mean of a list of values.
   *
   * @author Gregory M. Kapfhammer
   */
  public static double calculateArithmeticMean(ArrayList<Integer> numberList) {
    double arithmeticMean = 0.0;
    // TODO: Finish the implementation of this method
    // Note that you can use the overall structure of this method
    // to inform the way in which you implement the other methods in this file
    Iterator<Integer> numberListIterator = numberList.iterator();
    while (numberListIterator.hasNext()) {
    }
    arithmeticMean = arithmeticMean / numberList.size();
    return arithmeticMean;
  }

}
