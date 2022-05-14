package leetcode.test;

import leetcode.PowerOfThreeSolutionNo326;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PowerOfThreeTestNo326 {

  private PowerOfThreeSolutionNo326 solution = null;

  @BeforeEach
  public void setUp() {
    solution = new PowerOfThreeSolutionNo326();
  }

  @Test
  @DisplayName("test if 0 is power of 3")
  public void testWithZero() {
    final int nr = 0;
    assertAll("0 power of 3?",
        () -> assertFalse(solution.isPowerOfThreeLoop(nr)),
        () -> assertFalse(solution.isPowerOfThreeBaseConversion(nr)),
        () -> assertFalse(solution.isPowerOfThreeLoop(nr))
    );
  }

  @Test
  @DisplayName("test if 27 is power of 3")
  public void testWith27() {
    final int nr = 27;
    assertAll("27 power of 3?",
        () -> assertTrue(solution.isPowerOfThreeLoop(nr)),
        () -> assertTrue(solution.isPowerOfThreeBaseConversion(nr)),
        () -> assertTrue(solution.isPowerOfThreeLoop(nr))
    );
  }

}
