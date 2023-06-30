package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public String printSum(int x, int y) {
    int sum = sum(x, y);
    double ave = sum / 2.0;

    return "Sum of " + x + " and " + y + " is " + sum + ". Average is " + ave + ".";
  }

  public String printAllSum(int start, int end) {
    int sum = 0, cnt = 0;
    double ave;

    if (end < start) {
      return "The first argument should be a number smaller than the second argument.";
    } else {
      for (int i = start; i <= end; i++) {
        sum = sum(sum, i);
        cnt++;
      }
    }

    ave = (double) sum / cnt;

    return "Sum of " + start + " to " + end + " is " + sum + ". Average is " + ave + ".";
  }

  public String printOddEvenSum(int start, int end) {
    int odd_sum = 0, even_sum = 0;

    if (end < start) {
      return "The first argument should be a number smaller than the second argument.";
    } else {
      for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
          even_sum = sum(even_sum, i);
        } else {
          odd_sum = sum(odd_sum, i);
        }
      }
    }

    return "Sum of odd of " + start + " to " + end + " is " + odd_sum + ". Sum of even is " + even_sum + ".";
  }
}
