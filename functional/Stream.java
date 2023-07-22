package functional;

import java.util.Arrays;

public class Stream {
  public static void main(String[] args) {
    int[] numbers = { 0, 2, 4, 6, 8, 10 };

    Arrays.stream(numbers).parallel().forEach(n -> System.out.print(n + 1 + " "));

  }
}
