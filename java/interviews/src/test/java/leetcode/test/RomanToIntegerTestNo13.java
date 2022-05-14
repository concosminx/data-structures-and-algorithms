package leetcode.test;

import leetcode.RomanToIntegerSolutionNo13;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RomanToIntegerTestNo13 {

  @Test
  public void test3() {
    RomanToIntegerSolutionNo13 solution = new RomanToIntegerSolutionNo13();
    Assertions.assertEquals(3, solution.romanToInt("III"));
  }

  @Test
  public void test58() {
    RomanToIntegerSolutionNo13 solution = new RomanToIntegerSolutionNo13();
    Assertions.assertEquals(58, solution.romanToInt("LVIII"));
  }

  @Test
  public void test1994() {
    RomanToIntegerSolutionNo13 solution = new RomanToIntegerSolutionNo13();
    Assertions.assertEquals(1994, solution.romanToInt("MCMXCIV"));
  }

}
