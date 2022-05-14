package leetcode.test;

import leetcode.FizzBuzzSolutionNo412;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FizzBuzzTestNo412 {

  @ParameterizedTest
  @DisplayName("check vs generated string")
  @CsvSource({ "'1,2,Fizz', 3", "'1,2,Fizz,4,Buzz', 5", "'1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz', 15"})
  public void testWithStringParameter(String expectedAsString, int nr) {
    FizzBuzzSolutionNo412 solution = new FizzBuzzSolutionNo412();
    List<String> actual = solution.fizzBuzz(nr);
    List<String> expected = Arrays.asList(expectedAsString.split(","));
    assertTrue(expected.equals(actual));
  }
}
