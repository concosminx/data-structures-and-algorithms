package leetcode;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 27
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: n = 0
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: n = 9
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * -231 <= n <= 231 - 1
 */
public class PowerOfThreeSolutionNo326 {
  public boolean isPowerOfThreeLoop(int n) {
    if (n < 1) {
      return false;
    }
    while (n % 3 == 0) {
      n /= 3;
    }
    return n == 1;
  }

  public boolean isPowerOfThreeBaseConversion(int n) {
    return Integer.toString(n, 3).matches("^10*$");
  }

  public boolean isPowerOfThreeItegerLimit(int n) {
    return n > 0 && 1162261467 % n == 0;
  }
}
