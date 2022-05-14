package leetcode;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * Example 1:
 * <p>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * Example 2:
 * <p>
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * <p>
 * Constraints:
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 */
public class ReverseStringSolutionNo344 {
  public void reverseString(char[] s) {
    int start = 0;
    int end = s.length - 1;
    char c = '\n';
    for (int i = 0; i < s.length / 2; i++) {
      c = s[start];
      s[start] = s[end];
      s[end] = c;
      start++;
      end--;
    }
  }
}
