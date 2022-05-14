package leetcode.test;

import leetcode.SingleNumberSolutionNo136;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTestNo136 {

  @Test
  public void test1() {
    SingleNumberSolutionNo136 solution = new SingleNumberSolutionNo136();
    int expected = 1;
    int actual = solution.singleNumber(new int[] {1});
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    SingleNumberSolutionNo136 solution = new SingleNumberSolutionNo136();
    int expected = 4;
    int actual = solution.singleNumber(new int[] {4,1,2,1,2});
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void test3() {
    SingleNumberSolutionNo136 solution = new SingleNumberSolutionNo136();
    int expected = 1;
    int actual = solution.singleNumber(new int[] {2,2,1});
    Assertions.assertEquals(expected, actual);
  }

}
