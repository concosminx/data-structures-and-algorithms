package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * <p>
 * Example 3:
 * <p>
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class FizzBuzzSolutionNo412 {
  public List<String> fizzBuzz(int n) {
    List<String> x = new LinkedList<>();
    for (int nr = 1; nr <= n; nr++) {
      if (nr % 3 == 0 && nr % 5 == 0) {
        x.add("FizzBuzz");
      } else if (nr % 3 == 0) {
        x.add("Fizz");
      } else if (nr % 5 == 0) {
        x.add("Buzz");
      } else {
        x.add(String.valueOf(nr));
      }
    }

    return x;
  }
}
