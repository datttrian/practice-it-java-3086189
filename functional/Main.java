package functional;

import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    Function<Integer, Integer> square = (n) -> n * n;
    Function<Integer, Integer> add = (n) -> n + n;
    int result = square.andThen(add).apply(5);
    System.out.println(result);
  }

}
