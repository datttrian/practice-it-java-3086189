package functional;

import java.util.List;
import java.util.function.Consumer;

public class Country {
  public static void main(String[] args) {
    List countries = List.of("Australia", "China", "France", "Italy");
    Consumer print = c -> System.out.println(c);
    countries.forEach(print);

    print.accept("Hello");
  }
}
