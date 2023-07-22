package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
  public static void main(String[] args) {
    int[] numbers = { 0, 2, 4, 6, 8, 10 };

    Arrays.stream(numbers).parallel().forEach(n -> System.out.print(n + 1 + " "));

    List<String> veggies = List.of("spinach", "cabbage", "peas", "green beans", "brussels sprouts", "carrots");

    System.out.println(veggies.stream().anyMatch(v -> v.contains(" ")));
    System.out.println(veggies.stream().allMatch(v -> v.contains(" ")));

    veggies.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);

    veggies.stream().map(String::toUpperCase).forEach(System.out::println);

    List<Integer> numberList = List.of(2, 4, 6, 8, 10);

    System.out.println(numberList.stream().reduce(0, (a, b) -> a + b));

    System.out.println(veggies.stream().sorted().reduce("", (a, b) -> a + " | " + b));

    veggies.stream().filter(v -> v.endsWith("s")).collect(Collectors.toList()).forEach(System.out::println);
  }
}
