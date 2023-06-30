package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testprintSum() {
    Calculate calculate = new Calculate();

    int x = 2, y = 3;
    int expected_sum = 5;
    double expected_ave = 2.5;
    String expected = "Sum of " + x + " and " + y + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printSum(x, y));
  }

  @Test
  public void testprintAllSum() {
    Calculate calculate = new Calculate();

    int start = 1, end = 10;
    int expected_sum = 55;
    double expected_ave = 5.5;
    String expected = "Sum of " + start + " to " + end + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printAllSum(start, end));
  }

  @Test
  public void testprintAllSumError() {
    Calculate calculate = new Calculate();

    int start = 1, end = 10;
    int expected_sum = 55;
    double expected_ave = 5.5;
    String expected = "Sum of " + start + " to " + end + " is " + expected_sum + ". Average is " + expected_ave + ".";

    assertEquals(expected, calculate.printAllSum(start, end));
  }

  @Test
  public void testprintOddEvenSum() {
    Calculate calculate = new Calculate();

    int start = 10, end = 1;
    String expected_return = "The first argument should be a number smaller than the second argument.";

    assertEquals(expected_return, calculate.printOddEvenSum(start, end));
  }

  @Test
  public void testprintOddEvenSumError() {
    Calculate calculate = new Calculate();

    int start = 10, end = 1;
    String expected_return = "The first argument should be a number smaller than the second argument.";

    assertEquals(expected_return, calculate.printOddEvenSum(start, end));
  }
}
