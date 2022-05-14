package leetcode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * You have the four functions:
 * <p>
 * printFizz that prints the word "fizz" to the console,
 * printBuzz that prints the word "buzz" to the console,
 * printFizzBuzz that prints the word "fizzbuzz" to the console, and
 * printNumber that prints a given integer to the console.
 * <p>
 * You are given an instance of the class FizzBuzz that has four functions: fizz, buzz, fizzbuzz and number. The same instance of FizzBuzz will be passed to four different threads:
 * <p>
 * Thread A: calls fizz() that should output the word "fizz".
 * Thread B: calls buzz() that should output the word "buzz".
 * Thread C: calls fizzbuzz() that should output the word "fizzbuzz".
 * Thread D: calls number() that should only output the integers.
 * <p>
 * Modify the given class to output the series [1, 2, "fizz", 4, "buzz", ...] where the ith token (1-indexed) of the series is:
 * <p>
 * "fizzbuzz" if i is divisible by 3 and 5,
 * "fizz" if i is divisible by 3 and not 5,
 * "buzz" if i is divisible by 5 and not 3, or
 * i if i is not divisible by 3 or 5.
 * <p>
 * Implement the FizzBuzz class:
 * <p>
 * FizzBuzz(int n) Initializes the object with the number n that represents the length of the sequence that should be printed.
 * void fizz(printFizz) Calls printFizz to output "fizz".
 * void buzz(printBuzz) Calls printBuzz to output "buzz".
 * void fizzbuzz(printFizzBuzz) Calls printFizzBuzz to output "fizzbuzz".
 * void number(printNumber) Calls printnumber to output the numbers.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 15
 * Output: [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11,"fizz",13,14,"fizzbuzz"]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: [1,2,"fizz",4,"buzz"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 50
 */

public class FizzBuzzMultithreadedSolutionNo1195 {

  private int n;
  private int count;
  private final Lock mutex = new ReentrantLock(true);

  public FizzBuzzMultithreadedSolutionNo1195(int n) {
    this.n = n;
    count = 1;
  }

  // printFizz.run() outputs "fizz".
  public void fizz(Runnable printFizz) throws InterruptedException {
    for (; ; ) {
      mutex.lock();
      if (count > n) {
        mutex.unlock();
        return;
      }
      if (count % 3 == 0 && count % 5 != 0) {
        printFizz.run();
        count++;
      }
      mutex.unlock();
    }
  }

  // printBuzz.run() outputs "buzz".
  public void buzz(Runnable printBuzz) throws InterruptedException {
    for (; ; ) {
      mutex.lock();
      if (count > n) {
        mutex.unlock();
        return;
      }
      if (count % 3 != 0 && count % 5 == 0) {
        printBuzz.run();
        count++;
      }
      mutex.unlock();
    }
  }

  // printFizzBuzz.run() outputs "fizzbuzz".
  public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    for (; ; ) {
      mutex.lock();
      if (count > n) {
        mutex.unlock();
        return;
      }
      if (count % 3 == 0 && count % 5 == 0) {
        printFizzBuzz.run();
        count++;
      }
      mutex.unlock();
    }
  }

  // printNumber.accept(x) outputs "x", where x is an integer.
  public void number(IntConsumer printNumber) throws InterruptedException {
    for (; ; ) {
      mutex.lock();
      if (count > n) {
        mutex.unlock();
        return;
      }
      if (count % 3 != 0 && count % 5 != 0) {
        printNumber.accept(count);
        count++;
      }
      mutex.unlock();
    }
  }

  public static void main(String[] args) {


    FizzBuzzMultithreadedSolutionNo1195 fizzBuzz = new FizzBuzzMultithreadedSolutionNo1195(15);

    Runnable fizz = () -> System.out.print("fizz");
    Runnable buzz = () -> System.out.print("buzz");
    Runnable fBuzz = () -> System.out.print("fizzbuzz");

    IntConsumer number = System.out::print;

    new Thread(() -> {
      try {
        fizzBuzz.fizz(fizz);
      } catch (InterruptedException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }).start();

    new Thread(() -> {
      try {
        fizzBuzz.buzz(buzz);
      } catch (InterruptedException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }).start();

    new Thread(() -> {
      try {
        fizzBuzz.fizzbuzz(fBuzz);
      } catch (InterruptedException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }).start();

    new Thread(() -> {
      try {
        fizzBuzz.number(number);
      } catch (InterruptedException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }).start();

  }

}
