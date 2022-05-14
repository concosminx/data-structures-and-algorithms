package leetcode.test;

import leetcode.ReverseStringSolutionNo344;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class ReverseStringTestNo344 {

  @TestFactory
  Stream<DynamicTest> testDifferentMultiplyOperations() {
    ReverseStringSolutionNo344 solution = new ReverseStringSolutionNo344();
    String[][] data = new String[][] {
        {"hi", "ih"},
        {"robot", "tobor"},
        {"x","x"},
        {"Hannah", "hannaH"},
        {"rom", "mor"},
        {"John", "nhoJ"}
    };
    return Arrays.stream(data).map(entry -> {
      char[] actual = entry[0].toCharArray();
      char[] expected = entry[1].toCharArray();
      solution.reverseString(actual);
      return dynamicTest(" reverse of " + entry[0] + " is " + entry[1], () -> {
        assertArrayEquals(expected, actual);
      });
    });
  }


  @Test
  void testHello() {
    ReverseStringSolutionNo344 solution = new ReverseStringSolutionNo344();
    char[] actual = new char[] {'h','e','l','l','o'};
    solution.reverseString(actual);
    char[] expected = new char[] {'o','l','l','e','h'};
    assertArrayEquals(expected, actual);
  }
}
